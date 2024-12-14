package com.designpatterns_mosh.state.abuse;

public class RunningState implements State{
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch){
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrent_state(new StoppedState(stopwatch));
        System.out.println("Stopped");
    }
}
