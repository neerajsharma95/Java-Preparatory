import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int ticket = obj.nextInt();
        int last_digit = 0;
        last_digit = ticket%10;
        if(last_digit==3||last_digit==8){
            System.out.println("Lucky Winner");
        }
        else{
            System.out.println("Not a Lucky Winner");
        }
    }
}