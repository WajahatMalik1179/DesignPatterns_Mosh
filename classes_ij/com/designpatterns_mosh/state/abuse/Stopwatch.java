package com.designpatterns_mosh.state.abuse;

public class Stopwatch {
    private State current_state = new StoppedState(this);
    public void click(){
        current_state.click();
    }

    public State getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(State current_state) {
        this.current_state = current_state;
    }
}
