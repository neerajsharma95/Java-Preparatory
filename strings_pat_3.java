// You are using Java
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        str1 = str1.replaceAll(" ","");
        System.out.println(str1);
    }
}
