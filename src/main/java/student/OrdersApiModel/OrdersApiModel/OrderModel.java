package student.OrdersApiModel.OrdersApiModel;

import java.util.Date;

public class OrderModel implements IOrderModel {

	private OrderStatus Status;
	private int WorkerId;
	private int[] RepairId;
	private Date StartDate;

	public OrderModel(OrderStatus status, int workerId, int[] repairId, Date startDate) {
		this.StartDate = startDate;
		this.WorkerId = workerId;
		this.RepairId = repairId;
		this.Status = status;
	}
}