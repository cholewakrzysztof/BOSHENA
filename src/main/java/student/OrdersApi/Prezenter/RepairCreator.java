package student.OrdersApi.Prezenter;

import student.OrdersApi.IRepairState;
import student.OrdersApi.Prezenter.IRepairCreator;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;
import student.OrdersApiModel.OrdersApiModel.RepairModel;
import student.OrdersApiModel.OrdersApiModel.RepairState;

import java.util.Date;

public class RepairCreator implements IRepairCreator {

    @Override
    public IRepairModel CreateRepair(IDeviceModel device) {
        IRepairState state = new RepairState();
        IRepairModel model = new RepairModel(device.GetGoodPars(), device.GetBrokenParts(), new Date());

        state.InsertRepair(model);

        return model;
    }
}