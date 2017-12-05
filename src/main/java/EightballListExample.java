import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EightballListExample {

    private ArrayList<String> answers;

    public EightballListExample() {
        this.answers = new ArrayList<>();
    }

    public int numberOfEntries() {
        return this.answers.size();
    }

    public void addOption(String word) {
        this.answers.add(word);
    }

    public Object randomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

//    public void addEntry()
//    Scanner input = new Scanner(System.in);
//    System.out.println("Please enter an eightball response : ");
//    entry = input.next();

}
