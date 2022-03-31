package net.ensan.codest.despat.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        WidgetFactory motifWidgetFactory = new MotifWidgetFactory();
        client.doOperation(motifWidgetFactory);
        WidgetFactory pmWidgetFactory = new PmWidgetFactory();
        client.doOperation(pmWidgetFactory);
    }

    public void doOperation(WidgetFactory widgetFactory) {
        ScrollBar scrollBar = widgetFactory.createScrollBar();
        Window window = widgetFactory.createWindow();

        scrollBar.scroll();
        window.draw();
    }
}
