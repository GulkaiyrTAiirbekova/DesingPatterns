//package AbstractFactoryPattern;
//
//public class MacOSFactory implements GUIFactory {
//    @Override
//    public Button createButton() {
//        return new MacOSButton();
//    }
//
//    @Override
//    public CheckBox createCheckBox() { // must return CheckBox
//        return new MacOSCheckBox();
//    }
//}
//
//public class WindowsFactory implements GUIFactory {
//    @Override
//    public Button createButton() {
//        return new WindowsButton();
//    }
//
//    @Override
//    public CheckBox createCheckBox() { // must return CheckBox
//        return new WindowsCheckBox();
//    }
//}