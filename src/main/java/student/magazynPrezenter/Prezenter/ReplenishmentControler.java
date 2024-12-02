package student.magazynPrezenter.Prezenter;

import student.StorageModel.StorageModel.IReplenishmentModel;

public class ReplenishmentControler implements IReplenishmentModel {

	public void CreateReplenishmentOrder() {
		// TODO - implement ReplenishmentControler.CreateReplenishmentOrder
		throw new UnsupportedOperationException();
	}

	public void DeleteReplenishmentOrder() {
		// TODO - implement ReplenishmentControler.DeleteReplenishmentOrder
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean InsertOrder(StorageModel.StorageModel.ReplenishmentModel order) {
		return false;
	}

	@Override
	public boolean DeleteOrder(int orderID) {
		return false;
	}
}