import java.util.Random;

public class diceRoll
 {
    public static void main(String[] args) 
    {
        //int totalAttempts=10;
        int successfulAttempts=0;

        for (int i=0; i<10; i++) {
            // Roll the dice
            int dice1 = rollDice();
            int dice2 = rollDice();

            // Display the result of the current attempt
            System.out.println("Attempt " + (i+1) + ": Dice 1: " + dice1 + ", Dice 2: " + dice2);

            // Check for a successful attempt
            if (dice1 == dice2) {
                System.out.println(" Successful attempt!");
                successfulAttempts++;
            }

            // Delay for 10 seconds
            try 
            {
                Thread.sleep(10000);
            }
             catch (Exception e)
              {
                
            }
        }

        // Display the overall result
        System.out.println("\nTotal successful attempts: " + successfulAttempts);
    }

    // Method to simulate rolling a six-sided die
        public static int rollDice() 
        {
         Random r = new Random();
        return r.nextInt(6) + 1;
    }
}

