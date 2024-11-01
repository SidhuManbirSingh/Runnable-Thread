class A implements Runnable {
    A(){
    }
    public void run() {
        for(int i = 0; i <100;i++) {
        System.out.println(i + " A");
        // try {
        //     Thread.sleep(100);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
    }
}

class B  implements Runnable {
    B(){
    }
    public void run() {
        for(int i = 0; i <100;i++) {
            System.out.println( i + "\tB");
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 0; i <100;i++) {
            System.out.println(i + " A");
            // try {
            //     Thread.sleep(100);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }
    };

        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
