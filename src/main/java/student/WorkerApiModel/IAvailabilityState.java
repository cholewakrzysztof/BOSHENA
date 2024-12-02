package student.WorkerApiModel;

import student.WorkerApiModel.WorkersApiModel.IAvailabilityModel;

public interface IAvailabilityState {

	/**
	 * 
	 * @param availability
	 */
	boolean InsertAvailability(IAvailabilityModel availability);

	/**
	 * 
	 * @param availability
	 */
	int UpdateAvailability(IAvailabilityModel availability);

}