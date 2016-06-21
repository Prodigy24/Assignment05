
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            String Word; //Will be used to store and edit the entered word
            Scanner input = new Scanner(System.in);
            String OWord; //Keep track of original word
            System.out.println("Please enter a word");
            Word = input.nextLine(); //X is the variable representing the word
            Word = Word.toLowerCase();  //Changes inputted word to lower case
            String FirstP; //FirstP is used to store first part of the word in the event it doesn't start with a vowel.
            OWord = Word;//OWord stores original word 
            if (OWord.equals("end")) { //Ends program if user types end
                break;
            }
            int Z = Word.length();
            if (Word.startsWith("a") || Word.startsWith("e") || Word.startsWith("i") || Word.startsWith("o") || Word.startsWith("u")) { //Check for beginning vowel
                Word = Word.substring(1); //Removes first letter
                Word = ("i" + Word); //Inserts an i into the beginning
                if (Word.endsWith("a") || Word.endsWith("e") || Word.endsWith("i") || Word.endsWith("o") || Word.endsWith("u") || Word.endsWith("y")) { //Ends with vowel?
                    Word = (Word + "h"); //Adds the h if the word ends in a vowel
                }
                Word = (Word + "ee");//Adds the ee to the end
            } else { //If no vowel @ beginning
                FirstP = Word.substring(0, 1);
                StringBuilder SBuilder = new StringBuilder(Word);
                for (int i = 0; i < SBuilder.length(); i++) { //Counts up to the first vowel
                    if (SBuilder.charAt(i) == 'o' || SBuilder.charAt(i) == 'a' || SBuilder.charAt(i) == 'i' || SBuilder.charAt(i) == 'e' || SBuilder.charAt(i) == 'u' || SBuilder.charAt(i) == 'y') { //Trying to use the position of vowel to copy the beginning of the string
                        FirstP = Word.substring(0, i); //Copies first part of word for placement at the end of the translated word
                        Word = Word.substring(i + 1, Z); //Copies second part of word for the translated word
                        break;
                    }
                }
                Word = ("i" + Word + FirstP + "ee"); //Piece word together
            }
            System.out.println(OWord + " in Mattenenglisch is " + Word);
        }
    }
}
