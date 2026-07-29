// import java.net.http.HttpResponse;

abstract class Shape{
   
    abstract void draw();
}

class PolyLine extends Shape {
    void draw(){
       
        System.out.println("PolyLine");
    }
}

class Rectangle extends Shape{
    void draw(){
       
        System.out.println("Rectangle");
    }
}

class Circle extends Shape{
    void draw(){
       
        System.out.println("Circle");
    }

}

class Polygon extends PolyLine implements HasGetAreaMethod{
    public double getArea(){
        
    }
}

public class ObjectExample {
    public static void main(String[] args) {


        //Shape shape = new Shape;

        HasGetAreaMethod[]  closedShapes = new HasGetAreaMethod[3];
        closedShapes[0] = new Polygon();

        Shape[] shapes = new Shape[3];
        shapes[0] = new PolyLine();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        for(int i = 0; i < 3; i++){
            shapes[0].draw();
        }
    }
}
