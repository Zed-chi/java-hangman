class Game{
    private String answer;
    private static final int MAX_MISSES = 7;
    private int tries = MAX_MISSES;
    private String hits = "";
    private String misses = "";
    public Game(String answer){
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter){
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1){
            throw new IllegalArgumentException(letter + " has already guessed");
        }
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit){
            hits += letter;            
        } else {
            misses += letter;
        }
        return isHit;
    }

    public String getCurrentProgress(){
        String progress = "";
        for (char l: answer.toCharArray()){
            char display = '-';
            if(hits.indexOf(l) != -1){
                display = l;
            }
            progress += display;
        }
        tries--;
        return progress;
    }

    public int getRemainingTries(){
        return tries;
    }
}