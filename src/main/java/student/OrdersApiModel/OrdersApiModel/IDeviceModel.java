package student.OrdersApiModel.OrdersApiModel;

public interface IDeviceModel {
    boolean IsGuarantee();
    int GetId();
    DevicePart[] GetBrokenParts();
    DevicePart[] GetGoodPars();
}