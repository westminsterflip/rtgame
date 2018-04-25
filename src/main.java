import java.io.File;
import java.util.Random;
import java.util.Scanner;
import sun.misc.Unsafe;
import java.lang.reflect.Field;

//     A couple of playthroughs of Depression Quest gave me some good ideas of what I do and do not want to do here.
// Although the main character Joe is somewhat depressed, he isn't very deep down the rabbit hole
// and I don't want to take him there.  I don't intend this to be a story of a guy getting more depressed
// but rather about a guy having to deal with life.  If I had to pick out a specific point I'm trying to make I'd
// say that I'm basically exploring undecidability in life.  While Depression Quest does somewhat the same thing I
// am trying to do with choices in this game (mislead as to what that choice will lead to), the linear (within a branch)
// approach is dry and misses the "it doesn't really matter what you try to do" aspect I am working towards.
// Depression Quest's epilogue:
//
//          "Like depression itself, Depression Quest does not have an end really. There is no neat
//           resolution to depression, and it was important to us that Depression Quest's own resolution
//           reflect that. Instead of a tidy ending, we want to just provide a series of outlooks to take
//           moving forward. After all, that's all we can really do with depression - just keep moving
//           forward. And at the end of the day it's our outlook, and support from people just like you,
//           that makes all the difference in the world."
//
//           (http://www.depressionquest.com/dqfinal.html)
//
// I don't like the idea of a game without an ending, one that just kind of peters off.  You make all of these decisions
// and in the end you get... nothing?  The game "The Witness" did that and after putting hours into a game without story
// all this way of ending did wsa annoy me.  Granted Joe has to die in every branch (he's dead to start), which isn't much
// of an ending but the game ends concretely when Joe's life does.  In stark contrast to DQ few decisions are actually made
// by the user.  By the point Joe goes drinking (either solo or with Maera) he could have a job at the bar, at the Institute.
// or be just as unemployed as when the story began, and almost none of that is up to the user.  DQ makes the user step into
// the shoes of the main character, making key decisions that drastically change dialog and story procession from that point.
// Following the "futility of choice" theme this is something I want to avoid.  Although there are a variety of dialogs
// depending on what choice the user makes, for example, when deciding whether to pick up the cell phone but there are only
// two actual outcomes.
//
//     Alongside talking about the choices in the game has to come the unrealistic nature of every choice (both facing user
// and computer).  For the most part the user facing decisions are binary and the computer facing are narrowly scoped and
// use whatever probability seemed good at the time I wrote the if() statement.  Obviously I can't have the user choose
// every little thing about his/her playthrough, nor would it matter where this game is concerned.  Giving the user to, for
// instance, answer the phone rudely, answer the phone nicely, or not answer the phone wouldn't add any depth.  Within a few
// lines Joe is going out to drink, probably jobless and the inflection of his voice doesn't matter.  As far as the computer
// facing decisions go, that is more complicated.  I have tried to find rough probabilities to use (especially with the
// probability of crashing while drunk, I thought there'd be some articles on that but the only thing I found was a few
// articles on the relative percentage probability of getting arrested while drunk) but for almost all of the randomized
// events there are too many variables to even start figuring out a real probability, so I just chose a rough value I thought
// would make the game progress how I wanted it too.  The chance of everything actually working out for Joe is pretty minute
// and shrinks with every random event I add and while this does lend to the depressing nature of the story/game I figure the
// chance of things actually working out for any average Joe (not intentional) are quite small.  I had hoped to find something
// reference-able on worldbuilding and posit that, while I'm not making a true environment for the characters the choices
// made and presented in the game lend to a shallow realism.  On multiple playthroughs you'd easily realize that there are a
// small number of stages and limited/unrealistic choices for one or two playthroughs it works to develop the environment
// in which I want to place Joe.  Unfortunately the most "scholarly" article I could find was wikipedia.
//
//           "From a game-design perspective, the goal of worldbuilding is to create the context for a story.
//            Consistency is an important element, since the world provides a foundation for the action of a
//            story.  However, J. R. R. Tolkien described the goal of worldbuilding as creating immersion, or
//            "enchantment" as he put it, and descriptions of the world can be wholly disconnected from the
//            story and narrative."
//
//            (https://en.wikipedia.org/wiki/Worldbuilding)  (I hate to use a Wikipedia page flagged as not having enough sources but this is the most formally approached source I found on worldbuilding)
//
// The article goes on to describe multiple aspects of the world that should be decided: physics, cosmology, maps, culture.
// As far as these aspects are concerned I've failed miserably to define my world.  It is a generic city with only 4 buildings
// mentioned as of yet, however this aspect brings me back to the quote mentioned earlier.  I do not believe that the choices
// or events in game serve to provide much context, but rather serve to further my theme, but Tolkien absolves me of my
// abhorrent lack of worldly detail (to an extent).  I thought about giving "The Institute" a real name along with the city,
// but decided against it for some ambiguous immersion.  Ignoring the names of buildings and people this story could take place
// in pretty much any city, and could describe any number of people struggling to adult in their everyday lives.  I attempted
// to somewhat immerse the player/audience in a potentiality of their own lives by focusing on Joe and what Joe does rather
// than the specifics of the city.  I could, for instance, mention off-hand that the city has an underground subway loop,
// but unless Joe needs to take that subway it isn't relevant to the story.
//
//     I briefly mentioned Joe's depression while talking about the good and bad of DQ but given that it is a major part
// of the story it warrants some more explanation.  I don't think there is a question of Joe being depressed, however
// it is pretty minor.  The National Institute of Mental Health lists the symptoms of depression, some of which Joe
// experiences but most of which he does not (https://www.nimh.nih.gov/health/topics/depression/index.shtml).  Right after
// the list is this:
//
//           "Not everyone who is depressed experiences every symptom. Some people experience only a few symptoms
//            while others may experience many. Several persistent symptoms in addition to low mood are required
//            for a diagnosis of major depression..."
//
// While "several" is subjective I have attributed enough of these symptoms to Joe that, while he isn't strictly
// suicidal or all that clearly depressed (he's just kind of the norm now) his depression is a major part of the story.
// I didn't attempt to make this a depression themed game but depression and futility of choice fit pretty well together.
// Joe, like most people, does not handle his depression and this leads to many of the events in game.  Joe's attitude
// will affect his relationships, job situation, etc. so it is a major driving force.  According to the NIMH, the proper
// way to handle depression outside of treatement is:
//
//           "-Try to be active and exercise.
//            -Set realistic goals for yourself.
//            -Try to spend time with other people and confide in a trusted friend or relative.
//            -Try not to isolate yourself, and let others help you.
//            -Expect your mood to improve gradually, not immediately.
//            -Postpone important decisions, such as getting married or divorced, or changing jobs
//             until you feel better. Discuss decisions with others who know you well and have a more
//             objective view of your situation."
//
// I have Joe doing basically none of these as of now.  Assuming the story does not follow the happy branch Joe
// will almost certainly become more depressed.  The story will have to center more on Joe's depression.  At some
// point there's only so much that can happen to someone who doesn't leave their room.

