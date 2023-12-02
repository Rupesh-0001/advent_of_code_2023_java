import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1part1 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("day1.txt"));
            int totalSum = 0;

            String line;
            while ((line = reader.readLine()) != null) {
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
