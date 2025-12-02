
/**
 * Write a description of class Sangohan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mucha2
{ 
    public static void main(String[]args){
     int [] arrays = {7,1,7,3,5,7,2,9,7,4};
     int count = 0;
      
     for (int x : arrays){
         if (x == 7) count++;
        }
    System.out.println("Number of 7s:" + count);
  }
}