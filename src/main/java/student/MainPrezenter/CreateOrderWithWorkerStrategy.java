package student.MainPrezenter;

public class CreateOrderWithWorkerStrategy implements ICreateOrderStrategy {

	/**
	 * 
	 * @param workerId
	 */
	private WorkerApiModel.WorkersApiModel.IWorkerModel GetWorker(int workerId) {
		// TODO - implement CreateOrderWithWorkerStrategy.GetWorker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	private boolean ChangeAvailability(WorkerApiModel.WorkersApiModel.IWorkerModel worek, WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		// TODO - implement CreateOrderWithWorkerStrategy.ChangeAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param order
	 */
	private WorkerApiModel.WorkersApiModel.IAvailabilityModel CreateAvailability(OrdersApiModel.OrdersApiModel.IOrderModel order) {
		// TODO - implement CreateOrderWithWorkerStrategy.CreateAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	public OrdersApiModel.OrdersApiModel.IOrderModel CreateOrder(OrdersApiModel.OrdersApiModel.IDeviceModel device, OrdersApiModel.OrdersApiModel.IOrderModel order, int workerId, int clientId) {
		// TODO - implement CreateOrderWithWorkerStrategy.CreateOrder
		throw new UnsupportedOperationException();
	}

}