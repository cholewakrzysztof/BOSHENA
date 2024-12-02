package student.MainPrezenter;


import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class CreateSimpleOrderStrategy implements ICreateOrderStrategy {

	@Override
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		return null;
	}

	@Override
	public String ToString() {
		return "Simple strategy";
	}
}