package net.ensan.codest.despat.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    // Using composition for adaptor pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convert(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convert(v, 40);
    }

    private Volt convert(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
