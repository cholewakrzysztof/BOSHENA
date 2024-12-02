package student;

public interface IReplenishmentState {

	/**
	 * 
	 * @param order
	 */
	boolean InsertOrder(StorageModel.StorageModel.IReplenishmentModel order);

	/**
	 * 
	 * @param orderID
	 */
	boolean DeleteOrder(int orderID);

}