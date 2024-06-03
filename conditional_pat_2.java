import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        if(age>=15)
        System.out.println("Adult Ticket");
        else
        System.out.println("Child Ticket");
    }
}