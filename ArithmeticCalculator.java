import java.util.Scanner;
public class ArithmeticCalculator
{ 
   public static void main(String[ ] args0
{
      Scanner scanner = newScanner(System.in);
System.out.print(“Enter first number: “);
     double num1 = scanner.nextDouble();
System.out.print(“Enter second number: “);
     Double num2 = scanner.nextDouble();
System.out.println(“1.Addition(+)”);
System.out.println(“2.Substraction(-)”);
System.out.println(“3.Multiplication(*)”);
System.out.println(“4.Division(/)”);
System.out.println(“Enter your choice: ”);
    Int choice = scanner.nextInt();
double result = 0;
switch(choice
{
    case 1:
      result = num1+num2;
      break;
  
 case 2:
      result = num1-num2;
      break;
 case 3:
      result = num1*num2;
      break;
 case 4:
if(num2!=0)
{
      result = num1/num2;
      break;
}
else
{
  System.out.println(“Error! Division by zero is not allowed.”);
  return;
}
break;
default;
System.out.println(“Invalid choice!”);
return;
}
System.out.println(“Result: “ + result);
scanner.close();
}
}

