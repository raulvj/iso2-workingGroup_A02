package it4;
import it1.Box;
import it1.Mechanic;

public class Bill {

		private int piecesReplaced;
		private int employeeN;
		private boolean cash;

		public int getPiecesReplaced() {
			return this.piecesReplaced;
		}

		/**
		 * 
		 * @param piecesReplaced
		 */
		public void setPiecesReplaced(int piecesReplaced) {
			this.piecesReplaced = piecesReplaced;
		}

		public int getEmployeeN() {
			return this.employeeN;
		}

		/**
		 * 
		 * @param employeeN
		 */
		public void setEmployeeN(int employeeN) {
			this.employeeN = employeeN;
		}

		public boolean getCash() {
			return this.cash;
		}

		/**
		 * 
		 * @param cash
		 */
		public void setCash(boolean cash) {
			this.cash = cash;
		}

	}