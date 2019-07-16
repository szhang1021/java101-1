import java.util.Random;

public class Main
{
	public static void main(String[] args) {
    String [] words = new String [] {"plane", "car","bike","train","elephant"};
    Random rand = new Random();
    int randomIndex = rand.nextInt(words.length-1);
    System.out.println(words[randomIndex]);
    char [] oldinput = new char [25];
    while (true){
    String input = System.console().readLine();
    char inputCharacter = input.charAt(0);
    boolean letter = false;
    for (int i = 0; i<words[randomIndex].length(); i++){
        if (words[randomIndex].charAt(i)==inputCharacter){
            letter = true;
        }
    }
    if(letter ==true){
        System.out.println("correct");
    }
    else{
        System.out.println("incorrect");
    }
    if(oldinput [25]== inputCharacter){
        System.out.println("already entered");
    }
    
	}
	}
}