public class main {
    public static boolean gotJob=false;
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
    static boolean cc=false;
    public static void main(String[] args) throws Exception {
        print(new File("crashed").getAbsolutePath());
        if(new File("crashed").exists())comatime(1);
        else intro1();
    }

    static void print(String s){
        System.out.println(s);
    }

    static void intro1() throws Exception {
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
            Thread.sleep(3000);
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
                gotJob=true;
                drinkwm();
            }else{
                print("As much as I hoped this would be a personal call, she sounded quite the businesslike professional.");
                if(new Random().nextInt(10)==6){
                    print("There was some good news, however; I had gotten the job");
                    print("I knew I should feel happy that my long job search had ended, but I couldn't help but feel disappointed that I would soon have responsibilities beyond feeding and cleaning myself.");
                    gotJob=true;
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

    static void drink() throws Exception {
        print("");
        print("When I had finally managed to drag my sloth-like corpse down to the bar the \"bouncer\" outside the door looked at me with no small measure of skepticism, assuredly thinking I was already as intoxicated as");
        print("I needed to be.");
        boolean dr=new Random().nextInt(2)==1;
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
            if(r<5){//drive
                print("Now at this point I was in no way in control of myself.  My drunk brain figured, logically, if I had driven here I should drive back home.  I don't remember much but ");
                if(new Random().nextInt(5)==0) {
                    print("clearly I didn't make a good decision, cause I crashed.");
                    Thread.sleep(2000);
                    File c=new File("crashed");
                    c.createNewFile();
                    //this crashes the game
                    Field f = Unsafe.class.getDeclaredField("theUnsafe");
                    f.setAccessible(true);
                    Unsafe unsafe = (Unsafe)f.get(null);
                    unsafe.freeMemory(1);
                }
            }else if(r<9){//car stolen
                print("Everything came into sharp relief like a shot to the gut; within a blink I sobered the hell up.  My car was gone.  I didn't know how they'd even started the pos or why anyone would steal it,");
                print("but that was that.  I stood there motionless, fuming at my ever increasingly terrible luck.  Who the fuck steals a car like that?  It barely started in the summer let alone the winter.  It");
                print("was more rust than metal.  There were holes riddled in ever piece of bodywork and 3 of 6 windows were cardboard over shattered glass.  That car wasn't even good when it was new.  ");
                int r1=new Random().nextInt(9);
                if(r1<2){
                    print("I walked past the line of parked cars to flag down a taxi.  Of course there were barely any running at this time of night, so I had to wait an eternity just to see one");
                    print("Now there's this guy Charley who lives across town.  No one likes this guy, he's a real character.  I'm not saying he'd kick a baby for fun but he has to a toddler.  ");
                    print("This asshole stumbled out of the bar behind me and shambled quicker than any drunk, old man should be able to the curb and stole the only taxi to come in the nearly 20 ");
                    print("Minutes I had been waiting.  This idiot almost got hit by at least 5 cars just getting to the taxi; especially surprising since there aren't normally that many cars the ");
                    print("whole night.  I called the taxi company after another half an hour waiting and managed to slur out a complaint to the stereotypically indian call center guy.  After an ");
                    print("extremely annoying fifteen minutes some ancient taxi driver came down the street no faster than five miles an hour.  I started walking towards the snail.  At this point I");
                    print("could actually walk in a straight line, having waited so long for a ride home.  I heard the obnoxious thrum of a boxster with a \"performance\" muffler coming up behind");
                    print("me, but I didn't think anything of it at the time.  It grew to ear-piercing levels and just as I was turning around to flip this a-hole off I felt an explosion rip through");
                    print("the entire right side of my body.  It felt like my body was on fire for a moment, then nothing");
                    if(new Random().nextInt(5)==3){
                        print("Turns out this guy was high off his rocker, stoned to outer space.  When he blindsided me he really just smashed my legs cause it's a tiny car, but then I flew through");
                        print("windshield, folded nearly flat through the front seats and got halfway out the back window.  Needless to say, I didn't survive this.  ");
                        Thread.sleep(3000);
                        return;
                    }else comatime(0);
                }else if(r1<5){
                    print("I so busy fuming at the loss of my junker I didn't notice the jag slink up behind me.  My head whipped around at the speed of sound as I heard Maera call out the window to me");
                    print("I didn't think I'd ever see her again let alone she'd find me outside a dumpy bar near my apartment.  I suppose I should have questioned why she was there or even how she had ");
                    print("found me but at that point I was too tired to care.  I managed to find the door.  I'm pretty sure it didn't have a handle but then again I was ludicrously drunk so I'm not sure.");
                    print("I don't remember driving anywhere or even getting out of the car but I woke up with a rhinoceros of a hangover the next morning.  ");
                    print("I'd had chronic headaches throughout college, the kinda thing that'd make you just want to curl into the fetal position and go into hibernation for a year, the kind of thing that'd");
                    print("take my concentration shatter it petulantly off the wall and that was nothing compared to this.  ");
                }else{

                }
            }else if(r<11){//wander out for a taxi

            }else if(r<14){//maera picks ya up

            }else{
                //walk home
            }
        }
    }

    static void drinkwm(){

    }

    static void comatime(int wc) {//0 if got hit, 1 if car crash

    }
}