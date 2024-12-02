public interface IReplenishmentState {

	/**
	 * 
	 * @param order
	 */
	bool InsertOrder(IIReplenishmentModel order);

	/**
	 * 
	 * @param orderID
	 */
	bool DeleteOrder(int orderID);

}