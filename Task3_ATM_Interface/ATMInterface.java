 import java.util.Scanner;
 public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance  = 10000.0;
        int choice;
        while (true) {
            System.out.println("\n====ATM MENU====");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your Balance: rs" + balance);
                    break;
                    case 2:
                        System.out.println("Enter amount to deposit: rs");
                        double deposit = sc.nextDouble();
                        if (deposit > 0 ) {
                            balance += deposit;
                            System.out.println("Amount deposited successfully!");

                        } else {
                            System.out.println("Invalid deposit amount");
                        }

                        break;
                        case 3:
                            System.out.print("Enter amount to withdraw: rs");
                            double withdraw = sc.nextDouble();
                            if(withdraw > 0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Withdrawal successfull!");
                            
                            } else {
                                System.out.println("Insufficient balance or invalid amount");
                            }
                            break;
                            case 4:
                                System.out.println("Thank you for using ATM!");
                                sc.close();
                                System.exit(0);
                                default:
                                    System.out.println("Invalid choice.please try again");

            }

        }
    }
 }