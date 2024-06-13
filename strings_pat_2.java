// You are using Java
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = "";
        int length = str1.length();
        for(int i=length-1;i>=0;i--){
            str2 = str2+str1.charAt(i);
        }
            if(str1.equals(str2))
            System.out.println(str1+":palindrome");
            else
            System.out.println(str1+":not a palindrome");
        
    }
}