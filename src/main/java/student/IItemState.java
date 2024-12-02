package student;

import student.StorageModel.StorageModel.IItemModel;

public interface IItemState {

	/**
	 * 
	 * @param item
	 */
	boolean InsertItem(IItemModel item);

	/**
	 * 
	 * @param item
	 */
	int UpdateItem(IItemModel item);

	StorageModel.StorageModel.ItemModel[] SelectItemsToDisplay();
}