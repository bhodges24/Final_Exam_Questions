package QuestionC;

import java.io.*;
/**
 * Custom class for throwing an IllegalRectangle exception
 */
public class IllegalRectangleException extends Exception
{
   private double lengthY;
   private double widthX;
   /**
    * Create an instance of the IllegalRectangle class, to be thrown to the caller
    */
   public IllegalRectangleException(double lengthY, double widthX)
   {
      this.lengthY = lengthY;
      this.widthX = widthX;
   } 
   
   public double getLength()
   {
      return lengthY;
   }
   
   public double getWidthX()
   {
      return widthX;
   }
}
