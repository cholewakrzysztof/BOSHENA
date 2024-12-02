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
		System.out.printf("PU9: Aktualizacja stanu magazynu:                c\n");
		System.out.printf("PU10: Przywrocenie ostatniej wersji magazynu:    d\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy:                 e\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:          f\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta:        g\n");

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");
		String result = myObj.nextLine();

		switch (result) {
			case "a": {
				inventoryClient.ShowAll();
				break;
			}
			case "b": {
				System.out.println("Podaj id czesci: ");
				Scanner partIDScanner = new Scanner(System.in);
				int partID = partIDScanner.nextInt();
				inventoryClient.ShowPart(partID);
				System.out.println("PartID: " + partID + " Quantity: " + inventoryClient.ShowPart(partID).getQuantity());
				break;
			}
			case "c": {
				break;
			}
			case "d":{
				break;
			}
			case "e":{

			}
			case "f":{

			}
			case "g":{

			}
			default: {
				return;
			}
		}
	}

}