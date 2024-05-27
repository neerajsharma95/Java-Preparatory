import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String name  = obj.next();
        int age = obj.nextInt();
        System.out.println(name+"age is "+age);
    }
}