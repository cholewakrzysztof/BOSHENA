package student.OrdersApiModel.OrdersApiModel;

import java.sql.Connection;

public interface State {

	boolean Disconnect();

	Connection Connect();

}