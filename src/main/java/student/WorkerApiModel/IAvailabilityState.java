package WorkerApiModel;

import WorkerApiModel.WorkersApiModel.*;

public interface IAvailabilityState {

	/**
	 * 
	 * @param availability
	 */
	bool InsertAvailability(IAvailabilityModel availability);

	/**
	 * 
	 * @param availability
	 */
	int UpdateAvailability(IAvailabilityModel availability);

}