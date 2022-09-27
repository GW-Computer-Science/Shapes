package shapes;

public class Circle extends java.lang.Object{
    final double pi = 3.14159;
    private double r;


    public Circle(){
        r = 1;
    }


    public Circle(double rad){
        if(rad <= 0){
      throw new IllegalArgumentException("The radius of a circle must be positive");
    }
        
        r = rad;
    }


    public double getArea(){
        return (pi * r * r);
    }


    public double getCircumference(){
        return (2 * pi * r);
    }


    public double getRadius(){
        return r;
    }


    public void setRadius(double rad){
        if(rad <= 0){
      throw new IllegalArgumentException("The radius of a circle must be positive");
    }
        
        r = rad;
    }


    public boolean equals(Circle c){
        if(r == c.getRadius()){
            return true;
        }
        return false;
    }


    public String toString(){
        return ("circle with radius " + r);
    }
}
