import java.util.Scanner;
/**
 * The cost of the pizza by its size
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //they are the stronge for amounts of money
  double LAB = 0.75;
  double POWER = 0.99;
  double DIA = 0.50;
  double HST = 0.13;

    // make a scannerfor user input
    Scanner input = new Scanner(System.in);
    // asking the user for pizza size
    System.out.println("What is the size of the pizza?");
    // stating variable
    int size = input.nextInt();
    double subtotal,taxs,total;
    // make the calculation the pizza
    subtotal = (DIA * size) + LAB + POWER;
    taxs = subtotal * HST;
    total = taxs + subtotal;
    // print out to the screen the subtotal,taxs,total
    System.out.println("Subtotal: $" + subtotal);
    System.out.println("taxs: $" + taxs);
    System.out.println("total: $" + total);
    // make a statement on the size is smaller then 20
    if(size >= 1 && size <= 20){
      System.out.println("We are going to make you a cute little pizza");
    // make a statement on the size being greater than 20
    }else if(size > 20 && size < 40){
      System.out.println("This will be delicious!");
    // make a statement on the size being greater than 40
    }else if( size > 40){
      System.out.println("Whoa, big pizza! You might need a truck to get this home");
    }
    

    
    
  }
}
