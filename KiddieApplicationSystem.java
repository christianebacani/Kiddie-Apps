import java.util.Scanner;
public class KiddieApplicationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int priceMeals[] = {100,110,120,130,140};
        int priceToys[] = {180,190,200,210,220};
        boolean transaction = true;
        int total = 0;
        
        System.out.print("1.) Buy a Kiddie Meal\n");
        System.out.print("2.) Buy toys\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\n    AVAILABLE KIDDIE MEALS\n\n");
                System.out.print("MEALS\t\t\tPRICE\n\n");
                System.out.print("1.) Nuggets\t\tP 100\n\n");
                System.out.print("2.) Quesadilla\t\tP 110\n\n");
                System.out.print("3.) Meatballs\t\tP 120\n\n");
                System.out.print("4.) Burger   \t\tP 130\n\n");
                System.out.print("5.) Bacon    \t\tP 140\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                total += priceMeals[userChoice - 1] * quantity;
                
                System.out.print("Do you want to buy more kiddie meals? (y/n): ");
                input.nextLine();
                String buyMoreMeals = input.nextLine();
                
                if(buyMoreMeals.equalsIgnoreCase("n")){
                    
                    transaction = false;
                    System.out.print("The total price is : P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
                                  
                }
                
                }
                break;
                
            case 2:
                while(transaction){
                    
                System.out.print("\n   AVAILABLE KIDDIE TOYS\n\n");
                System.out.print("TOYS\t\tPRICE\n\n");
                System.out.print("1.) Lego\tP 180\n\n");
                System.out.print("2.) Barbie\tP 190\n\n");
                System.out.print("3.) Beanie\tP 200\n\n");
                System.out.print("4.) Furby \tP 210\n\n");
                System.out.print("5.) Yo-yo \tP 220\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                total += priceToys[userChoice - 1] * quantity;
                
                System.out.print("Do you want to buy more toys (y/n)?: ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    
                    transaction = false;
                    System.out.print("The total price is : P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
              
                }
                
                }
                break;
                
            case 3:
                System.out.print("\n\nWelcome to Bacani`s Kiddie App - Where Fun and Learning Come Together!\nAt Bacani`s Kiddie App, we believe that learning can be an exciting adventure for kids! Our\nmission is to create a safe and engaging environment where children can explore, discover,\nand learn through play. With our carefully crafted kiddie app, we aim to spark curiosity, foster\ncreativity, and encourage educational growth in young minds.");
                break;
                
            case 4:
                System.out.print("---EXITING---");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE\n");
                
        }
        
        
        
    }
}
