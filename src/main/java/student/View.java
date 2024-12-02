package student;


import student.MainPrezenter.IOrderFacade;
import student.MainPrezenter.IWorkerFacade;
import student.MainPrezenter.OrderFacade;
import student.MainPrezenter.WorkerFacade;
import student.StorageModel.StorageModel.ItemModel;
import student.magazynPrezenter.Prezenter.InventoryControler;

import java.io.IOException;
import java.util.Scanner;

public class View {

	private IWorkerFacade workerFacade;
	private IOrderFacade orderFacade;
	private IInventoryClient inventoryClient;

	public View() {
		workerFacade = new WorkerFacade();
		orderFacade = new OrderFacade();
		inventoryClient = new InventoryControler();
	}

	public void ExecuteUseCases() throws IOException {
		System.out.printf("Wykonaj PU: \n");
		System.out.printf("PU1: Podglad stanu calego magazynu:              a\n");
		System.out.printf("PU2: Podglad stanu magazynowego wybranej czesci: b\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy:                 c\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:          d\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta:        e\n");

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");
		String result = myObj.nextLine();

		switch (result) {
			case "a": {
				inventoryClient.ShowAll();
				break;
			}
			case "b": {
				break;
			}
			case "c": {
				break;
			}
			default: {
				return;
			}
		}
	}

}