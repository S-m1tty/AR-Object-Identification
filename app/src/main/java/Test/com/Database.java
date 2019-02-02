package Test.com;
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
        jeff[5] = "Wall";

//night night theme theme
        return jeff[a];
    }
    public static String getInfo(int a)
    {
        String jeff[] = new String[6];
        jeff[0] = "Wrench in the plans";
        jeff[1] = "Screwdriver It";
        jeff[2] = "Hammer Time";
        jeff[3] = "Breadies";
        jeff[4] = "Eggies";
        jeff[5] = "Bunch of Bricks" ;
                //jeff[5] is just for kicks and giggles
        return jeff[a];
    }
}
