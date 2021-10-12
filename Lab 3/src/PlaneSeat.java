
public class PlaneSeat {
	int SeatId = 0;
	boolean assigned = false;
	int customerId = 0;
	
	public PlaneSeat(int seatId, boolean assigned, int customerId) {
		this.SeatId = seatId;
		this.assigned = assigned;
		this.customerId = customerId;
				
	}
	
	public int getSeatID() {
		return this.SeatId;
	}
	
	public int customerID() {
		return this.customerId;
	}
	
	public boolean isOccupied() {
		return this.assigned;
	}
	
	public void assign(int cust_id) {	// take in seatId?
		this.customerId = cust_id;
	}
	
	public void unAssign() {
		// no need to take in seatId?
		this.assigned = false;
	}
}
