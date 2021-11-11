package dev.smurf.states;

import dev.smurf.commands.Command;
import dev.smurf.commands.Pass;
import dev.smurf.commands.Quit;
import dev.smurf.results.Err;
import dev.smurf.results.Ok;

public class Authorization extends BaseState {
    private Authorization() {
    }

    @Override
    public ResultContainer processCommand(Command command) {
        //считаем что пароль всегда правильный
        if (command instanceof Pass) {
            return createResult(Transaction.TRANSACTION, Ok.OK);
        } else if (command instanceof Quit) {
            return createResult(StartState.START_STATE, Ok.OK);
        } else {
            return createResult(AUTHORIZATION, Err.ERR);
        }
    }

    public static final Authorization AUTHORIZATION = new Authorization();
}
