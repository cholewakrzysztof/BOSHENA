package WorkersApiPrezenter.WorkersApi;

public interface IAvailabilityProvider {

	/**
	 * 
	 * @param WorkerId
	 * @param IAvailabilityModel
	 */
	boolean ChangeAvailability(int WorkerId, int IAvailabilityModel);

}