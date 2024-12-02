package student.OrdersApi.Prezenter;

import student.OrdersApi.Prezenter.RepairService;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;

public class RepairProvider implements IRepairProvider {
    @Override
    public int CreateRepair(int deviceId) {
        RepairService service = new RepairService();

        return service.CreateRepair(deviceId).GetId();
    }
}