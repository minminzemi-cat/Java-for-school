class X{
    X(){
        System.out.println("[X]");
    }
        void a(){
            System.out.println("[x.b]");
        }
        void b(){
            System.out.println("[x.b]");
        }
    }

class Y extends X{
    void Y(){
        System.out.println("[Y]");
    }
    void a(){
        System.out.println("[y.a]");
    }
}


public class Practice7_2 {
    public static void main(String[] args) {
        X x = new X();
        x.a();
        x.b();
        Y y = new Y();
        y.a();
        y.b();
    }
}
