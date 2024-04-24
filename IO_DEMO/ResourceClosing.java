package IO_DEMO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Using only try block with not catch or finally will raise an error
 * but you can use try ...catch or try ...finally or try ...catch ...finally 
 * finally is usually used to close resources, because regardless of the exception finally will get executed
 * but with the new java feature only try block can  be used too
 */
public class ResourceClosing {
    public static void main(String[] args) throws IOException{
        // 1. first scenario using a finally to close resources
        Scanner sc = null;
        try{
        // always it is appropriet to close resources like database connection, file reader and so on
        
        sc = new Scanner(System.in);
        // dependending on the use you can convert to the appropriet type
        int age = Integer.parseInt(sc.nextLine());
        }finally{
        sc.close();
        } 
        
        // 2. secondly using only the try block for classes which are closeable (try with resources)
        // BufferedReader extends Reader and Reader implementes closeable and closeable implements the Autocloseable
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
        // always it is appropriet to close resources like database connection, file reader and so on
        // dependending on the use you can convert to the appropriet type
        int age = Integer.parseInt(bf.readLine());
        }
    }   
}
