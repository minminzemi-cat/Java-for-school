interface I{}
abstract class A{}
class B extends A{}
class C implements I{}

public class Example{
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        I i = new I();
        A b2 = new B();
        B a2 = new A();
        I b3 = new B();
        I c2 = new C(); 
    }
}
