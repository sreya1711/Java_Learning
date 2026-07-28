public class LogicalOperator{
    public static void main(String[] args){
        int age=20;
        int marks=85;
        System.out.println(age>=18 && marks>=40);
        System.out.println(age<18 || marks>=40);
        System.out.println(!(age>=18));
    }
}