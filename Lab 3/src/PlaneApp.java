import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, seatId, custId;
		
		Plane plane1 = new Plane();
		
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		
		do {
			
			System.out.println("\nEnter the number of your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
				case(1): 
					plane1.showNumEmptySeats();
					break;
				case(2): 
					plane1.showEmptySeats();
					break;
				case(3): 
					plane1.showAssignedSeats(true);
					break;	
				case(4): 
					plane1.showAssignedSeats(false);
					break;
				case(5): 
					System.out.println("Assigning seat...");
					System.out.println("Please enter SeatID: ");
					seatId = sc.nextInt();
					System.out.println("Please enter Customer ID: ");
					custId = sc.nextInt();
					
					if (plane1.seat[seatId - 1].assigned == true)
						System.out.println("Seat already assigned to a customer.");
					else {
						plane1.assignSeat(seatId, custId);
						System.out.println("Seat assigned!");
					}
					
					
					
					// check if the seat is assigned
					break;
				case(6): 
					System.out.println("Enter SeatID to unassign customer from: ");
					seatId = sc.nextInt();
					plane1.unAssignSeat(seatId);
				
					System.out.println("Seat Unassigned!");
					break;
				case(7): 
					break;
				default: 
					continue;
				}
			} while (choice != 7);
			sc.close();
		
	}
}
