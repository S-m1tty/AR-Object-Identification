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
        jeff[0] = "Unrecognised Object";
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
        String h = "How to use:\n\n";

        jeff[0] = "Please Retry Image Search";
        jeff[1] = h + "1.) Firmly grasp hammer in one hand\n2.) Swing so that the metal part hits the intended object\n3.) Repeat first two steps until satisfied";
        jeff[2] = h + "1.) Hold the screwdriver\n2.) Place the notch in the screw\n3.) Turn counterclockwise to loosen the bolt/nut";
        jeff[3] = h + "1.) Grab wrench in one hand\n2.) Fit nut in the notch\n3.) Turn counterclockwise to loosen the bolt/nut";
        jeff[4] = "Breadies";
        jeff[5] = "Eggies";

        return jeff[a];
    }
    public static int getImg(int a)
    {
        int jeff[] = new int[6];

        Arrays.fill(jeff, R.drawable.question_mark);


        jeff[1] = R.drawable.img1;
        jeff[2] = R.drawable.img2;
        jeff[3] = R.drawable.img3;

        //Do more for more items

        return jeff[a];
    }

}
