import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Appliance[] appliances = { new Light(), new Thermostat(), new SecuritySystem() };

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(
                        "Hangi cihazı yönetmek istiyorsunuz? (0-çık, 1-ışık, 2-termostat, 3-güvenlik sistemi):");

                int no = scanner.nextInt();

                if (no == 0)
                    break;
                int index = no - 1;

                System.out.println("Hangi işlemi yapmak istiyorsunuz? (1-aç, 2-kapa):");
                no = scanner.nextInt();

                if (no == 1 && !appliances[index].isOn()) {
                    appliances[index].turnOn();
                } else if (no != 1 && appliances[index].isOn()) {
                    appliances[index].turnOff();
                }

                System.out.println("cihazın durumu: " + appliances[index].isActive);
            }
        }
    }
}
