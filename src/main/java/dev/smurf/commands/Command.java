package dev.smurf.commands;

@FunctionalInterface
public interface Command {
    Object getParams();
}
