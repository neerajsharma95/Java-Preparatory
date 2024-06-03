import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        if(age>=15)
        System.out.println("Welcome to the show");
        else
        System.out.println("Welcome to the show\nPlease note that you should be accompanied by an adult");
    }
}