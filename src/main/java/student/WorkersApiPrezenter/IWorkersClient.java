package student.WorkersApiPrezenter;

public interface IWorkersClient {

	/**
	 * 
	 * @param worker
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel CreateNewWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker);

	/**
	 * 
	 * @param workerId
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel GetWorker(int workerId);

	/**
	 * 
	 * @param worek
	 * @param availability
	 */
	boolean ChangeAvailability(WorkerApiModel.WorkersApiModel.IWorkerModel worek, WorkerApiModel.WorkersApiModel.IAvailabilityModel availability);

}