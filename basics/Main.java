import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(5);
        clock();
    }

    public static String pluralize(String name, int number){
        return (number == 0 || number > 1 ? name +"s" : name);
    }

    public static void flipNHeads(int n){
        int counter=0;
        int numberOfFlip=0;
        while (counter < n){
            if (Math.random() < .5){
                System.out.println("tails");
            }else {
                counter++;
                System.out.println("heads");
            }
            numberOfFlip++;
        }
        System.out.println("It took " + numberOfFlip + " flips to flip " + n+ " head in a row.");
    }

    public static void clock(){
        new Timer();
        javax.swing.Timer timer =new  javax.swing.Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                }
        });
        timer.start();
    }
}