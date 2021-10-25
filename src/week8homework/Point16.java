package week8homework;

public class Point16 {

    int x;
    int y;

    public Point16() {

    }

    public Point16(int x, int y) {// method 1

    }

    public int getX() {
        return x;
    }

    public int getY() {//method 2
        return y;
    }

    public void setX(int x) {// metd 3
        this.x = x;

    }

    public void setY(int y) {// metod 4
        this.y = y;
    }

    public double distance() { //method 5
        int dx = 0;
        int dy = 0;
        double result = Math.sqrt((this.x - dx) * (this.x - dx) + (this.y - dy) * (this.y - dy));
        return result;

    }

    public double distance(int x, int y) {
        double result = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return result;

    }

    public double distance(Point16 p) {
        double result = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return result;


    }

    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());











    }
}

