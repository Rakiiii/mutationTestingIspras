package dev.smurf.states;

import dev.smurf.commands.Command;
import dev.smurf.commands.Quit;
import dev.smurf.commands.TransactionCommands;
import dev.smurf.results.Err;
import dev.smurf.results.Ok;

public class Transaction extends BaseState {
    private Transaction() {
    }

    @Override
    public ResultContainer processCommand(Command command) {
        if (command instanceof Quit) {
            return createResult(StartState.START_STATE, Ok.OK);
        } else if (command instanceof TransactionCommands) {
            return createResult(TRANSACTION, Ok.OK);
        } else {
            return createResult(TRANSACTION, Err.ERR);
        }
    }

    public static final Transaction TRANSACTION = new Transaction();
}
