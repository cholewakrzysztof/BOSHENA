package student;

import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public interface IOrderscClient {

	/**
	 * 
	 * @param order
	 */
	int CreateOrder(IOrderModel order);

}