package student.WorkersApiPrezenter;

import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public interface IWorkersClient {

	/**
	 * 
	 * @param worker
	 */
	IWorkerModel CreateNewWorker(IWorkerModel worker);

	/**
	 * 
	 * @param workerId
	 */
	IWorkerModel GetWorker(int workerId);

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability);

}