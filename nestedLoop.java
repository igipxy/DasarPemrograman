public class nestedLoop {
    public static void main(String[] args) {
        int room;
        int floor;

        for (floor = 1; floor <= 8; floor++) {
            System.out.println("Floor " + floor + ":");
            for (room = 1; room <= 16; room++) {
                System.out.print("  Room " + room);
            }
        System.out.println();    
        }


        
    }
}
