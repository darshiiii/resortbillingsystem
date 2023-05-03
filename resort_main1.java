import java.util.Scanner;


class resort 
{
	
	int person,noofroom,room,availroom=10;
	double gst=0.8;
	String s1="darshi";
	String s2;
	//Scanner sc = new Scanner(System.in);
     int choice, quantity,typemeal;
     double price, total = 0;
    Scanner sc=new Scanner(System.in);

    void check_in()
    {
		System.out.println("Enter Your Password : ");
		s2=sc.next();
		
		if(s2.equalsIgnoreCase(s1))
		{
		
        System.out.println("Enter Type of Room : \n1. Suit \n2. Delux \n3. Super Delux");
        room=sc.nextInt();
		
		System.out.println("Enter Number of person : ");
        person=sc.nextInt();
		
		System.out.println("Enter Number of room you want :");
		noofroom=sc.nextInt();
		
		if(availroom<noofroom)
		{
			System.out.println("Sorry!! we dont have these much room available");
			System.out.println("Now plzz again Enter Number of room you want :");
			noofroom=sc.nextInt();
		}
		availroom-=noofroom;
		
		
		
		
		if(room==1)
		{
			System.out.println("price for each room is 3000");
		}
		else if(room==2)
		{
			System.out.println("price for each room is 4000");
		}
		else
		{
			System.out.println("price for each room is 5000");
		}
		}	
		else
		{
			System.out.println("oops !! Your password is wrong ");
			System.exit(0);
		}
    }
		void food_order()
		{


        
        do
		{
		
		System.out.println("Enter Your choice\n1. Veg \n2. Non-veg \n3. Exit ");
		typemeal=sc.nextInt();
		
		
		if(typemeal==1)
		{
		
			
		
        System.out.println("========= MENU =========");
        System.out.println("1. Pizza - $10.00");
        System.out.println("2. Burger - $5.00");
        System.out.println("3. Fries - $3.00");
        System.out.println("4. Soda - $2.00");
        System.out.println("========================");
        
        do {
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    price = 10.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 2:
                    price = 5.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 3:
                    price = 3.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 4:
                    price = 2.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
        //System.out.printf("Total: $%.2f\n", total);
        //scanner.close();
		}
		
		else if(typemeal==2)
		{
			System.out.println("========= MENU =========");
        System.out.println("1. Biriyani - $20.00");
        System.out.println("2. kabaab - $10.00");
        System.out.println("3. Tandoori chicken - $5.00");
        System.out.println("4. chicken curry - $6.00");
        System.out.println("========================");
        
        do {
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    price = 20.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 2:
                    price = 10.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 3:
                    price = 5.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                case 4:
                    price = 6.00;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += price * quantity;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
        //System.out.printf("Total: $%.2f\n", total);
        
		}
		
		else
		{
			//System.exit(0);
			System.out.println("Thank You !!");
		}
		}while(typemeal!=3);


}

void calc()
	{
		
		int price=0;
		if(room==1)
		{
			price=3000*noofroom;
			System.out.println("Price for room is : "+price);
		}
		else if(room==2)
		{
			price=4000*noofroom;
			System.out.println("Price for room is : "+price);
		}
		else if(room==3)
		{
			price=5000*noofroom;
			System.out.println("Price for room is : "+price);
		}
		System.out.println("Total price = "+(price+total));
		System.out.println("Total Bill after gst = "+(((price+total)*gst)+price+total));
	}

	
}	
public class resort_main1
{
    public static void main(String args[])
    {
        resort res=new resort();
		res.check_in();
		res.food_order();
		res.calc();
	}
}