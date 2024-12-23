package student;

import student.StorageModel.StorageModel.ItemModel;

public interface IInventoryClient {

	/**
	 * 
	 * @param partsList
	 */
	void UpdateData(ItemModel[] partsList);

	void RecoverBackup();

	void ShowAll();

	/**
	 * 
	 * @param partID
	 */
	ItemModel ShowPart(int partID);

	void ApplyFilter();

	void CreateReplenishmentOrder();

	void DeleteReplenishmentOrder();

	void operation();

}