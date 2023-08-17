import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature ");

        int degree=sc.nextInt();
        String activity="";

        if(degree<=5){
            activity="ski";
        }else if(degree<=15){
            activity="Theater";
        }else if(degree<=25){
            activity="Barbecue";
        }else if(degree>25){
            activity="Swimming";
        }
        System.out.println(activity+" will be a good idea for you");
    }
}
