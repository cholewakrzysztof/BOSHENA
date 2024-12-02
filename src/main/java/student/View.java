package student;


import student.MainPrezenter.IOrderFacade;
import student.MainPrezenter.IWorkerFacade;
import student.MainPrezenter.OrderFacade;
import student.MainPrezenter.WorkerFacade;
import student.OrdersApiModel.OrdersApiModel.*;
import student.magazynPrezenter.Prezenter.InventoryControler;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class View {

	private IWorkerFacade workerFacade;
	private IOrderFacade orderFacade;
	private IInventoryClient inventoryClient;

	private DevicePart[] mockBrokenParts = new DevicePart[] { new DevicePart("BOSH", "1234", true)};
	private DevicePart[] mockGoodParts = new DevicePart[] { new DevicePart("BOSH", "54321", false)};


	private int[] mockRepairId = new int[] { 1, 2 };
	private IDeviceModel mockDeviceGuarantee = new DeviceModel("Bosh", DeviceCondition.New, "Wada fabryczna", true, 1, mockBrokenParts);
	private IDeviceModel mockDeviceNormal = new DeviceModel("Bosh", DeviceCondition.Used, "Zarysowane", false, 2, mockGoodParts);
	private IOrderModel mockOrder = new OrderModel(OrderStatus.accepted, 1,mockRepairId, new Date());


	public View() {
		workerFacade = new WorkerFacade();
		orderFacade = new OrderFacade();
		inventoryClient = new InventoryControler();
	}

	public void ExecuteUseCases() throws IOException {
		System.out.printf("\n\nWykonaj PU: \n");
		System.out.printf("PU4 stworzenie zlecenia naprawy bez przypisania serwisanta:          a\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy z przypisaniem serwisanta:          aa\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:                              b\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta:                            c\n");
		System.out.printf("Wykonaj PU: \n");
		System.out.printf("PU1: Podglad stanu calego magazynu:              a1\n");
		System.out.printf("PU2: Podglad stanu magazynowego wybranej czesci: b1\n");
		System.out.printf("PU9: Aktualizacja stanu magazynu:                c1\n");
		System.out.printf("PU10: Przywrocenie ostatniej wersji magazynu:    d1\n");
		System.out.printf("PU4 stworzenie zlecenia naprawy:                 e1\n");
		System.out.printf("PU21 przypisanie zlecenia serwisantowi:          f1\n");
		System.out.printf("PU20 aktualizacja dostepnosci serwisanta:        g1\n");

		Scanner myObj = new Scanner(System.in);

		String result = myObj.nextLine();

		switch (result) {
			case "a": {
				this.orderFacade.CreateOrder(mockDeviceGuarantee, mockOrder,10,1);
				this.orderFacade.CreateOrder(mockDeviceNormal, mockOrder,10,1);
				break;
			}
			case "aa": {
				this.orderFacade.CreateOrder(mockDeviceGuarantee, mockOrder,0,1);
				this.orderFacade.CreateOrder(mockDeviceNormal, mockOrder,0,1);
				break;
			} case "a1": {
				inventoryClient.ShowAll();
				break;
			}
			case "b1": {
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