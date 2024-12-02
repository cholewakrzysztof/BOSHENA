package student.magazynPrezenter.Prezenter;

import student.IItemState;
import student.StorageModel.StorageModel.ItemModel;
import student.StorageModel.StorageModel.ItemState;

import java.util.Arrays;

public class PresentInventory {
	private IItemState itemState;

	public PresentInventory() {
		itemState = new ItemState();
	}

	public void ShowAll() {
		PrepareInventoryStateToDisplay();
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param partID
	 */
	public ItemModel ShowPart(int partID) {

		throw new UnsupportedOperationException();
	}

	public void ApplyFilter() {
		// TODO - implement PresentInventory.ApplyFilter
		throw new UnsupportedOperationException();
	}

	private void PrepareInventoryStateToDisplay() {
		ItemModel[] itemStates = itemState.SelectItemsToDisplay();
		for (int i = 0; i < itemStates.length; i++){
			System.out.println("PartID : " + itemStates[i].getPartID() + " Quantity: " + itemStates[i].getQuantity());
		}
		//throw new UnsupportedOperationException();
	}

	private void PreparePartStateToDisplay() {
		// TODO - implement PresentInventory.PreparePartStateToDisplay
		throw new UnsupportedOperationException();
	}

	private void PrepareFilterToApply() {
		// TODO - implement PresentInventory.PrepareFilterToApply
		throw new UnsupportedOperationException();
	}

}