package student.magazynPrezenter.Prezenter;

import student.IItemState;
import student.StorageModel.StorageModel.ItemModel;
import student.StorageModel.StorageModel.ItemState;

public class ItemService  {

	private InventoryProcessor invProcessor;
	private PresentInventory presentInventory;
	private IItemState iItemState;

	public ItemService(){
		invProcessor = new InventoryProcessor();
		presentInventory = new PresentInventory();
		iItemState = new ItemState();
	}

	/**
	 * 
	 * @param partsList
	 */
	public void UpdateData(ItemModel[] partsList) {
		// TODO - implement ItemService.UpdateData
		throw new UnsupportedOperationException();
	}

	public void RecoverBackup() {
		// TODO - implement ItemService.RecoverBackup
		throw new UnsupportedOperationException();
	}

	public void ShowAll() {
		presentInventory.ShowAll();
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param partID
	 */
	public ItemModel ShowPart(int partID) {
		// TODO - implement ItemService.ShowPart
		throw new UnsupportedOperationException();
	}

	public void ApplyFilter() {
		// TODO - implement ItemService.ApplyFilter
		throw new UnsupportedOperationException();
	}

}