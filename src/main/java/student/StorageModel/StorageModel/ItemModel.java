package student.StorageModel.StorageModel;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ItemModel implements IItemModel {

	private int partID;
	private int quantity;

	public ItemModel(){};

	public ItemModel(int partID, int quantity) {
		this.partID = partID;
		this.quantity = quantity;
	}

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
		ItemModel itemModel1 = new ItemModel(1, 2);
		ItemModel itemModel2 = new ItemModel(2, 3);
		ItemModel itemModel3 = new ItemModel(3, 4);
		ItemModel itemModel4 = new ItemModel(4, 5);
		ItemModel itemModel5 = new ItemModel(5, 6);
		ItemModel itemModel6 = new ItemModel(6, 7);

		ItemModel[] itemList = new ItemModel[6];
		itemList[0] = itemModel1;
		itemList[1] = itemModel2;
		itemList[2] = itemModel3;
		itemList[3] = itemModel4;
		itemList[4] = itemModel5;
		itemList[5] = itemModel6;
		return itemList;
	}

	public int getPartID() {
		return partID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPartID(int partID) {
		this.partID = partID;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}