package student.WorkersApiPrezenter;

import student.IAction;

public class Action implements IAction {
    ActionEnum actionEnum;

    public Action(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    @Override
    public ActionEnum GetAction() {
        return this.actionEnum;
    }
}
