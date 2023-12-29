class goodmorning extends Thread{
    public void run(){
        System.err.println("good morning");
        try{
            Thread.sleep(7000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Welcome extends Thread{
    public void run(){
        System.out.println("Welcome");
        step();
    }
    private void step(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class qnothree{
    public static void main(String args[]){
        goodmorning g = new goodmorning();
        Welcome w = new Welcome();
        g.start();
        w.start();
    }
}