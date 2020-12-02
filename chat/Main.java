import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        printLastNLines(2);
    }

    private static void printLastNLines(int count) {

        try (FileInputStream fin = new FileInputStream(
                "/Users/aleksejleonov/IdeaProjects/level3.3/src/test.txt"
        );
             BufferedReader br = new BufferedReader(new InputStreamReader(fin))
        ) {
            String line;
            List<String> tempLines = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine())!= null) {
                tempLines.add(line);
            }
            for (int i = count; i < tempLines.size(); i++) {
                System.out.println(tempLines.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }


