package shapes;

public class Rectangle extends java.lang.Object{
    private double l, w;


    public Rectangle(){
        l = 1;
        w = 1;
    }

    
    public Rectangle(double len){
        if(len <= 0){
      throw new IllegalArgumentException("The length of a rectangle must be positive");
    }
        
        l = len;
        w = len;
    }

    
    public Rectangle(double len, double wid){
        if(len <= 0){
      throw new IllegalArgumentException("The length of a rectangle must be positive");
    } else if(wid <=0){
      throw new IllegalArgumentException("The width of a rectangle must be positive");
        }
        
        l = len;
        w = wid;
    }

    
    public void setLength(double len){
        if(len <= 0){
      throw new IllegalArgumentException("The length of a rectangle must be positive");
    }
        
        l = len;
    }

    
    public void setWidth(double wid){
        if(wid <= 0){
      throw new IllegalArgumentException("The width of a rectangle must be positive");
    }
        
        w = wid;
    }

    
    public double getLength(){
        return l;
    }

    
    public double getWidth(){
        return w;
    }

    
    public double getArea(){
        return (l * w);
    }


    public double getPerimeter(){
        return 2*(l+w);
    }


    public boolean equals(Rectangle r){
        if(l == r.getLength() && w == r.getWidth()){
            return true;
        }
        return false;
    } 


    public String toString(){
        return ("rectangle with length " + l + ", width " + w);
    }
}
