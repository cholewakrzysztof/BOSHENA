package student.WorkersApiPrezenter.WorkersApi;


import WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import WorkerApiModel.WorkersApiModel.IWorkerModel;
import student.WorkersApiPrezenter.IWorkersClient;

public class WorkersController implements IWorkersClient {

	/**
	 * 
	 * @param worker
	 */
	public WorkerApiModel.WorkersApiModel.IWorkerModel CreateNewWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker) {
		// TODO - implement WorkersController.CreateNewWorker
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param workerId
	 */
	public IWorkerModel GetWorker(int workerId) {
		// TODO - implement WorkersController.GetWorker
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability) {
		return false;
	}

}