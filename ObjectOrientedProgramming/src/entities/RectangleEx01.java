package entities;

public class RectangleEx01 {
    
   public double Width;
   public double Height;

   public double Area() {
      return Width * Height;
   }

   public double Perimeter() {
      return 2.0 * (Width + Height);
   }

   public double Diagonal() {
      return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
   }

}
