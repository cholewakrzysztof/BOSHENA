package student;

import student.StorageModel.StorageModel.IItemModel;
import student.StorageModel.StorageModel.ItemModel;

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

	ItemModel[] SelectItemsToDisplay();
}