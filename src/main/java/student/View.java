package student;

import student.MainPrezenter.IOrderFacade;
import student.MainPrezenter.IWorkerFacade;
import student.MainPrezenter.OrderFacade;
import student.MainPrezenter.WorkerFacade;
import student.OrdersApiModel.OrdersApiModel.*;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class View {

	private IWorkerFacade workerFacade;
	private IOrderFacade orderFacade;
	private IInventoryClient inventoryClient;

	private int[] mockRepairId = new int[] { 1, 2 };
	private IDeviceModel mockDevice = new DeviceModel("Bosh", DeviceCondition.Used, "Zarysowane");
	private IOrderModel mockOrder = new OrderModel(OrderStatus.accepted, 1,mockRepairId, new Date());

	public View() {
		workerFacade = new WorkerFacade();
		orderFacade = new OrderFacade();
	}

	public void ExecuteUseCases() throws IOException {
		System.out.printf("Wykonaj PU: \n");
		System.out.printf("PU4 stworzenie zlecenia naprawy bez przypisania serwisanta:          a\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy z przypisaniem serwisanta:          aa\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:                              b\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta:                            c\n");

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");
		String result = myObj.nextLine();

		switch (result) {
			case "a": {
				this.orderFacade.CreateOrder(mockDevice, mockOrder,10,1);
				break;
			}
			case "aa": {
				this.orderFacade.CreateOrder(mockDevice, mockOrder,0,1);
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