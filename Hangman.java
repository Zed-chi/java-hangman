class Hangman{
    public static void main(String[] args){
        Game game = new Game("Test");
        Promter promter = new Promter(game);
        while(game.getRemainingTries() > 0){
            promter.displayProgress();
            promter.promtForGuess();
        }                        
    }
}

