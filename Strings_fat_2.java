import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        System.out.println(str1.compareTo(str2));
    }
}
