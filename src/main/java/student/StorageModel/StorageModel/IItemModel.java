package student.StorageModel.StorageModel;

public interface IItemModel {

	/**
	 * 
	 * @param item
	 */
	boolean InsertItem(StorageModel.StorageModel.ItemModel item);

	/**
	 * 
	 * @param item
	 */
	int UpdateItem(StorageModel.StorageModel.ItemModel item);

	StorageModel.StorageModel.ItemModel[] SelectItemsToDisplay();

}