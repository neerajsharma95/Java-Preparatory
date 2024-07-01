import java.util.Scanner;
abstract class marks{
    abstract void getPercentage();
}
class A extends marks{
    int Marks1, Marks2, Marks3;
    public A(int Marks1, int Marks2, int Marks3){
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
    }
    void getPercentage(){
        double total = Marks1+Marks2+Marks3;
        double percentage = total/3;
        System.out.printf("%.2f",percentage);
    }
}
class B extends marks{
    int Marks1, Marks2, Marks3, Marks4;
    public B(int Marks1, int Marks2, int Marks3, int Marks4){
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
        this.Marks4 = Marks4;
    }
    void getPercentage(){
        double total = Marks1+Marks2+Marks3+Marks4;
        double percentage = total/4;
        System.out.printf("\n%.2f",percentage);
    }
}
class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int m1 = obj.nextInt();
        int m2 = obj.nextInt();
        int m3 = obj.nextInt();
        int m4 = obj.nextInt();
        int m5 = obj.nextInt();
        int m6 = obj.nextInt();
        int m7 = obj.nextInt();
        
        A x = new A(m1,m2,m3);
        B y = new B(m4,m5,m6,m7);
        
        x.getPercentage();
        y.getPercentage();
    }
}