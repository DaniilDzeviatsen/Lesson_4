import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        CreditCard num1=new CreditCard(1234, 1000);
        num1.fill();
                CreditCard num2=new CreditCard(9550, 2100);
                num2.fill();
                CreditCard num3=new CreditCard(1220, 1500);
        num3.wthr();
        num1.info();
        num2.info();
        num3.info();
        System.out.println("Общая сумма на всех картах:");
        int osum=num1.sum+num2.sum+num3.sum;
        System.out.println(osum);
    }
}
