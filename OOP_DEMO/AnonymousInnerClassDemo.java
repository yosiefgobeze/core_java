package OOP_DEMO;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Music m = new Music();
        m.playMusic();

        Music.AfricanMusic ma = m.new AfricanMusic();
        ma.playMusic();

        Music pm = new Music(){ // Anonymous inner class 
            public void playMusic(){ 
                System.out.println("Playing pop music .....");
            }
        };
        pm.playMusic();
    }
}

class Music{
    public void playMusic(){
        System.out.println("Playing generic music ......");
    }

    class AfricanMusic{
        public void playMusic(){
            System.out.println("Playing african music .....");
        }
    }
}

