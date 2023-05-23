import com.figures.figures.*;
import com.figures.quadrangl.*;
import com.figures.triangles.*;


public class Main {
    public static void main(String[] args) {

        Circle ci = new Circle("Circle", "individual", 5);
        System.out.println(ci.getPerimetr());
        System.out.println(ci.getArea());
        ci.display();

        Hexagon he = new Hexagon("Hexagon", "Individual", 10);
        System.out.println(he.getPerimetr());
        System.out.println(he.getArea());
        he.display();

        Oval ov = new Oval("Oval", "Individual", 2, 3);
        System.out.println(ov.getPerimetr());
        System.out.println(ov.getArea());
        ov.display();

        Pentagon pe = new Pentagon("Pentagon", "Individual", 4, 7);
        System.out.println(pe.getPerimetr());
        System.out.println(pe.getArea());
        pe.display();

        Convex co = new Convex("Convex", "quadrangl", 3, 4, 5, 6);
        System.out.println(co.getPerimetr());
        System.out.println(co.getArea());
        co.display();

        Parallelogram pa = new Parallelogram("Parallelogram", "quadrangl", 4, 5, 6);
        System.out.println(pa.getPerimetr());
        System.out.println(pa.getArea());
        pa.display();

        Quadrangl qu = new Quadrangl("Quandrangl", "quadrangl", 3, 4, 21, 4, 5 ,6, 3);
        System.out.println(qu.getPerimetr());
        System.out.println(qu.getArea());
        qu.display();

        Quadrate qt = new Quadrate("Quadrate", "quadrangl", 4);
        System.out.println(qt.getPerimetr());
        System.out.println(qt.getArea());
        qt.display();

        Rectangle re = new Rectangle("Rectangle", "quadrangl", 8, 9);
        System.out.println(re.getPerimetr());
        System.out.println(re.getArea());
        re.display();

        Rhomb rh = new Rhomb("Rhomb", "quadrangl", 5, 6);
        System.out.println(rh.getPerimetr());
        System.out.println(rh.getArea());
        rh.display();

        Trapezium tr = new Trapezium("Trapezium", "quadrangl", 4, 4, 4, 4, 5);
        System.out.println(tr.getPerimetr());
        System.out.println(tr.getArea());
        tr.display();

        Triangle tl = new Triangle("Triangle", "triangles", 4, 5, 4,5, 7);
        System.out.println(tl.getPerimetr());
        System.out.println(tl.getArea());
        tl.display();

        TriangleEquilateral tel = new TriangleEquilateral("TriangleEquilateral", "triangles", 4, 5);
        System.out.println(tel.getPerimetr());
        System.out.println(tel.getArea());
        tel.display();

        TriangleIsosceles tes = new TriangleIsosceles("TriangleIsosceles", "triangles", 4, 6);
        System.out.println(tes.getPerimetr());
        System.out.println(tes.getArea());
        tes.display();

        TriangleRight trt = new TriangleRight("Triangle Right", "triangles", 4, 9, 6);
        System.out.println(trt.getPerimetr());
        System.out.println(trt.getArea());
        trt.display();
    }
}