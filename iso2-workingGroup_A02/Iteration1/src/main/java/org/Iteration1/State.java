package org.Iteration1;

public enum State {
	/**
	 * If nobody have reserved it
	 */
	free,
	/**
	 * If somebody have done a reservation
	 */
	reserved,
	/**
	 * When mechanics are using the Box
	 */
	occupied,
	/**
	 * When the Mechanic sets up a list of the components that he will need
	 */
	asking,
	/**
	 * When the Mechanics are waiting for the spare parts.
	 */
	waitingParts,
	/**
	 * When the Mechanics are replacing the spare parts they asked for.
	 */
	served,
	/**
	 * When the client has asked for the bill/payment
	 */
	waitingPayment,
	/**
	 * When the clients have to pay in the box.
	 */
	billing,
	/**
	 * When the Mechanics are setting all up to leave the Box ready for another client.
	 */
	preparation
}