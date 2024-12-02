package student.WorkerApiModel;

public interface IAvailabilityState {

	/**
	 * 
	 * @param availability
	 */
	boolean InsertAvailability(WorkerApiModel.WorkersApiModel.IAvailabilityModel availability);

	/**
	 * 
	 * @param availability
	 */
	int UpdateAvailability(WorkerApiModel.WorkersApiModel.IAvailabilityModel availability);

}