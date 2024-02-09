import java.util.Scanner;
class Bank
{
    private int amout;
    private int pin=8795;
    void chek()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        int pass=sc.nextInt();
        if (pass==pin)
        {
            menu();
        }
        else
        {
            System.out.println("Wrong Pin");
        }
    }
    void menu()
    {
        System.out.println();
        System.out.println("1. Enquary");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposite");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int opt = sc.nextInt();
        if (opt==1)
        {
            enquary();
        }
        else if (opt==2)
        {
            withdraw();
        }
        else if (opt==3)
        {
            deposite();
        }
        else if (opt==4)
        {
            exit();
        }
    }
    void enquary()
    {
        System.out.println(amout);
        menu();
    }
    void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int am = sc.nextInt();
        if (amout>am)
        {
            amout = amout-am;
            System.out.println(amout);
            menu();
        }
        else
        {
            System.out.println("Infucent Balance");
        }
    }
    void deposite()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount ot deposite: ");
        int am =sc.nextInt();
        amout = amout+am;
        System.out.println(amout);
        menu();
    }
    void exit()
    {
        exit();
    }
}
class Cus
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.chek();
    }
}