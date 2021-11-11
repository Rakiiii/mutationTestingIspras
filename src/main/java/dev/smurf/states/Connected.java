package dev.smurf.states;

import dev.smurf.commands.Command;
import dev.smurf.commands.Quit;
import dev.smurf.commands.User;
import dev.smurf.results.Err;
import dev.smurf.results.Ok;

public class Connected extends BaseState {
    private Connected(){}

    @Override
    public ResultContainer processCommand(Command command) {
        if (command instanceof User) {
            return createResult(Authorization.AUTHORIZATION, Ok.OK);
        } else if (command instanceof Quit) {
            return createResult(StartState.START_STATE, Ok.OK);
        } else {
            return createResult(CONNECTED, Err.ERR);
        }
    }

    public static final Connected CONNECTED = new Connected();
}
