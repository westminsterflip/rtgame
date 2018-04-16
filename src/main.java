import java.util.Random;
import java.util.Scanner;

public class main {
    static Scanner s=new Scanner(System.in);
    static int in;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args){
        intro1();
    }

    static void print(String s){
        System.out.println(s);
    }

    static void intro1(){
        print(ANSI_RED+"Questioner: Tell me");
        print("Joe: What?");
        print("Questioner: Your story ... what you feel defined your life");
        print("Joe: You want my entire life story?  From birth to death?");
        print("Questioner: Well no.  ... just what is "+ANSI_CYAN+"important"+ANSI_RED);
        print(ANSI_RESET+"1. Well I died...\n2. I guess it started with that interview...\n"+ANSI_RED);
        System.out.print("Joe: ");
        while((in=s.nextInt())!=1&&in!=2){
            int r=(new Random().nextInt(6))+1;
            print(""+r);
            switch(r){
                case 1: System.out.print("uh... ");break;
                case 2: System.out.print("um... ");break;
                case 3: System.out.print("well... ");break;
                case 4: System.out.print("I... ");break;
                case 5: System.out.print("it . . well I...");break;
                case 6: System.out.print("...\nQuestioner: Come on, it's not that hard.\nJoe: ");break;
            }
        }
        if(in==1){
            print("Well I died; that's about it");
            return;
        }
        print("I guess it started with that interview with the institute"+ANSI_RESET+'\n'+"I received the letter in the mail that day:"+ANSI_GREEN+"\n\n\tJoe,\n\n\t\tyadda...yadda...yadda, blah blah blah\n\tWe want to drag you through more talks in\n\tuncomfortable clothes\n\n\tSincerely,\n\tSome stuck-up idiots\n\n"+ANSI_RESET+"I had taken that day off alrea-");
        print(ANSI_RED+"Questioner: Wait wait wait, what crap are you spinning me?\n"+ANSI_CYAN+"The Institute? "+ANSI_RED+"You telling me a sci-fi cliche?  This isn't Fallout.");
        print("Joe: yeah yeah ok - that's what I thought too, but it was one of the most highly regarded workplaces ar-");
        print("Questioner: And \"yadda yadda yadda\" and the idiots line? Was that really the letter?");
        print("Joe: I was paraphrasing, jesus can't I even start the story?");
        print("Questioner: *hrmmph*... I guess, just... never mind, continue");
    }
}