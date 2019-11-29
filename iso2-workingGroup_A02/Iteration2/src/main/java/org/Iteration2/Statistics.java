package org.Iteration2;

public class Statistics {

		/**
		 * This value defines if the statistic will be done by workshop or by city. True implies workshop
		 */
		private boolean workshop = true;
		/**
		 * This attribute defines the name of the workshop or  city  to take the statistics from
		 */
		private String name;

		/**
		 * This method calculates the mean of the time it takes to assign a box to a customer
		 * @param workshop
		 * @paramname
		 */
		public float time2assignABox(boolean workshop, String name) {
			// TODO - implement Statistics.time2assignABox
			throw new UnsupportedOperationException();
		}

		/**
		 * This method calculates the average time it takes to repair a breakdown
		 * @param workshop
		 * @param name
		 */
		public float time2repairBreakdown(boolean workshop, String name) {
			// TODO - implement Statistics.time2repairBreakdown
			throw new UnsupportedOperationException();
		}

		/**
		 * This method is in charge of calculating the average time it takes to generate the bill to pay
		 * @param workshop
		 * @param name
		 */
		public float time2pay(boolean workshop, String name) {
			// TODO - implement Statistics.time2pay
			throw new UnsupportedOperationException();
		}

		/**
		 * This method calculates the time it takes to prepare the box after one repair for it to be ready for the next one
		 * @param workshop
		 * @param name
		 */
		public float timeBetweenRepairs(boolean workshop, String name) {
			// TODO - implement Statistics.timeBetweenRepairs
			throw new UnsupportedOperationException();
		}

	}

