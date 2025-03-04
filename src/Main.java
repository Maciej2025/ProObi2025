
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.setX(5);
        p1.setY(6);


        Point p2 = new Point(7,8);


        Segment s = new Segment(p1,p2);
        System.out.println(s);


        p1.setX(12);
        p1.setY(15);
        p2.setX(15);
        p2.setY(8);





    }

}



//konstruktor - tworzy nowe obiekty


