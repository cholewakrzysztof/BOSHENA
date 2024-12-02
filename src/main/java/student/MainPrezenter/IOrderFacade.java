package student.MainPrezenter;


public interface IOrderFacade {

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	boolean ChangeAvailability(WorkerApiModel.WorkersApiModel.IWorkerModel worek, WorkerApiModel.WorkersApiModel.IAvailabilityModel availability);

	/**
	 * 
	 * @param workerId
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel GetWorker(int workerId);

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	OrdersApiModel.OrdersApiModel.IOrderModel CreateOrder(OrdersApiModel.OrdersApiModel.IDeviceModel device, OrdersApiModel.OrdersApiModel.IOrderModel order, int workerId, int clientId);

}