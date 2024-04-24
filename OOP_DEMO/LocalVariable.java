package OOP_DEMO;

public class LocalVariable {
    public static void main(String[] args){
        Phone p = new Phone();
        p.setBrand("Samsung");
        p.setPrice(30);
        System.out.println("brand from the object in heap memory: " + p.getBrand());
        System.out.println("price from the object in heap memory: " + p.getPrice());
    }
}

class Phone{
    private int price;
    private String brand;
    public void setPrice(int price){ //30 int price = 30
        this.price =  price; //30
        System.out.println("price from the setPrice stack of method/ class memory: " + price);
    }
    public int getPrice(){
        return price;
    }
    public void setBrand(String brand){
        this.brand = brand;
        System.out.println("brand from the setBrand stack of method/ class memory: " + brand);
    }
    public String getBrand(){
        return brand;
    }
}
