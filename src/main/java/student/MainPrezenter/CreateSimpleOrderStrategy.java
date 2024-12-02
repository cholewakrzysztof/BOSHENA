package student.MainPrezenter;


import student.ICustomerClient;
import student.ICustomerModel;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;

public class CreateSimpleOrderStrategy implements ICreateOrderStrategy {

	CustomerService customerService = new CustomerService();
	RepairService repairService = new RepairService();
	OrdersService ordersService = new OrdersService();


	@Override
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		ICustomerModel customer= customerService.GetCustomer(clientId);
		if (customer == null) {
			return null;
		}
		int deviceId = repairService.CreateDevice(device);
		int repairId = repairService.CreateRepair(deviceId);

		if (repairId == -1) {
			return null;
		}

		return ordersService.CreateOrder(device, order, workerId, clientId);
	}

	@Override
	public String ToString() {
		return "Simple strategy";
	}
}