package WorkerApiModel;

import WorkerApiModel.WorkersApiModel.*;

public interface IWorkerState {

	/**
	 * 
	 * @param worker
	 */
	bool InsertWorker(IWorkerModel worker);

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