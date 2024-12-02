package OrdersApiModel.OrdersApiModel;

import java.util.Date;

public class OrderModel implements OrdersApiModel.OrdersApiModel.IOrderModel {

	private OrdersApiModel.OrdersApiModel.OrderStatus Status;
	private int WorkerId;
	private int[] RepairId;
	private Date StartDate;

}