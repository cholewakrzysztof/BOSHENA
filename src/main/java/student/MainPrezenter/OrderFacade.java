package student.MainPrezenter;


import WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import WorkerApiModel.WorkersApiModel.IWorkerModel;

public class OrderFacade implements IOrderFacade {

	private OrderCreation OrderCreation;


	@Override
	public boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability) {
		return false;
	}

	@Override
	public IWorkerModel GetWorker(int workerId) {
		return null;
	}

	@Override
	public OrdersApiModel.OrdersApiModel.IOrderModel CreateOrder(OrdersApiModel.OrdersApiModel.IDeviceModel device, OrdersApiModel.OrdersApiModel.IOrderModel order, int workerId, int clientId) {
		return null;
	}
}