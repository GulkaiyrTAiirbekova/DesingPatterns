package Behavioral.State;

//Concrete States
class OffState implements FanState{
    @Override
    public void handleRequest(Fan fan){
        System.out.println("Fan turned on low.");
        fan.setState(new LowState());

    }
    @Override
    public void undoRequest(Fan fan) {
        System.out.println("Already Off. Can't undo");

    }
}

