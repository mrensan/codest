package net.ensan.codest.despat.abstractfactory;

public class PmWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PmScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PmWindow();
    }
}
