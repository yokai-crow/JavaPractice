class mainthread extends Thread{
    private String classname;
    public mainthread(String classname){
        this.classname = classname;
    }
    public void run(){
        for(int i =1; i <=10; i++){
            System.out.println(classname + " iteration " + i);
        }
    }
}
class apu extends mainthread{
    public apu(){
        super("apu");
    }
}
class apiit extends mainthread{
    public apiit(){
        super("apiit");
    }
}
public class qnoone{
    public static void main(String args[]){
        apu a = new apu();
        apiit aa = new apiit();
        a.start();
        aa.start();
    }
}