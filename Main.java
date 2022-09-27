import shapes.*;

class Main {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle();

    RegularPolygon p1 = new RegularPolygon(4, 2.0);
      
    System.out.println(p1.getArea());
  }
}