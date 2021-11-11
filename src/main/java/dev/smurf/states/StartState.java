package dev.smurf.states;

import dev.smurf.commands.Command;
import dev.smurf.commands.Connect;
import dev.smurf.results.Err;
import dev.smurf.results.Ok;

public class StartState implements State {
    private StartState(){}

    @Override
    public ResultContainer processCommand(Command command) {
        if (command instanceof Connect) {
            return new ResultContainer(Connected.CONNECTED, Ok.OK);
        } else {
            return new ResultContainer(START_STATE, Err.ERR);
        }
    }

    public static final StartState START_STATE = new StartState();
}
