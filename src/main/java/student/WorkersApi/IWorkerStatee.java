package student.WorkersApi;

public interface IWorkerStatee {

	/**
	 * 
	 * @param worker
	 */
	boolean InsertWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker);

	/**
	 * 
	 * @param worker
	 */
	int UpdateWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker);

	/**
	 * 
	 * @param workerId
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel GetWorkerById(int workerId);

	/**
	 * 
	 * @param workerId
	 */
	WorkerApiModel.WorkersApiModel.IWorkerModel DeleteWorker(int workerId);

}