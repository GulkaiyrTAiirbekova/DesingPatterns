package Behavioral.State;
//Context
public class Fan {
    private FanState currentState;

    public Fan(){
        this.currentState = new OffState();
    }

    public void setState(FanState state) {
        this.currentState = state;
    }
    public void requests(){
        currentState.handleRequest(this);
    }
    public void cancel(){
        currentState.undoRequest(this);
    }

}
