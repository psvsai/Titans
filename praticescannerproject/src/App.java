import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String name = scan.next();
      int age = scan.nextInt();
      String address = scan.next();
      int phnnumber = scan.nextInt();
      String subjectname = scan.next();
      int marks = scan.nextInt();
      int adult = scan.nextInt();

      System.out.println("Enter u r name is " + name);
      System.out.println("Entered u r age is " + age);
      System.out.println("Entered u r address is " + address);
      System.out.println("Entered u r number " + phnnumber);
      System.out.println("Entered u r subjectname " + subjectname);
      System.out.println(" marks that he got " + marks );
      System.out.println("is the person is adult or not " + adult);

      if (age < 24){
        System.out.println("is the age is less than 18");
      }
      else{
        System.out.println("is the age is greater than 18");
      }

      if (marks < 35){
        System.out.println("if the marks are less than 35 than he is fail ");
      }
      else{
        System.out.println("if the marks are greater than 35 then he is pass");
      }
      if (adult < 18) {
        System.out.println("if the age is less than 18 consider as a pedstrian");
      }
      else{
        System.out.println("if the age is greater than 18 consider as a adult");
      }

    }
}
