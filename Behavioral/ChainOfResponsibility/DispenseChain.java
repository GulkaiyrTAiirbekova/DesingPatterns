package Behavioral.ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain); //he term setNext in Java typically refers to a custom method used in the implementation of a linked list data structure to establish a link (or reference) between nodes. It is not a built-in Java keyword or standard library method like LinkedList.add().

    void dispense(Currency cur);

}
