import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();
        if(marks<0)
        System.out.println("Invalid");
        else{
        if(marks>=85)
        System.out.println("A");
        else if(marks>=75)
        System.out.println("B");
        else if(marks>=65)
        System.out.println("C");
        else
        System.out.println("D");
        }
    }
}