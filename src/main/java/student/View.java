package student;


import student.MainPrezenter.IOrderFacade;
import student.MainPrezenter.IWorkerFacade;
import student.MainPrezenter.OrderFacade;
import student.MainPrezenter.WorkerFacade;
import student.StorageModel.StorageModel.ItemModel;

import java.io.IOException;
import java.util.Scanner;

public class View {

	private IWorkerFacade workerFacade;
	private IOrderFacade orderFacade;
	private IInventoryClient inventoryClient;

	public View() {
		workerFacade = new WorkerFacade();
		orderFacade = new OrderFacade();
	}

	public void ExecuteUseCases() throws IOException {
		System.out.printf("Wykonaj PU: \n");
		System.out.printf("PU1: Podglad stanu calego magazynu:       a\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy:          b\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:   c\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta: d\n");

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");
		String result = myObj.nextLine();

		switch (result) {
			case "a": {
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