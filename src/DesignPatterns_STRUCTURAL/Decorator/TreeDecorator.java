package src.DesignPatterns_STRUCTURAL.Decorator;


public abstract class TreeDecorator implements ChristmasTree {

    protected ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
