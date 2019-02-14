package Test.com;

import java.util.Arrays;

/*
Easy access to all the items
Will be change in future
*/
public class Database
{
    public static String getName(int a)
    {
        String jeff[] = new String[6];
        jeff[0] = "Unrecognized Object";
        jeff[1] = "Hammer";
        jeff[2] = "Screwdriver";
        jeff[3] = "Wrench";
        jeff[4] = "Bread";
        jeff[5] = "Egg";


//night night theme theme
        return jeff[a];
    }
    public static String getInfo(int a)
    {
        String jeff[] = new String[6];
        String h = "Instructions:\n\n";
        String h2 = "\n\n\nDescription:\n\n";

        jeff[0] = "Please Retry Image Search";
        jeff[1] = h + "1.) Firmly grasp hammer in one hand\n2.) Swing so that the metal part hits the intended object\n3.) Repeat first two steps until satisfied" + h2 + "A tool intended to help put nails into objects such as wood. It has a long handle, and a tip with a flat end for hitting nails. Some hammers have a curved end to assist with removing nails";
        jeff[2] = h + "1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut" + h2 + "A tool, manual or powered, intended to assist in the action of inserting and removing screws.  Usually consisting of a handle and a shaft, different types of screw drivers have different tips, most notably the flathead(-) and philips(+).";
        jeff[3] = h + "1.) Grab wrench in one hand\n2.) Fit nut in the notch\n3.) Turn counterclockwise to loosen the bolt/nut" + h2 + "A tool designed to provide grip and a mechanical advantage in applying torque to turn objects, such as nuts and bolts.";
        jeff[4] = h + "1.) Insert into mouth\n2.) Enjoy" + h2 + "Bread is a staple in many diets across the globe.  It provides the carbohydrates we need to live so it is very important.";
        jeff[5] = h + "1.) Insert into mouth\n2.) Enjoy" + h2 + "Eggs are a staple in many diets across the globe.  It provides the protein we need to live so it is very important.";

        return jeff[a];
    }
    public static int getImg(int a)
    {
        int jeff[] = new int[6];

        Arrays.fill(jeff, R.drawable.question_mark);


        jeff[1] = R.drawable.img1;
        jeff[2] = R.drawable.img2;
        jeff[3] = R.drawable.img3;
        jeff[4] = R.drawable.img4;
        jeff[5] = R.drawable.img5;

        //Do more for more items

        return jeff[a];
    }

}
