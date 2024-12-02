package student.MainPrezenter;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;
import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public class CreateOrderWithWorkerStrategy implements ICreateOrderStrategy {

	/**
	 * 
	 * @param workerId
	 */
	private IWorkerModel GetWorker(int workerId) {
		// TODO - implement CreateOrderWithWorkerStrategy.GetWorker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	private boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability) {
		// TODO - implement CreateOrderWithWorkerStrategy.ChangeAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param order
	 */
	private IAvailabilityModel CreateAvailability(IOrderModel order) {
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
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		// TODO - implement CreateOrderWithWorkerStrategy.CreateOrder
		throw new UnsupportedOperationException();
	}

	@Override
	public String ToString() {
		return "Extend strategy";
	}

}