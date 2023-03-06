package uebung0603;

public class ArrayLottery {
    public static void main(String[] args) {
        // a lottery with 2 arrays
        // 6 lottery numbers must be between 1 and 49

        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 7;
        myLotteryGuesses[1] = 28;
        myLotteryGuesses[2] = 33;
        myLotteryGuesses[3] = 42;
        myLotteryGuesses[4] = 13;
        myLotteryGuesses[5] = 19;

        int[] winningNumbers = getRandomLotteryNumbers(); //weisen unserer Methode diesen Array zu

        int countMatches = 0;


        for (int i = 0; i < myLotteryGuesses.length; i++) {
            if (myLotteryGuesses[i] == winningNumbers[i]) {
                countMatches = countMatches + 1;
            }
        }

        if (countMatches == 6) {
            System.out.println("Jackpot!");
        } else if (countMatches == 5) {
            System.out.println("Second prize!");
        } else if (countMatches == 4) {
            System.out.println("Third prize!");
        } else {
            System.out.println("You lost!");
        }


    }

    public static int[] getRandomLotteryNumbers() {
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++) {
            int number = (int) (Math.random() * 100); //Math ist wieder eine vorgegebene Methode, muss man von double in int umwandeln. (int), mal 100 weil der bereich in math von 0,00 bis 0,99 rechnet
            while (number > 49 || number == 0) { // z.B. 62 ist größer als 49, kann nciht ausgewählt werden, kleiner 1 auch nicht. Bereich muss zwischen 1 und 49 sein.
                number = (int) (Math.random() * 100); // soll die Methode noch einmal eine random Nummber auswählen
            }
            randomNumbers[i] = number;

        }
        return randomNumbers;


    }

}





