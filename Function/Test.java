package Function;

public class Test {
    public static void malam() {
        System.out.println("NASIJUY ANJENG");

    }

    public static void siang() {
        System.out.println("Halo sir");
        System.out.println("halo mok");

    }

    public static void main(String[] args) {
        if (args[0].equals("siang")) {
            siang();
        } else {
            malam();
        }   
    }

}
