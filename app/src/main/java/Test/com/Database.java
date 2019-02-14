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
        jeff[0] = "Wrench";
        jeff[1] = "Screwdriver";
        jeff[2] = "Hammer";
        jeff[3] = "Bread";
        jeff[4] = "Egg";
        jeff[5] = "Unrecognised Object";

//night night theme theme
        return jeff[a];
    }
    public static String getInfo(int a)
    {
        String jeff[] = new String[6];
        String h = "How to use:\n\n";
        jeff[0] = h + "1.) Grab wrench in one hand\n2.) Fit nut in the notch\n3.) Turn counterclockwise to loosen the bolt/nut";
        jeff[1] = h + "1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut";
        jeff[2] = h + "1.) Firmly grasp hammer in one hand\n2.) Swing so that the metal part hits the intended object\n3.) Repeat first two steps until satisfied";
        jeff[3] = "Breadies";
        jeff[4] = "Eggies";
        jeff[5] = "Please Retry Image Search";

        return jeff[a];
    }
    public static int getImg(int a)
    {
        int jeff[] = new int[6];
        Arrays.fill(jeff, R.drawable.question_mark);
        jeff[0] = R.drawable.img0;
        jeff[1] = R.drawable.img1;
        jeff[2] = R.drawable.img2;
        //Do more for more items

        return jeff[a];
    }

}
