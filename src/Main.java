public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1,1), 10f);

        System.out.println(circle);

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);

        CircleMovable circleMovable = new CircleMovable(new PointMovable(3,4),4.5);
        System.out.println(circleMovable);
        circleMovable.move(10,10);
        System.out.println(circleMovable);
    }
}
