package it3;

import it1.Box;

public class Warehouse {

	private CarPart[] carParts;
	private Box[] boxes;

	public CarPart[] getCarParts() {
		return this.carParts;
	}

	/**
	 * 
	 * @param carParts
	 */
	public void setCarParts(CarPart[] carParts) {
		this.carParts = carParts;
	}

	public Box[] getBoxes() {
		return this.boxes;
	}

	/**
	 * 
	 * @param boxes
	 */
	public void setBoxes(Box[] boxes) {
		this.boxes = boxes;
	}

}