
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 500;
        p1.y = 600;
        p1.translate(400,200);
        Point p2 = p1.translated(-400,-200);
        System.out.println(p1.toSvg());



    }
}