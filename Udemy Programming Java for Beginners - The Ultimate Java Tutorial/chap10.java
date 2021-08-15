import java.util.Scanner;
public class chap10 {
    public static void main(String[] args){
        double amount;
        Scanner one = new Scanner(System.in);
        System.out.print("Enter the amount of bill: ");
        amount = one.nextDouble();
        
        System.out.println("You should tip "+tipAmount(amount)+"$\n");


        double price,discount;
        Scanner two = new Scanner(System.in);
        System.out.print("Enter the item price: ");
        price = two.nextDouble();
        System.out.print("Enter the price discount in %: ");
        discount = two.nextDouble();
        one.close();
        two.close();
        extracted(price, discount);

    }
    private static void extracted(double price, double discount) {
        System.out.println("Your item discount is: "+discountCal(price,(discount/100))+"$ and your item will cost you "+(price-discountCal(price,(discount/100))+"$"));
    }
    static double tipAmount(double x){return (x *= 0.15);}
    static double discountCal(double x, double y){return (x*=y);}
}
