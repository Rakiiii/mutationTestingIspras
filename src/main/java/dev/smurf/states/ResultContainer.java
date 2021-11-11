package dev.smurf.states;

import dev.smurf.results.Result;

public class ResultContainer {
    private final State nextState;
    private final Result result;

    public ResultContainer(State _nextState, Result _result) {
        nextState = _nextState;
        result = _result;
    }

    public State getNextState() {
        return nextState;
    }

    public Result getResult() {
        return result;
    }
}
