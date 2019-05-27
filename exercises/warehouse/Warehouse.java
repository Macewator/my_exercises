package exercises.magazyn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<String> dataList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();

    private void loadData() {
        try{
            String fileName = "data.csv";
            dataList = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void creatProductFromData() {
        String[] dataLine;
        for (String line:dataList) {
            dataLine = line.split(";");
            String productName = dataLine[0];
            int productAmount = Integer.valueOf(dataLine[1]);
            String precentage = percentageData(productAmount);
            productList.add(new Product(productName, productAmount, precentage ));
        }
    }

    private String percentageData(int amount){
        String precentage = "";
        int loop = amount/10;
        if(amount%10>5){
            loop += 1;
        }
        for (int i = 0; i<loop; i++){
            precentage += "*";
        }
        return precentage;
    }

    public void warehouseData(){
        loadData();
        creatProductFromData();
        printData();
    }

    private void printData(){
        productList.forEach(product -> System.out.printf("%-30s (%d) %s\n",
                product.getProductName(),product.getProductAmount(),product.getPercentage()));
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.warehouseData();
    }
}
