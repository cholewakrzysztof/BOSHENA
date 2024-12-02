package student.MainPrezenter;

import OrdersApiModel.OrdersApiModel.IDeviceModel;
import OrdersApiModel.OrdersApiModel.IOrderModel;

public class WorkerFacade implements IWorkerFacade {

	private MainPrezenter.WorkerService workerService;

	/**
	 * 
	 * @param workerId
	 */
	public WorkerApiModel.WorkersApiModel.IWorkerModel GetWorker(int workerId) {
		// TODO - implement WorkerFacade.GetWorker
		throw new UnsupportedOperationException();
	}

	@Override
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		return null;
	}

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	public boolean ChangeAvailability(WorkerApiModel.WorkersApiModel.IWorkerModel worek, WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		// TODO - implement WorkerFacade.ChangeAvailability
		throw new UnsupportedOperationException();
	}

}