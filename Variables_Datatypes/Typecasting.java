public class Typecasting{
    public static void main(String[] args) {
        int num=10;
        double d=num;
        System.out.println("Implicit type casting");
        System.out.println("Integer value"+num);
        System.out.println("Double value"+d);
        double price=99.9;
        int p=(int) price;
        System.out.println("Explicit type casting");
        System.out.println("Double value"+price);
        System.out.println("Integer value"+p);
    }
}