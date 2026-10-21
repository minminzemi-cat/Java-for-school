package J0916;

class MyThread extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("MyThreadのrunメソッド(" + i + ")");

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
            }
        }
    }
}


class MyThread2 extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("MyThreadのrunメソッド(" + i + ")");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            }
        }
    }
}


public class SimpleThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

         MyThread2 t2 = new MyThread2();
        t.start();

        for(int i = 0;i<100;i++){
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");

            try{
                Thread.sleep(600);
            }
            catch(InterruptedException e){
            }
        }

    }
}
