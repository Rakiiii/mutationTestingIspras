package dev.smurf.states;

import dev.smurf.results.Result;

public abstract class BaseState implements State {
    protected ResultContainer createResult(State state, Result result) {
        return new ResultContainer(state,result);
    }
}
