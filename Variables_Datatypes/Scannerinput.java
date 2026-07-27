import java.util.Scanner;
public class Scannerinput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your CGPA: ");
        double cgpa=sc.nextDouble();
        System.out.println("Student DEtails");
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("cgpa:"+cgpa);
        sc.close();


    }
}