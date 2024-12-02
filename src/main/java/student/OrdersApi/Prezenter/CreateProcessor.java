package student.OrdersApi.Prezenter;

import student.IAction;
import student.OrdersApi.Prezenter.IOrderCreation;

public class CreateProcessor implements IOrderCreation {
    @Override
    public boolean Handle(IAction action) {
        return false;
    }

    @Override
    public void setNext(IOrderCreation next) {

    }
}