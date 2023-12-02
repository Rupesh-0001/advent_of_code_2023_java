package day1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1part2 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("day1.txt"));
            int totalSum = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("one", "on1e");
                line = line.replaceAll("two", "tw2o");
                line = line.replaceAll("three", "th3ree");
                line = line.replaceAll("four", "four4");
                line = line.replaceAll("five", "fiv5e");
                line = line.replaceAll("six", "six6");
                line = line.replaceAll("seven", "sev7en");
                line = line.replaceAll("eight", "eig8ht");
                line = line.replaceAll("nine", "nin9e");
                line = line.replaceAll("zero", "zer0o");
                String digits = line.replaceAll("\\D", "");
                int firstDigit = Character.getNumericValue(digits.charAt(0));
                int lastDigit = Character.getNumericValue(digits.charAt(digits.length() - 1));

                totalSum += lastDigit + (10 * firstDigit);
            }

            System.out.println(totalSum);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
