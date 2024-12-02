package student.WorkerApiModel.WorkersApiModel;

import java.util.Date;

public class AvailabilityModel implements WorkerApiModel.WorkersApiModel.IAvailabilityModel {

	private int WorkerId;
	private Date From;
	private Date To;
	private WorkerApiModel.WorkersApiModel.Availability Type;

}