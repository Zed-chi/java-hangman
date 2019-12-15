import java.util.Scanner;

class Promter{
    private Game  game;

    public Promter(Game game){
        this.game = game;        
    }

    public boolean promtForGuess(){
        boolean isHit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        try{
            isHit = game.applyGuess(guess);    
        } catch (IllegalAccessError e){
            System.out.print(e.getMessage());
        }        
        return isHit;
    }

    public void displayProgress(){
        System.out.printf(
            "try to solve : %s%n", 
            game.getCurrentProgress()            
        );
    }

}