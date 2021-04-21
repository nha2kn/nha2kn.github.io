
package lab2;


public class Lab2_bt1 {
    
    public static void main(String[] args) {
            
            Rectangle rectangle = new Rectangle(5,10);
            System.out.println(rectangle);
    }
    }
    class Rectangle{
        
        private double length;
        private double width;
        
        public Rectangle(){
            
        }
        public Rectangle(double length,double width){
            this.length = length;
            this.width = width;
        }
       public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }
        public double perimeter() {
            return 2 * (length+width);
        }
        public double area(){
            return length * width;
        }
        public String toString(){
            return "Length = "+ length +"\nWidth = "+ width+ "\nPerimeter = "+perimeter()+"\nArea = "+area();
        }
    }
        
