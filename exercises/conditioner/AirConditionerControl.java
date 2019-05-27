package exercises.conditioner;

import java.util.Scanner;

public class AirConditionerControl {

    private static final int EXIT = 0;
    private static final int DIRECTOR_ROOM = 1;
    private static final int BREAK_ROOM = 2;
    private static final int ALL_ROOM = 3;

    private Scanner scanner;
    private Block block;


    public AirConditionerControl() {
        scanner = new Scanner(System.in);
        block = new Block();
    }

    public void roomControl()throws InterruptedException{
        options();
        int option;
        while ((option = scanner.nextInt()) != EXIT){
            scanner.nextLine();
            Room room = null;
            if(option != ALL_ROOM) {
                room = block.getRooms()[option-1];
            }
            if(option == DIRECTOR_ROOM ){
                airConditioner(room);
            }else if(option == BREAK_ROOM){
                airConditioner(room);
            }else if(option == ALL_ROOM){
                allAirConditioner(block);
            }

            options();
        }
    }

    private void options(){
        System.out.println("1 - Turn on, director room air conditioner");
        System.out.println("2 - Turn on, break room air conditioner");
        System.out.println("3 - Turn on, all air conditioner");
        System.out.println("0 - Turn on, exit form control panel");
    }

    private void roomTempConfig(Room room){
        System.out.println("Podaj obecna temperature");
        room.setRoomTemp(scanner.nextDouble());
        System.out.println("Podaj temperature docelową");
        room.setTargetTemp(scanner.nextDouble());
    }

    private void airConditioner(Room room)throws InterruptedException{
        roomTempConfig(room);
        while(room.getRoomTemp() > room.getTargetTemp()){
            room.coolRoom();
            System.out.printf("Temp: %.2f \n", room.getRoomTemp());
            Thread.sleep(1000);
        }
    }

    private void roomConditionerDisplay(Room room){
        if(room.getRoomTemp() > room.getTargetTemp()){
            room.coolRoom();
        }
    }
    private void roomConditionerStop(Room room)throws InterruptedException{
        boolean cool = true;
        while (cool){
            roomConditionerDisplay(room);
            System.out.printf("Temp in %s: %.2f \n", room.getName(), room.getRoomTemp());
            if(room.getRoomTemp() <= room.getTargetTemp())
                cool = false;
            Thread.sleep(1000);
        }
    }

    private void allConditionerConfig(Block block)throws InterruptedException{
        roomConditionerStop(block.getRooms()[0]);
        roomConditionerStop(block.getRooms()[1]);
    }

    private void allAirConditioner(Block block)throws InterruptedException{
        for (Room room:block.getRooms()){
            roomTempConfig(room);
        }
        allConditionerConfig(block);
    }
}
