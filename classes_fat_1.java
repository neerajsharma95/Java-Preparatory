import java.util.Scanner;
class Main
{
    Main(int day){
        if(day <= 7){
        switch(day)
        {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
           default:
                System.out.print("Weekend");
                break;
        }}
        else{
            System.out.print("Invalid");
        }
        
    }
    
    public static void main(String s[])
    {
        int d;
        Scanner in=new Scanner(System.in);
        d=in.nextInt();
        Main obj=new Main(d);
        
    }
}

