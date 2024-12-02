package OrdersApi;

public interface IRepairState {

	/**
	 * 
	 * @param repair
	 */
	bool InsertRepair(IRepair repair);

	/**
	 * 
	 * @param repair
	 */
	int UpdateRepair(IRepair repair);

}