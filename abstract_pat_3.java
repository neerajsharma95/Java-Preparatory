// You are using Java
import java.util.Scanner;
interface UpperCaseMover{
    String MoveUpperCase(String input);
}
class Demo implements UpperCaseMover{
    public String MoveUpperCase(String input){
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)){
            upper.append(c);
            }
            else{
                lower.append(c);
            }
        }
        return lower.append(upper).toString();
    }
}
class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        
        Demo d = new Demo();
        String result = d.MoveUpperCase(str);
        System.out.println(result);
    }
}