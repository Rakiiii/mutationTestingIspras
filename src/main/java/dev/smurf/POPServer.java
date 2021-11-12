package dev.smurf;

import dev.smurf.commands.Command;
import dev.smurf.results.Result;
import dev.smurf.states.ResultContainer;
import dev.smurf.states.StartState;
import dev.smurf.states.State;

import java.util.LinkedList;
import java.util.List;

public final class POPServer {

    private final LinkedList<Result> executedResults = new LinkedList<>();

    private State currState = StartState.START_STATE;

    public List<Result> execCommands(List<Command> commands) {
        for (Command command : commands) {
            execCommand(command);
        }
        return new LinkedList<>(executedResults);
    }

    private void execCommand(Command command) {
        ResultContainer result = currState.processCommand(command);
        executedResults.add(result.getResult());
        currState = result.getNextState();
    }
}
