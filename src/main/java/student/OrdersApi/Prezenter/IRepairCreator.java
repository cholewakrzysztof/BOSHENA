package OrdersApi.Prezenter;

public interface IRepairCreator {

	/**
	 * 
	 * @param device
	 */
	IRepairModel CreateRepair(IDeviceModel device);

}