import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        double branding, travel, food, logistic, total=0;
        branding = obj.nextDouble();
        travel = obj.nextDouble();
        food = obj.nextDouble();
        logistic = obj.nextDouble();
        total = branding+travel+food+logistic;
        System.out.printf("Total expenses : Rs.%.2f",total);
        System.out.printf("\nBranding expenses percentage : %.2f%%",(branding/total)*100);
        System.out.printf("\nTravel expenses percentage : %.2f%%",(travel/total)*100);
        System.out.printf("\nFood expenses percentage : %.2f%%",(food/total)*100);
        System.out.printf("\nLogistics expenses percentage : %.2f%%",(logistic/total)*100);
    }
}