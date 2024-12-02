package student;

import student.StorageModel.StorageModel.IReplenishmentModel;

public interface IReplenishmentState {

	/**
	 * 
	 * @param order
	 */
	boolean InsertOrder(IReplenishmentModel order);

	/**
	 * 
	 * @param orderID
	 */
	boolean DeleteOrder(int orderID);

}