class F extends Thread {
    F(){
    }
    public void run() {
        for(int i = 0; i <100;i++) {
        System.out.println(i + " A");
        try {
            Thread.sleep(0);
            
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }
}

class J extends Thread {
    J(){
    }
    public void run() {
        for(int i = 0; i <100;i++) {
            System.out.println( i + "\tB");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        F a = new F();
        J b = new J();
        a.start();
        b.start();
    }
}
