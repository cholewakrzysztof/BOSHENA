package student.StorageModel.StorageModel;

import student.IItemState;

public class ItemState implements IItemState {

	private IItemModel iItemModel;

	public ItemState() {
		iItemModel = new ItemModel();
	}

	public ItemState(int itemID){
		iItemModel = new ItemModel();
	}

	public void InsertItem() {
		// TODO - implement ItemState.InsertItem
		throw new UnsupportedOperationException();
	}

	public void UpdateItem() {
		// TODO - implement ItemState.UpdateItem
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean InsertItem(IItemModel item) {
		return false;
	}

	@Override
	public int UpdateItem(IItemModel item) {
		return 0;
	}

	public ItemModel SelectItemsToDisplay(int partID){
		return new ItemModel(partID, 5);
	}

	public ItemModel[] SelectItemsToDisplay() {
		return iItemModel.SelectItemsToDisplay();
		//throw new UnsupportedOperationException();

	}

}