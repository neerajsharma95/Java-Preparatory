import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        char c = obj.next().charAt(0);
        if((c>=65&&c<=90)||(c>=97&&c<=122)){
            int x = (int)c;
            System.out.println("int:"+x);
            float y = (float)c;
            System.out.println("float:"+y);
            byte z = (byte)c;
            System.out.println("byte:"+z);
            short p = (byte)c;
            System.out.println("short:"+p);
            
        }
        else{
            System.out.println("Invalid");
        }
    }
}