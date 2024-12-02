package student.OrdersApiModel.OrdersApiModel;

import student.OrdersApi.IOrderState;
import student.OrdersApiModel.OrdersApiModel.State;

import java.sql.Connection;

public class OrderState implements IOrderState, State {
    @Override
    public boolean InsertOrder(IOrderModel order) {
        return false;
    }

    @Override
    public int UpdateOrder(IOrderModel order) {
        return 0;
    }

    @Override
    public IOrderModel GetOrderById(int orderId) {
        return null;
    }

    @Override
    public IOrderModel DeleteOrder(int orderId) {
        return null;
    }

    @Override
    public boolean Disconnect() {
        return false;
    }

    @Override
    public Connection Connect() {
        return null;
    }
}