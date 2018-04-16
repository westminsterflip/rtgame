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
        print("Joe: idiot\n"+ANSI_RESET+"Anyways, reading this letter I got both a feeling of impending doom and yet happiness.  This is what I had always wanted, but I feared the inevitable massacre of my free time.");
        print("I called the number in the signature line and got a deep, smooth female voice.  She introduced herself as Maera.  I immediately thought of Aquaman's wife and decided that I would treat the conversation as such.");
        print("I don't really remember the dialogue; even if I had been really paying attention it sped past faster than the last week had...\n");
        print("Somewhere along the way she said the cliche \"phone number for her to call me later.\" I had no real concept of how to deal with people, their emotions.  I knew computers, I knew how they worked, I knew why.");
        print("But this girl was a mystery, an enigma.  I wasn't smooth, funny, even slightly interesting...\n");
        print("Once I hung up I decided to go back to my pastime: watching TV while playing a game.  I don't know how many hours passed but I was startled by a sharp, piercing tone: my phone.  ");
        print("I stumbled up on numb legs to find the wretched noisemaker.  Normally it was silent and while I should have turned on the ringer while job-searching, I hadn't");
        print(ANSI_YELLOW+"1. I answered the phone...\n2. I ignored the call..."+ANSI_RESET);
        boolean fumb=false;
        while((in=s.nextInt())!=1&&in!=2){
            int r=(new Random().nextInt(2))+1;
            print(""+r);
            switch(r){
                case 1: System.out.print("I stood there blankly staring at my phone, trying in vain to make such a simple decision.  ");break;
                case 2: if(!fumb){System.out.print("I fumbled with my phone, dropping it into a pile of junk.  ");fumb=true;}else{System.out.println("After shoving my hand deep into the abyss of shattered electronics and dirty clothes I retrieved my phone, still ringing.  ");fumb=false;}break;
            }
        }
        if(in==1){
            print("I answered the phone having seen who was calling: Maera.  I don't know why I had spelled her name that way, but that's what popped into my mind and that's the name with which I stuck...\n");
            print("anyways.. ");
            if(new Random().nextInt(5)==1){
                print("Turns out this was one of the better things to happen, well, in a depressingly long time.  Besides calling to say that I had gotten the job she asked me out to a local dive.  I had never cared much for the fairly shitty food there so I suggested a somewhat classier,");
                print("if more expensive, bar closer to downtown.  We made a date for 6:13.");
                drinkwm();
            }else{
                print("As much as I hoped this would be a personal call, she sounded quite the businesslike professional.");
                if(new Random().nextInt(10)==6){
                    print("There was some good news, however; I had gotten the job");
                    print("I knew I should feel happy that my long job search had ended, but I couldn't help but feel disappointed that I would soon have responsibilities beyond feeding and cleaning myself.");
                }else{
                    print("She sounded almost apologetic, as if it were her fault.  I could almost see the worry lines etched in her face, an image of which I could vividly recall from our face to face interaction earlier that day.  ");
                    print(ANSI_RED+"Questioner: Wait, when did you have the interview?  You never mentioned that.  You're just skipping over that?");
                    print("Joe: Yeah... I figured it wasn't all that important.  Really Maera and I just had a little exchange and I went into an uncomfortably warm room and explained, in essence, why I wasn't at all suitable for the job.");
                    print(ANSI_RESET+"I didn't know at the time that it was, in fact, almost entirely her fault...");
                }
                if(new Random().nextInt(4)==2){
                    print("It wasn't all bad, however.  Once she had finished being the harbinger of my professional doom she quietly and gently asked me to wait.  I didn't have the slightest idea what she could be on about.");
                    print("I heard a small plastic bump; she had set the phone down on her desk but forgotten that the annoying muzak button existed.  Loud voices echoed down the stone hallways of the Institute reception and continued through the");
                    print("aging copper wires of our paradoxically new, old city.  I couldn't hear what they were discussing at such volume, but I got the feeling they weren't very happy about it.  I heard through the earpiece the sounds of heels");
                    print("clacking down the hallway in an angry staccato.  Maera let out an uncharacteristically irked sigh as I heard the sound of the chair's gas cylinder compress with the tired weight of a secretary forced to work in an atmosphere");

                    //add thing for you having to do stuff
                    print("of such buffoonery.  She whisked me up from the desk and, in a calmer but noticeably distressed voice asked me out to a bar near downtown.  I managed to find something reasonably clean and figured that was all the effort");
                    print("I'd give into a relationship that'd decidedly fail like all the others.");
                    drinkwm();
                }else{
                    print("Figuring that my life would continue sitting at the dead end at which I had sloppily parked myself for the past six years I went out to a bad dive for a stiff drink");
                    drink();
                }
            }
        }else{
            print("I ignored the call from Maera.  I had gone in for an interview earlier that day and I decidedly had done miserably.  Maera and I had seemed to hit it off when I was waiting for my time-slot, ");
            print("but I definitely didn't need both the needless drama of a relationship along with being hopelessly jobless.  After countless hours of staring at my TV, skipping a majority of the shows that ");
            print("failed to catch my attention, I resolved to get up on seldom used legs and gingerly walk myself down to a bar near my apartment, imagining myself as a large egg waiting to break and mess up  ");
            print("everything around it.");
            drink();
        }
    }

    static void drink(){
        print("");
        print("When I had finally managed to drag my sloth-like corpse down to the bar the \"bouncer\" outside the door looked at me with no small measure of skepticism, assuredly thinking I was already as intoxicated as");
        print("I needed to be.");
        if (new Random().nextInt(2)==1){//drove
            print("Despite the close proximity to my apartment I had chosen to take my beater of a car up from the mouldering garage to the illegal street parking not more than three blocks down the street.  ");
            if(new Random().nextInt(5)==3){//not drunk
                print("Somehow I managed to pace myself, playing pool more than drinking.  Chances are if you find yourself there you've got some problems and not a lot of money, so us kindred spirits grew close.  ");
                print("Despite the fact that I wasn't drunk I ended up sharing more that night with those guys than I had with anyone since leaving my rushed college career.");
                if(new Random().nextBoolean()){
                    print("I guess the bartender/owner saw me and understood the facetious life I led.  I ended up talking late into the night, until the bar closed actually.  The bear of a bartender called out to me as I was walking out the door,");
                    print("asking if I wanted a job, just to tide me over until I got everything figured out.  Someone just offered me a job?  After I had just failed to get a job at basically the last tech firm in my city?  Absolutely.  ");
                }else{
                    print("I haven't the slightest idea what all we talked about but at times I remember the bartender looking over sympathetically.  I knew the guy had a rough start and he could have nursed this rank dive bar into a glowing,");
                    print("metropolitan restaurant if it weren't in such a shite neighborhood.  As I walked out the slender bartender called out to me.  He offered some simple words of consolation after a short pause and bid me come again.");
                }
            }else{//drunk
                print("In my already damaged mental state I found myself unable to manage my drinking whatsoever.  I have no idea what all I drank but the bar tab the next day was quite steep, especially considering the cheap, low quality liqueur ");
                print("with which the bar was perpetually stocked.  Through a hazy, wobbly cloud of temporary pacification I stumbled out to the curb to find my car.");
                int r=new Random().nextInt(17);
                if(r<3){//car stolen

                }else if(r<8){//wander out for a taxi

                }else if(r<10){//maera picks ya up

                }else if(r<13){
                    //walk home
                }else{
                    //drive
                }
            }
        }
    }

    static void drinkwm(){

    }

    static void gethit(){

    }

    static void comatime() {

    }
}