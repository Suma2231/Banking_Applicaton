import java.util.Scanner;
public class Banking{
    static int balance;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Good Morning, Welcome to Green Bank");
        System.out.println("Dear Customer, How may I help you");
        System.out.println();
        System.out.println("Enter Your Choice");
        System.out.println("1.Deposit");
        System.out.println("2.WithDraw");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Exit");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            Deposit();
            break;
            case 2:
            WithDraw();
            break;
            case 3:
            BalanceEnquiry();
            break;
            case 4:
            return;
           
        }
    }

    private static void Deposit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you wish to deposit");
        int amount=sc.nextInt();
        balance+=amount;
        System.out.println("Amount is Deposited, ThankYou");
    }

    private static void WithDraw(){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        System.out.println("Enter the amount you wish to withdraw");
        balance-=amount;
        System.out.println(balance);
        System.out.println("ThankYou Visit Again");
    }

    private static void BalanceEnquiry(){
        System.out.println(balance);
        System.out.println("ThankYou Visit again");
    }
}
