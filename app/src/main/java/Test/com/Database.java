package Test.com;

import java.util.ArrayList;
import java.util.Arrays;

/*
Easy access to all the items
Will be change in future
*/


public class Database
{
    public static String getName(int a)
    {
        String jeff[] = new String[10];
        jeff[0] = "Unrecognized Object";
        jeff[1] = "Hammer";
        jeff[2] = "Screwdriver";
        jeff[3] = "Wrench";
        jeff[4] = "Bread";
        jeff[5] = "Egg";
        jeff[6] = "Pen";
        jeff[7] = "Keyboard";
        jeff[8] = "Cowboy Hat";
        jeff[9] = "Cowboy Boot";



//night night theme theme
        return jeff[a];
    }
    public static String getInfo(int a)
    {
        String jeff[] = new String[10];
        String h = "Instructions:\n\n";
        String h2 = "\n\n\nDescription:\n\n";

        jeff[0] = "Please Retry Image Search";
        jeff[1] = h + "1.) Firmly grasp hammer in one hand\n2.) Swing so that the metal part hits the intended object\n3.) Repeat first two steps until satisfied" + h2 + "A tool intended to help put nails into objects such as wood. It has a long handle, and a tip with a flat end for hitting nails. Some hammers have a curved end to assist with removing nails.";
        jeff[2] = h + "1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut" + h2 + "A tool, manual or powered, intended to assist in the action of inserting and removing screws.  Usually consisting of a handle and a shaft, different types of screw drivers have different tips, most notably the flathead(-) and philips(+).";
        jeff[3] = h + "1.) Grab wrench in one hand\n2.) Fit nut in the notch\n3.) Turn counterclockwise to loosen the bolt/nut" + h2 + "A tool designed to provide grip and a mechanical advantage in applying torque to turn objects, such as nuts and bolts.";
        jeff[4] = h + "1.) Insert into mouth\n2.) Enjoy" + h2 + "Bread is a staple in many diets across the globe.  It provides the carbohydrates we need to live so it is very important.";
        jeff[5] = h + "1.) Insert into mouth\n2.) Enjoy" + h2 + "Eggs are a staple in many diets across the globe.  It provides the protein we need to live so it is very important.";
        jeff[6] = h + "1.) Press tip on paper\n2.) Move pen against paper" + h2 + "A pen is a writing instrument used to apply ink to a surface, usually paper, for writing or drawing.";
        jeff[7] = h + "1.) Press key\n2.) Letter appears on screen" + h2 + "A computer keyboard is an input device used to enter characters and functions into the computer system by pressing buttons, or keys.";
        jeff[8] = h + "1.) Say hi to Mr. Johnson\n2.) Complement his hat\n3.) We like your hat Mr. Johnson" + h2 + "The cowboy hat is a high-crowned, wide-brimmed hat best known as the defining piece of attire for the North American cowboy. ... The shape of a cowboy hat's crown and brim are often modified by the wearer for fashion and to protect against weather.";
        jeff[9] = h + "1.) Put left boot on left foot\n2.) Put right boot on right foot\n3.) Yee Haw" + h2 + "Cowboy boots refer to a specific style of riding boot, historically worn by cowboys. They have a Cuban heel, rounded to pointed toe, high shaft, and, traditionally, no lacing.";
        //ect...


        return jeff[a];
    }
    public static int getImg(int a)
    {
        int jeff[] = new int[10];

        Arrays.fill(jeff, R.drawable.question_mark);


        jeff[1] = R.drawable.img1;
        jeff[2] = R.drawable.img2;
        jeff[3] = R.drawable.img3;
        jeff[4] = R.drawable.img4;
        jeff[5] = R.drawable.img5;
        jeff[6] = R.drawable.img6;
        jeff[7] = R.drawable.img7;
        jeff[8] = R.drawable.img8;
        jeff[9] = R.drawable.img9;


        //Do more for more items

        return jeff[a];
    }

    //sp is special
    //special is for more specific parts ie.) screwdriver vs flathead and philips
    public static ArrayList<String> sp(int a)
    {
        ArrayList<String> jeff[] = new ArrayList[10];

        jeff[0] = new ArrayList<>(Arrays.asList("null"));

        Arrays.fill(jeff, jeff[0]);

        jeff[2] = new ArrayList<>(Arrays.asList("Flathead", "Phillips", "Star"));
        jeff[5] = new ArrayList<>(Arrays.asList("Scrambled", "Hard Boiled"));
        return jeff[a];
    }

    public static ArrayList<String> spInfo(int a)
    {
        ArrayList<String> jeff[] = new ArrayList[10];

        jeff[0] = new ArrayList<>(Arrays.asList("null"));

        Arrays.fill(jeff, jeff[0]);

        jeff[2] = new ArrayList<>(Arrays.asList("Instructions:\n\n1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut \n\n\nDescription:\n\nA screwdriver with a single (-) shaped notch used for screws, manual or powered, intended to assist in the action of inserting and removing screws.  Usually consisting of a handle and a shaft.", "Instructions:\n\n1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut \n\n\nDescription:\n\nA screwdriver with a single (+) shaped notch used for screws, manual or powered, intended to assist in the action of inserting and removing screws.  Usually consisting of a handle and a shaft.", "Instructions:\n\n1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut \n\n\nDescription:\n\nA screwdriver with a single (*) shaped notch used for screws, manual or powered, intended to assist in the action of inserting and removing screws.  Usually consisting of a handle and a shaft."));
        jeff[5] = new ArrayList<>(Arrays.asList("Instructions:\n\n1.) Crack egg onto hot pan\n2.) Stir and let cook to desired consistency\n3.)Enjoy! \n\n\nDescription:\n\nScrambled Eggs are eggs beaten slightly usually with a little milk and stirred while cooking.  Eggs are a staple in many diets across the globe.  It provides the protein we need to live so it is very important.", "Instructions:\n\n1.) Place egg in pot of water\n2.) Boil water and wait 10 minutes\n3.)Enjoy! \n\n\nDescription:\n\nBoiled Eggs are eggs, surprisingly, boiled in a pot of water.  Eggs are a staple in many diets across the globe.  It provides the protein we need to live so it is very important."));
        return jeff[a];
    }

    public static ArrayList<Integer> spImg(int a)
    {
        ArrayList<Integer> jeff[] = new ArrayList[10];

        jeff[0] = new ArrayList<>(Arrays.asList(R.drawable.question_mark));

        Arrays.fill(jeff, jeff[0]);

        jeff[2] = new ArrayList<>(Arrays.asList(R.drawable.spimg2_1,R.drawable.spimg2_2,R.drawable.spimg2_3));
        jeff[5] = new ArrayList<>(Arrays.asList(R.drawable.spimg5_1,R.drawable.spimg5_2));
        return jeff[a];
    }
}
