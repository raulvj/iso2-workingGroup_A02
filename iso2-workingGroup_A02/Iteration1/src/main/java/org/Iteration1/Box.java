package org.Iteration1;

public class Box {

	private boolean occupied;
	private Mechanic[] worker;
	/**
	 * This attribute is a string
	 */
	private State state;

	public boolean getOccupied() {
		return this.occupied;
	}

	/**
	 * 
	 * @param occupied
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Mechanic getWorker() {
		// TODO - implement Box.getWorker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param worker
	 */
	public void setWorker(Mechanic worker) {
		// TODO - implement Box.setWorker
		throw new UnsupportedOperationException();
	}

	public State getState() {
		return this.state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(int state) {
		// TODO - implement Box.setState
		throw new UnsupportedOperationException();
	}

	/**
	 * This method will be used to cancel a reservation made by the Chief if the client takes 20min longer to get to the Workshop.
	 */
	public void cancelReservation() {
		// TODO - implement Box.cancelReservation
		throw new UnsupportedOperationException();
	}

}