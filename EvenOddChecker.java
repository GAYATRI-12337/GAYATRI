public class EvenOddChecker
{
       public static void main(String[ ] args)
{
      int number = 17;
System.out.println(number + “ is “ + (isEven(number) ? “ even” : “odd”));
}
public static boolean isEven(int num)
{
       return num%2==0;
}
}
