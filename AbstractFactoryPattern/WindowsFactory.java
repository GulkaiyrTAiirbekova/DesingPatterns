package AbstractFactoryPattern;


import java.awt.*;

/**
 * Each concrete factory extends basis factory and responsible for creating
 *  products of a single variety
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
    @Override
    public checkbox createCheckbox(){
        return new WindowsChechbox();

    }
}
