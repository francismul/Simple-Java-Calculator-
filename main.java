import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // scanner object
        Scanner sinput = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to Simple Calculator");
   
        while(true) {
           System.out.print("Choose an operation: (+, -, *, /): ");
           char operation = sinput.next().charAt(0);
           
           System.out.print("Enter first number: ");
           double num1 = sinput.nextDouble();
           
           System.out.print("Enter first number: ");
           double num2 = sinput.nextDouble();
           
           double result = 0;
           switch (operation) {
               case '+':
                   result = num1 + num2;
                   break;
               case '-':
                   result = num1 - num2;
                   break;
               case '*':
                   result = num1 * num2;
                   break;
               case '/':
                   if (num2 > 0) {
                       result = num1 / num2;
                   } else {
                       System.out.println("Error: This kind of division is not allowed.");
                       continue;
                   }
                   break;
           }
           System.out.println("Result: " + result);
           System.out.print("Do you want to perform another calculation (Y/n): ");
           String choice = sinput.next();
           if (!choice.equalsIgnoreCase("y")){
               System.out.println("Exiting ....");
               break;
           }
        }
        sinput.close();
    }
}