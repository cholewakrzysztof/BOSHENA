package student;

public interface IWorkerClient {

	/**
	 * 
	 * @param workerId
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel GetWorker(int workerId);

	/**
	 * 
	 * @param workerId
	 * @param availability
	 */
	boolean UpdateWorkerAvailability(int workerId, WorkerApiModel.WorkersApiModel.IAvailabilityModel availability);

}