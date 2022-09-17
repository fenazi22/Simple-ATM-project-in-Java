import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 10000;
        String name = "Faisal Abdullah";
        String FriendName="";
        String FriendIBAN="";

        int n = 0;
        String s = "";
        System.out.println("=================================================");
        System.out.println("                   Faisal BANK                   ");
        System.out.println("=================================================");
        while (true) {
            System.out.println("    > Enter (W or w) to withdraw");
            System.out.println("    > Enter (D or d) to deposit ");
            System.out.println("    > Enter (T or t) to transfer");
            System.out.println("    > Enter (P or p) to print info");
            System.out.println("    > Enter (E or e) to E X I T");
            System.out.println("====================================");
            System.out.print("    > Enter your choice: ");

            s = input.next();
            if (s.equalsIgnoreCase("w")) {
                System.out.print("    > Enter amount of  money  to withdraw ( up to 5000 ):");
                n = input.nextInt();
                //سحب من الصرافة
                if (n > 5000 || n>balance) {
                    System.out.println("    > You cannot withdraw because up to 5000 or withdraw more than  your balance \n ");
                } else {
                    balance -= n;
                    System.out.println("your withdraw "+n+"\n");
                }
            }
            else if (s.equalsIgnoreCase("d")) {
                System.out.print("    > Enter your amount your money deposit ( up to 10.000): ");
                n= input.nextInt();
                if (n>10000){
                    System.out.println("    > You cannot Deposit more than 10,000");
                }else {
                    balance+=n;
                    System.out.println("    > Your Deposit is "+n+" your new balance is"+" "+balance);
                }
            }

            else if (s.equalsIgnoreCase("T")) {
                System.out.print("    > Enter Name transfer: ");
                FriendName=input.next();
                System.out.print("    > Enter IBAM number: ");
                FriendIBAN=input.next();
                if (FriendIBAN.length()>10 ||FriendIBAN.length()<10){
                    System.out.println("Plese Enter 10 number ");
            }else {

                    System.out.print("how match you need Transfer: ");
                    n= input.nextInt();
                    if (n>8000 || n>balance){
                        System.out.println("you cannt transfer than 8000");
                    }else {
                        balance -= n;
                        System.out.println("\n\t \tSuccessfully  transfer for: " + FriendName + " " + n + "\n");
                    }
                    }

            }

            else if (s.equalsIgnoreCase("p")) {
                System.out.println("name: "+name);
                System.out.println("your balance is " + balance);

            }

            else if (s.equalsIgnoreCase("e")) {
            break;
            }

            else {

                System.out.println("    > Your Entered wrong input!");
            }

        }

    }
}