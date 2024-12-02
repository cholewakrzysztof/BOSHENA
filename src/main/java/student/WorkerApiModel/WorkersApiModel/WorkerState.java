package student.WorkerApiModel.WorkersApiModel;

import student.OrdersApiModel.OrdersApiModel.State;
import student.WorkerApiModel.IWorkerState;

import java.sql.Connection;

public class WorkerState implements IWorkerState, State {

	private WorkerApiModel.WorkersApiModel.IWorkerModel[] Workers;

	public WorkerState GetState() {
		// TODO - implement WorkerState.GetState
		throw new UnsupportedOperationException();
	}

	public void PatchState() {
		// TODO - implement WorkerState.PatchState
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean InsertWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker) {
		return false;
	}

	@Override
	public int UpdateWorker(WorkerApiModel.WorkersApiModel.IWorkerModel worker) {
		return 0;
	}

	@Override
	public WorkerApiModel.WorkersApiModel.IWorkerModel GetWorkerById(int workerId) {
		return null;
	}

	@Override
	public WorkerApiModel.WorkersApiModel.IWorkerModel DeleteWorker(int workerId) {
		return null;
	}

	@Override
	public boolean Disconnect() {
		return false;
	}

	@Override
	public Connection Connect() {
		return null;
	}
}