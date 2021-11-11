package dev.smurf.states;

import dev.smurf.commands.Command;

public interface State {
    ResultContainer processCommand(Command command);
}
