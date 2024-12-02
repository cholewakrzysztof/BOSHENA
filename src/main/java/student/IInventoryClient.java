package student;

public interface IInventoryClient {

	/**
	 * 
	 * @param partsList
	 */
	void UpdateData(StorageModel.StorageModel.ItemModel[] partsList);

	void RecoverBackup();

	void ShowAll();

	/**
	 * 
	 * @param partID
	 */
	StorageModel.StorageModel.ItemModel ShowPart(int partID);

	void ApplyFilter();

	void CreateReplenishmentOrder();

	void DeleteReplenishmentOrder();

	void operation();

}