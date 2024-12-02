package student.WorkerApiModel;

import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public interface IWorkerState {

	/**
	 * 
	 * @param worker
	 */
	boolean InsertWorker(IWorkerModel worker);

	/**
	 * 
	 * @param worker
	 */
	int UpdateWorker(IWorkerModel worker);

	/**
	 * 
	 * @param workerId
	 */
	IWorkerModel GetWorkerById(int workerId);

	/**
	 * 
	 * @param workerId
	 */
	IWorkerModel DeleteWorker(int workerId);

}