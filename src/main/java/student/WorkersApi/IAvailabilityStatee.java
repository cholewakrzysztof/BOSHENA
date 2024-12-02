package WorkersApi;

public interface IAvailabilityStatee {

	AvailabilityState GetState();

	void PatchState();

}