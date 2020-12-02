    package se.lexicon.domas;

public class App 
{
    public static void main( String[] args ){
        int newScore = calculateScore("Tim", 500);
        System.out.println("newScore is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimetres = calcFeetAndInchesToCentimetres(6,0);
        if (centimetres < 0.0) {
            System.out.println("Invalid parametres");
        }

        calcFeetAndInchesToCentimetres(157);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, np player score.");
        return 0;
    }

    // Omitted

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if ((feet<0) || ((inches<0) || (inches>12))) {
            System.out.println("Invalid feet or inches parametres");
            return -1;
        }
        double centimetres = (feet * 12) * 2.54;
        centimetres += inches *2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimetres + " cm");
        return centimetres;
    }
    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches <0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }
}


