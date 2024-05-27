import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt();
        if(x>0&&y>0&&z>0){
          System.out.println(-x+y*z);  
        }
        else{
            System.out.println("Invalid");
        }
    }
}