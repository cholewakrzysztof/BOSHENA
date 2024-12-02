package student.MainPrezenter;

import student.OrdersApi.IOrdersClient;
import student.OrdersApi.Prezenter.OrdersController;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class OrdersService implements IOrdersClient {
    IOrdersClient client = new OrdersController();

    @Override
    public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
        System.out.println("Call OrdersApi success\n");
        return client.CreateOrder(device, order, workerId, clientId);
    }
}