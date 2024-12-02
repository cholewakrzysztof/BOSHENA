package StorageModel.StorageModel;

public interface IReplenishmentModel {

	/**
	 * 
	 * @param order
	 */
	bool InsertOrder(ReplenishmentModel order);

	/**
	 * 
	 * @param orderID
	 */
	bool DeleteOrder(int orderID);

}