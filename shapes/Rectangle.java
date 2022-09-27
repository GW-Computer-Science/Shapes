package shapes;

public class Rectangle{
    private double l, w;


    public Rectangle(){
        l = 1;
        w = 1;
    }

    
    public Rectangle(double len){
        l = len;
        w = len;
    }

    
    public Rectangle(double len, double wid){
        l = len;
        w = wid;
    }

    
    public void setLength(double len){
        l = len;
    }

    
    public void setWidth(double wid){
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