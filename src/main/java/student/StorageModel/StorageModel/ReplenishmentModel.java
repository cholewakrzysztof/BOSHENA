package student.StorageModel.StorageModel;

public class ReplenishmentModel implements IReplenishmentModel {

	private int orderID;

	@Override
	public boolean InsertOrder(ReplenishmentModel order) {
		return false;
	}

	@Override
	public boolean DeleteOrder(int orderID) {
		return false;
	}
}