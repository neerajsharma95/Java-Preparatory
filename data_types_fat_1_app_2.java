import java.util.Scanner;
import java.text.*;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        double branding, travel, food, logistic, total=0;
        branding = obj.nextDouble();
        travel = obj.nextDouble();
        food = obj.nextDouble();
        logistic = obj.nextDouble();
        DecimalFormat d = new DecimalFormat("0.00");
        total = branding+travel+food+logistic;
        System.out.println("Total expenses : Rs."+d.format(total));
        System.out.println("Branding expenses percentage :"+d.format((branding/total)*100)+"%");
        System.out.println("Travel expenses percentage :"+d.format((travel/total)*100)+"%");
        System.out.println("Food expenses percentage :"+d.format((food/total)*100)+"%");
        System.out.println("Logistics expenses percentage :"+d.format((logistic/total)*100)+"%");
    }
}