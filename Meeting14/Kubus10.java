package Meeting14;

public class Kubus10 {
    static int calculateVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int calcukateArea(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;
        int volume = calculateVolume(sisi);
        int area = calcukateArea(sisi);

        System.out.println("Volume Kubus dengan sisi " + sisi + " adalah: " + volume);
        System.out.println("Luas Permukaan Kubus dengan sisi " + sisi + " adalah: " + area);
    }
}
