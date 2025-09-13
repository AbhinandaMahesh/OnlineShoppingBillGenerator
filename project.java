package onlineshoppingbillgenerator;
import java.util.*;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double totalbill = 0;
		int choice;
		
		do {
			System.out.println("====== online shop ======");
			System.out.println("1. Laptop - R50000");
			System.out.println("2. Mobile - R20000");
			System.out.println("3. Headphone - R2000");
			System.out.println("4. checkout");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			int qty;
			switch(choice){
			case 1:
				System.out.println("Enter quantity: ");
				qty = sc.nextInt();
				totalbill += 50000 * qty;
				break;
			case 2:
				System.out.println("enter the quantity: ");
				qty = sc.nextInt();
				totalbill += 20000 * qty;
				break;
			case 3:
				System.out.println("enter the quantity: ");
				qty = sc.nextInt();
				totalbill += 2000 * qty;
				break;
			case 4:
				System.out.println("checking out....");
				break;
			default:
				System.out.println("invalid choice");
				
			} 
		}while (choice != 4);
		
		
		if(totalbill > 50000) {
			totalbill -= totalbill * 0.10; 
		}
		
		System.out.println("final bill amount: " +Math.round(totalbill));
		sc.close();
	}

}
