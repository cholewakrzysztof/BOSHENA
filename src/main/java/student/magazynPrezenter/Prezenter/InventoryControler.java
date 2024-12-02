package student.magazynPrezenter.Prezenter;

import student.IInventoryClient;
import student.StorageModel.StorageModel.ItemModel;

public class InventoryControler implements IInventoryClient {

	private ItemService itemService = new ItemService();

	/**
	 * 
	 * @param partsList
	 */
	public void UpdateData(ItemModel[] partsList) {
		// TODO - implement InventoryControler.UpdateData
		throw new UnsupportedOperationException();
	}

	public void RecoverBackup() {
		// TODO - implement InventoryControler.RecoverBackup
		throw new UnsupportedOperationException();
	}

	public void ShowAll() {
		itemService.ShowAll();
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param partID
	 */
	public ItemModel ShowPart(int partID) {
		return itemService.ShowPart(partID);
		//throw new UnsupportedOperationException();
	}

	public void ApplyFilter() {
		// TODO - implement InventoryControler.ApplyFilter
		throw new UnsupportedOperationException();
	}

	public void CreateReplenishmentOrder() {
		// TODO - implement InventoryControler.CreateReplenishmentOrder
		throw new UnsupportedOperationException();
	}

	public void DeleteReplenishmentOrder() {
		// TODO - implement InventoryControler.DeleteReplenishmentOrder
		throw new UnsupportedOperationException();
	}

	@Override
	public void operation() {

	}

}