
/**
 * Write a description of class sanguko here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class mucha1
{
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
    int num;
    do{
     System.out.print("Enter a number [1-100]");
      num = sc.nextInt();
    }
     while (num < 1 || num > 100);
     System.out.println("You entered" + num);
    }
} 