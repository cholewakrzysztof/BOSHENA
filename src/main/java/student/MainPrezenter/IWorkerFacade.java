package student.MainPrezenter;
import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public interface IWorkerFacade {

	/**
	 *
	 * @param worek
	 * @param availability
	 */
	boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability);

	/**
	 *
	 * @param workerId
	 */
	IWorkerModel GetWorker(int workerId);
}