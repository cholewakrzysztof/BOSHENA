package OrdersApi;

import OrdersApiModel.OrdersApiModel.*;

public interface IOrderState {

	/**
	 * 
	 * @param order
	 */
	bool InsertOrder(IOrderModel order);

	/**
	 * 
	 * @param order
	 */
	int UpdateOrder(IOrderModel order);

	/**
	 * 
	 * @param orderId
	 */
	IOrderModel GetOrderById(int orderId);

	/**
	 * 
	 * @param orderId
	 */
	IOrderModel DeleteOrder(int orderId);

}