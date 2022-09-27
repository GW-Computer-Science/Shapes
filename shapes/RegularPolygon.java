package shapes;

import java.lang.Math;

public class RegularPolygon {
    private int sides;
    private double sideLength;
    final double pi = 3.14159;

    
    public RegularPolygon(){
        sides = 3;
        sideLength = 1;
    }

    
    public RegularPolygon(int s){
        if(s < 3){
            throw new IllegalArgumentException("The number of sides in a regular polygon must be 3 or greater");
        }
        
        sides = s;
        sideLength = 1;
  }

    
    public RegularPolygon(double sL){
        if(sL <= 0){
            throw new IllegalArgumentException("The length of a side must be positive");
        }
        
        sides = 3;
        sideLength = sL;
    }

    
    public RegularPolygon(int s, double sL){
        if(s < 3){
            throw new IllegalArgumentException("The number of sides in a regular polygon must be 3 or greater");
        } else if(sL <= 0){
            throw new IllegalArgumentException("The length of a side must be positive");
        }
        
        sides = s;
        sideLength = sL;
    }

    
    public void setSideLength(double sL){
        if(sL <= 0){
            throw new IllegalArgumentException("The length of a side must be positive");
        }
        
        sideLength = sL;
    }

    
    public void setNumSides(int s){
        if(s < 3){
            throw new IllegalArgumentException("The number of sides in a regular polygon must be 3 or greater");
        }
        
        sides = s;
    }

    
    public int getNumSides(){
        return sides;
    }

    
    public double getSideLength(){
        return sideLength;
    }

    
    public double getArea(){
        return ((sideLength * sideLength) * sides) / (4 * Math.tan(pi / sides));
    }

    
    public double getPerimeter(){
        return (sideLength * sides);
    }

    
    public boolean equals(RegularPolygon r){
        if(sides == r.getNumSides() && sideLength == r.getSideLength()){
            return true;
        }
        return false;
  }


    public String toString(){
        if(sides == 3){
            return ("equilateral triangle with side length " + sideLength);
        }
        else if(sides == 4){
            return ("square with side length " + sideLength);
        }
        else if(sides == 5){
            return ("pentagon with side length " + sideLength);
        }
        else if(sides == 6){
            return ("hexagon with side length " + sideLength);
        }
        else if(sides == 7){
            return ("heptagon with side length " + sideLength);
        }
        else if(sides == 8){
            return ("octagon with side length " + sideLength);
        }
        else if(sides == 9){
            return ("nonagon with side length " + sideLength);
        }
        else if(sides == 10){
            return ("decagon with side length " + sideLength);
        }
        else if(sides == 11){
            return ("undecagon with side length " + sideLength);
        }
        else if(sides == 12){
            return ("dodecagon with side length " + sideLength);
        }
        else if(sides == 13){
            return ("tridecagon with side length " + sideLength);
        }
        else if(sides == 14){
            return ("tetradecagon with side length " + sideLength);
        }
        else if(sides == 15){
            return ("pentadecagon with side length " + sideLength);
        }
        else if(sides == 16){
            return ("hexadecagon with side length " + sideLength);
        }
        else if(sides == 17){
            return ("heptadecagon with side length " + sideLength);
        }
        else if(sides == 18){
            return ("octadecagon with side length " + sideLength);
        }
        else if(sides == 19){
            return ("enneadecagon with side length " + sideLength);
        }
        else if(sides == 20){
            return ("icosagon with side length " + sideLength);
        }
        else{
            return (sides + "-sided polygon with side length " + sideLength);
        }
    }
}
