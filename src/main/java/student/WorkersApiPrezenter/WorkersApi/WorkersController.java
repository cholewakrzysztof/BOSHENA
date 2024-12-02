package student.WorkersApiPrezenter.WorkersApi;


import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;
import student.WorkersApiPrezenter.IWorkersClient;

public class WorkersController implements IWorkersClient {

	/**
	 * 
	 * @param worker
	 */
	public IWorkerModel CreateNewWorker(IWorkerModel worker) {
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
	public boolean ChangeAvailability(student.WorkerApiModel.WorkersApiModel.IWorkerModel worek, student.WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		return false;
	}

}