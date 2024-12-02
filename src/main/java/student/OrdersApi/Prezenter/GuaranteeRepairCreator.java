package student.OrdersApi.Prezenter;

import student.OrdersApi.Prezenter.IRepairCreator;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;

public class GuaranteeRepairCreator implements IRepairCreator {
    @Override
    public IRepairModel CreateRepair(IDeviceModel device) {
        return null;
    }
}