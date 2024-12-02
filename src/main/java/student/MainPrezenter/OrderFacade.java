package student.MainPrezenter;


import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class OrderFacade implements IOrderFacade {

	private OrderCreation OrderCreation = new OrderCreation();

	@Override
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		if (workerId > 0) {
			System.out.println("Select strategy without worker\n");
			ICreateOrderStrategy simpleStrategy = new CreateSimpleOrderStrategy();
			OrderCreation.SetStrategy(simpleStrategy);
		} else {
			System.out.println("Select strategy with worker\n");
			ICreateOrderStrategy extendStrategy = new CreateOrderWithWorkerStrategy();
			OrderCreation.SetStrategy(extendStrategy);
		}

		return OrderCreation.CreateOrder(device, order, workerId, clientId);
	}
}