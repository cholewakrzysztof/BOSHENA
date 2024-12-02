package student.MainPrezenter;

import OrdersApiModel.OrdersApiModel.IDeviceModel;
import OrdersApiModel.OrdersApiModel.IOrderModel;
import student.MainPrezenter.ICreateOrderStrategy;

public class CreateSimpleOrderStrategy implements ICreateOrderStrategy {

	@Override
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		return null;
	}
}