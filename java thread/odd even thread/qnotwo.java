class even extends Thread{
    public void run(){
        System.out.println("even");
        for(int i = 1; i <= 50; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread{
    public void run(){
        System.out.println("odd");
        for(int i = 1; i <= 50; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
public class qnotwo{
    public static void main(String args[]){
        even e = new even();
        odd o = new odd();
        e.start();
        o.start();
    }
}