package student.WorkerApiModel.WorkersApiModel;

import student.OrdersApiModel.OrdersApiModel.State;
import student.WorkerApiModel.IAvailabilityState;

import java.sql.Connection;

public class AvailabilityState implements IAvailabilityState, State {

	private IAvaiabilityModel[] Availabilities;

	/**
	 * 
	 * @param availability
	 */
	public boolean InsertAvailability(WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		// TODO - implement AvailabilityState.InsertAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param availability
	 */
	public int UpdateAvailability(IAvailabilityModel availability) {
		// TODO - implement AvailabilityState.UpdateAvailability
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean InsertAvailability(WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		return false;
	}

	@Override
	public int UpdateAvailability(WorkerApiModel.WorkersApiModel.IAvailabilityModel availability) {
		return 0;
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