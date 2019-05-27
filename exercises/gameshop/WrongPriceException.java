package exercises.gameshop;

public class WrongPriceException extends Exception{

    public WrongPriceException(int userPrice, int gamePrice) {
        super(String.format("Wpłaciłeś %d, wymagana kwota to: %d",userPrice,gamePrice));
    }
}
