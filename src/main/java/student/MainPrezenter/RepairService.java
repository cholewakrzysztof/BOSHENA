package student.MainPrezenter;

import student.OrdersApi.IRepairsClient;
import student.OrdersApi.Prezenter.RepairsController;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;

public class RepairService implements IRepairsClient {
    IRepairsClient client = new RepairsController();

    @Override
    public int CreateDevice(IDeviceModel device) {
        System.out.println("Create device call RepairsApi success");
        return client.CreateDevice(device);
    }

    @Override
    public int CreateRepair(int deviceId) {
        System.out.println("Create repair call RepairsApi success");
        return client.CreateRepair(deviceId);
    }
}