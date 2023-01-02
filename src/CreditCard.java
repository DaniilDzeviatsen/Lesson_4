import java.util.Scanner;

public class CreditCard {
    int num;
    int sum;

        public CreditCard (int num, int sum){
        this.num=num;
        this.sum=sum;
    }
    int fill (){
        System.out.println("Введите сумму пополнения карты "+num);
        Scanner sc=new Scanner (System.in);
        int dep=sc.nextInt();
        sum+=dep;
        System.out.println("Сумма на счете карты "+num+":");
        System.out.println(sum);
        return sum;
    }
    int wthr(){
        System.out.println("Введите сумму, которую хотите снять с карты "+num);
        Scanner sc=new Scanner(System.in);
        int am=sc.nextInt();
        sum-=am;
        System.out.println("Сумма на счете карты "+ num+":");
        System.out.println(sum);
        return sum;
    }
    public void  info(){
        System.out.println("Сумма на счете вашей карты "+num);
                System.out.println(sum);

    }

    }
