package student.OrdersApiModel.OrdersApiModel;

import student.OrdersApi.IRepairState;
import student.OrdersApiModel.OrdersApiModel.State;

import java.sql.Connection;
import java.util.concurrent.locks.Condition;

public class RepairState implements IRepairState, State {
    @Override
    public boolean InsertRepair(IRepairModel repair) {
        this.Connect();
        System.out.println("Insert repair success\n");
        this.Disconnect();
        return true;
    }

    @Override
    public int UpdateRepair(IRepairModel repair) {
        this.Connect();
        System.out.println("Update repair success\n");
        this.Disconnect();
        return 15;
    }

    @Override
    public IDeviceModel SelectDevice(int deviceId) {
        return new DeviceModel("BOSHENA from database", DeviceCondition.New, "No comment", false, 15, new DevicePart[] {});
    }

    @Override
    public boolean Disconnect() {
        System.out.println("Disconnect to database success\n");
        return false;
    }

    @Override
    public Connection Connect() {
        System.out.println("Connect to database success\n");
        return null;
    }
}