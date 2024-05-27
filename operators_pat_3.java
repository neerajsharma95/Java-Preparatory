import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        int length,breadth;
        double area = 0;
        Scanner obj = new Scanner(System.in);
        length = obj.nextInt();
        breadth = obj.nextInt();
        if(length>0&&breadth>0){
            area = length*breadth;
            System.out.println(area);
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}