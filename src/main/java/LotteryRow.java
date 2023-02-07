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
    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int randNum = random.nextInt(40) + 1;
            if (containsNumber(randNum)) {
                continue;
            }
            this.numbers.add(randNum);
        }
        // the method containsNumber is probably useful

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

