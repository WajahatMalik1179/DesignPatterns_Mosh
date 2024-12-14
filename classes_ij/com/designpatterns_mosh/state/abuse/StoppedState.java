package com.designpatterns_mosh.state.abuse;

public class StoppedState implements State{
    private final Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrent_state(new RunningState(stopwatch));
        System.out.println("Running");
    }
}
