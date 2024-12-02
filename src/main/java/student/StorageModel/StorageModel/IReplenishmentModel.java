package student.StorageModel.StorageModel;

public interface IReplenishmentModel {

	/**
	 * 
	 * @param order
	 */
	boolean InsertOrder(StorageModel.StorageModel.ReplenishmentModel order);

	/**
	 * 
	 * @param orderID
	 */
	boolean DeleteOrder(int orderID);

}