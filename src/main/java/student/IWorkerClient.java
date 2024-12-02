package student;

import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public interface IWorkerClient {

	/**
	 * 
	 * @param workerId
	 */
	IWorkerModel GetWorker(int workerId);

	/**
	 * 
	 * @param workerId
	 * @param availability
	 */
	boolean UpdateWorkerAvailability(int workerId, IAvailabilityModel availability);

}