package student.StorageModel.StorageModel;

public class ItemModel implements IItemModel {

	private int partID;
	private int quantity;

	@Override
	public boolean InsertItem(ItemModel item) {
		return false;
	}

	@Override
	public int UpdateItem(ItemModel item) {
		return 0;
	}

	@Override
	public ItemModel[] SelectItemsToDisplay() {
		return new ItemModel[0];
	}
}