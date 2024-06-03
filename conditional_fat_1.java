import java.util.Scanner;
class Demo{
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    char red;
    int points = obj.nextInt();
    if(points < 1 || points > 9)
    System.out.println("Invalid Input");
    else
    {
    red = obj.next().charAt(0);
    if(red == 'r'){
        System.out.println(points+5);
    }
    else{
       System.out.println(points); 
    }
}
    
}
}