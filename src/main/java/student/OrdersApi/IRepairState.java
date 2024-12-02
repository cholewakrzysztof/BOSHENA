package student.OrdersApi;

public interface IRepairState {

	/**
	 * 
	 * @param repair
	 */
	boolean InsertRepair(IRepair repair);

	/**
	 * 
	 * @param repair
	 */
	int UpdateRepair(IRepair repair);

}