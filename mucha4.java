
/**
 * Write a description of class mucha4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mucha4
{
   public static void main(String [] args){
    int [] arrays = {5,3,9,1,7};
    int min = arrays[0];
    int max = arrays[0];
    
    for (int i = 1; i < arrays.length; i++){
     if (arrays[i] < min) min = arrays[i];
     if (arrays[i] > max) max = arrays[i];
    }
     System.out.println("Min: " + min);
     System.out.println("Max: " + max);
    }
}