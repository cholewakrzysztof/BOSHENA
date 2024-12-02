package student.OrdersApi;

public interface IRepairState {

	/**
	 * 
	 * @param repair
	 */
	boolean InsertRepair(OrdersApi.Prezenter.IRepairModel repair);

	/**
	 * 
	 * @param repair
	 */
	int UpdateRepair(OrdersApi.Prezenter.IRepairModel repair);

}