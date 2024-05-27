import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        char c = obj.next().charAt(0);
        if(a>0&&a<=200){
        System.out.println(a+(int)c);
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}