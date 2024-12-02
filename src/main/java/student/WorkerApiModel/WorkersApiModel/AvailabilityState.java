package student.WorkerApiModel.WorkersApiModel;

import student.OrdersApiModel.OrdersApiModel.State;
import student.WorkerApiModel.IAvailabilityState;

import java.sql.Connection;

public class AvailabilityState implements IAvailabilityState, State {

	private IAvailabilityModel[] Availabilities;


	@Override
	public boolean Disconnect() {
		return false;
	}

	@Override
	public Connection Connect() {
		return null;
	}

	@Override
	public boolean InsertAvailability(IAvailabilityModel availability) {
		return false;
	}

	@Override
	public int UpdateAvailability(IAvailabilityModel availability) {
		return 0;
	}
}