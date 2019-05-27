package exercises.gameshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameShop {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine();

        boolean operation = true;

        while (operation) {
            try {
                Game game = gameCreator();
                int change = gameMachine.buyGame(game);
                sumrize(game, change);
                operation = false;
            } catch (InputMismatchException e) {
                System.err.println("Błędny format danych");
            } catch (NoSuchGameException | WrongPriceException e) {
                System.err.println(e.getMessage());
            }finally {
                scanner.nextLine();
            }
        }
    }

    public static Game gameCreator(){
        System.out.println("Podaj nazwe gry:");
        String name = scanner.nextLine();
        System.out.println("Wpłać pieniądze");
        int price = scanner.nextInt();
        return new Game(price,name);
    }

    public static void sumrize(Game game, int change){
        System.out.printf("Odbierz gre: %s\n",game.getName());
        if(change>0) {
            System.out.printf("Odbierz reszte: %d zł",change);
        }
    }
}
