//class Rectangle{
//    int lenght, width;
//    public int calculateArea(){
//        return(lenght * width);
//    }
//}
//
//public class runner{
//    public static void main(String[] args) {
//        Rectangle rect  = new Rectangle();
//        rect.lenght = 10;
//        rect.width = 10;
//        System.out.println(rect.calculateArea());
//    }
//}

//class Rectangle {
//    public int length, width;
//    public Rectangle() {
//        length = 5;
//        width = 2;
//    }
//    public Rectangle(int l, int w) {
//        length = l;
//        width = w;
//    }
//    public int Calculatearea() {
//        return (length * width);
//    }
//}
//
//public class runner {
//    public static void main(String args[]) {
//        Rectangle rect = new Rectangle();
//        System.out.println(rect.Calculatearea());
//        Rectangle rect1 = new Rectangle(10,20);
//        System.out.println(rect1.Calculatearea());
//    }
//}

class Point {

    private int x;
    private int y;

    public Point() {
        x = 1;
        y = 2;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }
    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = "
                + y);
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
        System.out.println("x coordinate after moving = " + x + " y
                coordinate after moving = " + y);
    }

}


public class runner {

    public static void main(String args[]) {

        Point p1 = new Point();
        p1.movePoint(2, 3);

        p1.display();

        Point p2 = new Point();
        p2.movePoint(2, 3);
        p2.display();

    }

}