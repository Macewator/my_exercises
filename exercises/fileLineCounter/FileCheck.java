package exercises.fileLineCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) {
        Map<String,Integer> fileLineMap = new HashMap<>();
        String filePath = pathGiver();
        searchFile(filePath,fileLineMap);
    }

    public static String pathGiver(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżke pliku:");
        return scanner.nextLine();
    }

    public static void searchFile(String filePath,Map<String,Integer> fileLineMap){
        File file = new File(filePath);
        int numbersOfLine;
        File[] files = file.listFiles();

        if(files != null){
            for (File f: files){
                if(f.isDirectory()){
                    searchFile(f.getAbsolutePath(),fileLineMap);
                }else {
                    numbersOfLine = lineCounter(f);
                    dataKeeper(f,numbersOfLine,fileLineMap);
                }
            }
        }
        printResult(fileLineMap);
    }

    private static int lineCounter(File file){
        int numbersOfLine = 0;
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(fileReader)
                ){
            String line;
            while((line = buffer.readLine()) != null){
                numbersOfLine++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return numbersOfLine;
    }

    private static void dataKeeper(File file, int numbersOfLine, Map<String,Integer> fileLineMap){
        fileLineMap.put(file.getAbsolutePath(),numbersOfLine);
    }

    private static void printResult(Map<String,Integer> fileLineMap){
        int totalLineNumber = 0;
        for (String filePath: fileLineMap.keySet()){
            totalLineNumber += fileLineMap.get(filePath);
            System.out.println(filePath + " -> " + fileLineMap.get(filePath));
        }
        System.out.println("Całkowita lczba lini: " + totalLineNumber);
    }
}
