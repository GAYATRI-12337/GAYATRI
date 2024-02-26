import java.util.Scanner;
class Student{
    String fullName;
    int rollNum;
    double semPerentage;
    String collegeName;
    int collegeCode;
    Student(String name,int rollno,double percentage,String colname,int colcode)
  {
     this.fullName = name;
     this.rollNum = rollno;
     this.semPerentage = percentage;
     this.collegeName = colname;
     this.collegeCode = colcode;
     System.out.println("Student name : "+fullName);
     System.out.println("Student rollno : "+rollno);
     System.out.println("Student sempercentage : "+semPerentage);
     System.out.println("Student collegename : "+collegeName);
    System.out.println("Student collegeCode : "+collegeCode);
 }
}
class java{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String name,colname;
   int rollno,code;
  double percentage;
  System.out.println("Enter student name : ");
  name = sc.nextLine();
  System.out.println("Student rollno : ");
  rollno = sc.nextInt();
  System.out.println("Enter Sempercentage : ");
  percentage = sc.nextDouble();
  sc.nextLine();
  System.out.println("Enter collegeName : ");
  colname = sc.nextLine();
  System.out.println("Enter college code : ");
  code = sc.nextInt();
 Student gayatri = new Student(name,rollno,percentage,colname,code);
 }
 protected void finalize()  
{  
System.out.println("Object is destroyed by the Garbage Collector");  
}  
}
