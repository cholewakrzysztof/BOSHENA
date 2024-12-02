package StorageModel.StorageModel;

public interface IItemModel {

	/**
	 * 
	 * @param item
	 */
	bool InsertItem(ItemModel item);

	/**
	 * 
	 * @param item
	 */
	int UpdateItem(ItemModel item);

	ItemModel[] SelectItemsToDisplay();

}