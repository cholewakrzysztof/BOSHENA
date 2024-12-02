package student.StorageModel.StorageModel;

public interface IItemModel {

	/**
	 * 
	 * @param item
	 */
	boolean InsertItem(ItemModel item);

	/**
	 * 
	 * @param item
	 */
	int UpdateItem(ItemModel item);

	ItemModel[] SelectItemsToDisplay();

}