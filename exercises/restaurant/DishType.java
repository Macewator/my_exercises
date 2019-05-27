package exercises.restaurant;

public enum DishType {
    DESSERT("Desery"),
    PASTA("Makarony"),
    MEAT("Dania mięsne");

    private String type;

    DishType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static void showDishType(){
        for (DishType type: DishType.values()){
            System.out.println(type.getType());
        }
    }

    public static DishType select(String type){
        DishType[] values = DishType.values();
        for (DishType dishType: values){
            if(dishType.getType().toLowerCase().equals(type.toLowerCase())){
                return dishType;
            }
        }
        throw new IllegalArgumentException("Nieprawidłowe kryterium sortowania " + type);
    }
}
