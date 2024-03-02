public class Appliance implements Contrallable {

    public boolean isActive;

    @Override
    public void turnOn() {
        isActive = true;
        System.out.println("cihaz açıldı.");
    }

    @Override
    public void turnOff() {
        isActive = false;
        System.out.println("cihaz kapatıldı.");
    }

    @Override
    public boolean isOn() {
        return isActive;
    }

}