import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    // returns drawn lottery numbers of this lottery row
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    // randomizes new numbers for the lottery row
    // same number can only appear once in a lottery row
    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random random = new Random();
        // generate 7 lottery numbers
        // if the number already exist in the list,
        // skip it and add another one
        // use method containsNumber
        while (true) {
            if (numbers.size() < 7) {
                int lotNum = random.nextInt(40) + 1;
                if (!containsNumber(lotNum)) {
                    // add to the list of numbers
                    this.numbers.add(lotNum);
                }
            } else if (numbers.size() == 7) {
                break;
            }
        }
    }

    // tells whether the given number is included in the drawn numbers
    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int num : numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

}

