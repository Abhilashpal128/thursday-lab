import java.util.Scanner;
public class hotel_management {

		public static void main(String[] args) 
	     {
		
			System.out.println("Welcome to hotel BlueStar");
			int select ; 
			char choose ,enter;
			Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("WHAT WOULD YOU LIKE TO TAKE FIRST");
				System.out.println("Menu:");
				System.out.println("STARTERS");
				System.out.println("MAIN COURSE");
				System.out.println("DESSERTS");
				System.out.println("Press 1 for 'STARTERS',Press 2 for'MAINCOURSE', Press 3 for'DESSERTS'");
				select=sc.nextInt();
				if (select==1) {
					System.out.println("OK WHAT WOULD YOU LIKE TO TAKE IN STARTERS");
					System.out.println("**MENU FOR STARTERS**");
					System.out.println("a.Creamy Tomato Soup (Instant Pot)");
					System.out.println("b.Pani Puri Recipe (Water & Stuffing)");
					System.out.println("c.Cocktail Samosa (Mini Paneer Samosa)");
					System.out.println("d.Batata Vada.");
					enter=sc.next().charAt(0);
					if (enter=='a'|| enter=='A') {
						System.out.println("Thankyou sir you ordered Tomato Soup");
						
					}
					else if(enter=='b'|| enter=='B') {
						System.out.println("Thankyou sir you ordered Pani Puri");
					}
					else if(enter=='c'|| enter=='C') {
						System.out.println("Thankyou sir you ordered Paneer Samosa");
					}
					else if(enter=='d'|| enter=='D') {
						System.out.println("Thankyou sir you ordered Batata vada");
					}
					else {
						System.out.println("Order Something!!!");
					}
					}
				else if (select==2) {
					System.out.println("OK WHAT WOULD YOU LIKE TO TAKE IN MAINCOURSE");
					System.out.println("**MENU FOR MAINCOURSE**");
					System.out.println("a.Butter Chicken.");
					System.out.println("b.Palak Paneer");
					System.out.println("c.Grilled Sandwich");
					System.out.println("d.Dal Tadka");
					enter=sc.next().charAt(0);
					if (enter=='a'|| enter=='A') {
						System.out.println("Thankyou sir you ordered Butter Chicken");
						
					}
					else if(enter=='b'|| enter=='B') {
						System.out.println("Thankyou sir you ordered Palak Paneer");
					}
					else if(enter=='c'|| enter=='C') {
						System.out.println("Thankyou sir you ordered Grilled Sandwich");
					}
					else if(enter=='d'|| enter=='D') {
						System.out.println("Thankyou sir you ordered Dal Tadka");
					}
					else {
						System.out.println("Order Something!!!");
					}
			    	}
				else if (select==3) {
					System.out.println("OK WHAT WOULD YOU LIKE TO TAKE IN DESSERT");
					System.out.println("**MENU FOR DESSERT**");
					System.out.println("a.Cakes.");
					System.out.println("b.Cookies");
					System.out.println("c.IceCreams");
					System.out.println("d.Pastries.");
					enter=sc.next().charAt(0);
					if (enter=='a'|| enter=='A') {
						System.out.println("Thankyou sir you ordered Cake");
						
					}
					else if(enter=='b'|| enter=='B') {
						System.out.println("Thankyou sir you ordered Cookies");
					}
					else if(enter=='c'|| enter=='C') {
						System.out.println("Thankyou sir you ordered IceCream");
					}
					else if(enter=='d'|| enter=='D') {
						System.out.println("Thankyou sir you ordered Pastries.");
					}
					else {
						System.out.println("Order Something!!!");
					}
				}
				
				
				
				System.out.println("Do you want to continue this process y/n");
				choose=sc.next().charAt(0);
			}
			while(choose=='y' ||choose=='Y');
			
			System.out.println("Thanks for coming :)");
				
		}

		
		}

			
			
		


