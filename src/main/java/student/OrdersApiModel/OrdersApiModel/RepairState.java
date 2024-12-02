package student.OrdersApiModel.OrdersApiModel;

import student.OrdersApi.IRepairState;
import student.OrdersApiModel.OrdersApiModel.State;

import java.sql.Connection;

public class RepairState implements IRepairState, State {
    @Override
    public boolean InsertRepair(IRepairModel repair) {
        return false;
    }

    @Override
    public int UpdateRepair(IRepairModel repair) {
        return 0;
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