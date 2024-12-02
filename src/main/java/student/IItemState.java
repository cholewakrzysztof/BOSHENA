import StorageModel.StorageModel.*;

public interface IItemState {

	/**
	 * 
	 * @param item
	 */
	bool InsertItem(IItemModel item);

	/**
	 * 
	 * @param item
	 */
	int UpdateItem(IItemModel item);

	ItemModel[] SelectItemsToDisplay();

}