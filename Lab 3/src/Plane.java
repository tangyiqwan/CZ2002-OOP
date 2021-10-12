
public class Plane {
	PlaneSeat[] seat;
	int numEmptySeat;
	
	// create a plane
	public Plane() {
		seat = new PlaneSeat[12];	// allocates the memory
		numEmptySeat = 12;	// attributes of the class plane
		
		for (int i = 0; i < 12; i++) {
			seat[i] = new PlaneSeat(i + 1, false, 0);	// initialise the seats with PlaneSeat with seat ID
		}
	}
	
	
	// sort according to custID
	public PlaneSeat[] sortSeats() {	
		PlaneSeat[] seat2 = new PlaneSeat[12];
		
		
		for (int i = 0; i < 12; i++) {
			seat2[i] = new PlaneSeat(seat[i].SeatId, seat[i].assigned, seat[i].customerId);	// initialise the seats with PlaneSeat with seat ID
		}
		// do the sort on seat2
		for (int i = 0; i < 12; i++) {
			int min_custId = 0, min_cust_ind = 0, temp_custId = 0, temp_cust_seat = 0;
			for (int j = i; j < 12; j++) {
				if (seat2[j].assigned == false) continue;	// otherwise it will consider the 0 id
				if (min_custId == 0) {	// new round
					min_custId = seat2[j].customerId;
					min_cust_ind = j;
				}
				
				else if (min_custId > seat2[j].customerId) {
					min_custId = seat2[j].customerId;
					min_cust_ind = j;
				}
				
				
			}
			
			//System.out.printf("min Id %d\n", min_custId);
			// found the minimum for each loop
			// swap with the first
			if (min_custId != 0) {
				temp_custId = seat2[i].customerId;
				temp_cust_seat = seat2[i].SeatId;
				
				seat2[i].customerId = min_custId;
				seat2[i].SeatId = seat2[min_cust_ind].SeatId;
				seat2[i].assigned = true;
				
				seat2[min_cust_ind].SeatId = temp_cust_seat;
				seat2[min_cust_ind].customerId = temp_custId;
				if (temp_custId == 0) seat2[min_cust_ind].assigned = false;
				else seat2[min_cust_ind].assigned = true;
				//System.out.printf("At the %d position, seat id is %d\n", i, seat2[i].SeatId);
			}
			
		}
		return seat2;
		
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (int i = 0; i < 12; i++) {
			if (seat[i].assigned == false) System.out.printf("SeatID %d\n", seat[i].SeatId);; 
		}
		//System.out.println(numEmptySeat);
	}
	
	public void showNumEmptySeats() {
		System.out.printf("There are %d empty seats\n", numEmptySeat);
	}
	
	
	public void showAssignedSeats(boolean bySeatId) {
		System.out.println("The seat assignments are as follow:");
		if (bySeatId) {
			for (int i = 0; i < 12; i++) {
				if (seat[i].assigned == true) 
					System.out.printf("SeatID %d assigned to CustomerID %d.\n", seat[i].SeatId, seat[i].customerId);
			}
		}
		
		else {
			PlaneSeat[] seat2 = sortSeats();	// seat2 is a PlaneSeat array
			for (int i = 0; i < 12; i++) {
				if (seat2[i].assigned == true) 
					System.out.printf("SeatID %d assigned to CustomerID %d.\n", seat2[i].SeatId, seat2[i].customerId);
			}
		}
	}
	
	public void assignSeat(int seatId, int cust_id) {
		for (int i = 0; i < 12; i++) {
			if (seat[i].SeatId == seatId) {
				seat[i].assigned = true;
				seat[i].customerId = cust_id;
			}
			
		}
		numEmptySeat -= 1;
	}
	
	public void unAssignSeat(int seatId) {
		for (int i = 0; i < 12; i++) {
			if (seat[i].SeatId == seatId) {
				seat[i].assigned = false;
				seat[i].customerId = 0;
			}
			
		}
		numEmptySeat += 1;
	}
}
