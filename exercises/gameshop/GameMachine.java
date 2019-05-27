package exercises.gameshop;

import java.util.HashMap;
import java.util.Map;

public class GameMachine {
    Map<String,Game> gameMap = new HashMap<>();

    public GameMachine() {
        addGame();
    }

    private void addGame(){
        gameMap.put("Cyberpunk",new Game(200,"Cyberpunk"));
        gameMap.put("Anthem",new Game(150,"Anthem"));
        gameMap.put("Metro",new Game(210,"Metro"));
        gameMap.put("Witcher",new Game(180,"Witcher"));
    }

    public int buyGame(Game userGame) throws NoSuchGameException, WrongPriceException{
        int change;
        if(!(gameMap.containsKey(userGame.getName()))){
            throw new NoSuchGameException(userGame.getName());
        }
        Game game = gameMap.get(userGame.getName());
        if(!(game.getPrice() <= userGame.getPrice())){
            throw new WrongPriceException(userGame.getPrice(),game.getPrice());
        }else {
            change = userGame.getPrice() - game.getPrice();
        }
        return change;
    }
}
