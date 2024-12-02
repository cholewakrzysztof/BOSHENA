package student.MainPrezenter;

import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;
import student.WorkerApiModel.WorkersApiModel.IWorkerModel;

public class WorkerFacade implements IWorkerFacade {

	private MainPrezenter.WorkerService workerService;

	@Override
	public boolean ChangeAvailability(IWorkerModel worek, IAvailabilityModel availability) {
		return false;
	}

	@Override
	public IWorkerModel GetWorker(int workerId) {
		return null;
	}
}