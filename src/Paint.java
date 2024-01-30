import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Room room = new Room();

        System.out.println("Enter the length of the room in feet:");
        room.setLength(input.nextInt());
        input.nextLine();

        System.out.println("Enter the width of the room in feet:");
        room.setWidth(input.nextInt());
        input.nextLine();

        System.out.println("Enter the height of the room in feet:");
        room.setHeight(input.nextInt());
        input.nextLine();

        System.out.println("Enter the number of windows:");
        room.setWindows(input.nextInt());
        input.nextLine();

        System.out.println("Enter the number of doors:");
        room.setDoors(input.nextInt());
        input.nextLine();

        System.out.println("To paint the room, you will need " + room.paint());

        input.close();
    }
}
