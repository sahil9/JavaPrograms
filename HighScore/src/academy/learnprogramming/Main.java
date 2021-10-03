package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String Sahil, Abc, xyz, asd;
        displayHighScorePosition( "Sahil", calculateScore(1500) );
        displayHighScorePosition( "Abc", calculateScore(900) );
        displayHighScorePosition( "xyz", calculateScore(400) );
        displayHighScorePosition( "asd", calculateScore(50) );


    }

    public static void displayHighScorePosition( String playerName, int position){
        System.out.println(playerName + " managed to get into the position " + position + " on the highscore table");
    }
    public static int calculateScore (int playerScore){
        if(playerScore > 1000)
            return 1;
        else if (playerScore > 500 && playerScore < 1000)
            return 2;
        else if (playerScore > 100 &&  playerScore < 500)
            return 3;
        else
            return 4;

    }
}
