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
        jeff[5] = "One year ago, I stood before you for the first time in this grand hall. I addressed the threats facing our world, and I presented a vision to achieve a brighter future for all of humanity.\n" +
                "\n" +
                "Today, I stand before the United Nations General Assembly to share the extraordinary progress we’ve made.\n" +
                "\n" +
                "In less than two years, my administration has accomplished more than almost any administration in the history of our country.\n" +
                "\n" +
                "America’s -- so true. [Laughter] Didn’t expect that reaction, but that’s okay. [Laughter and applause.]" ;
                //jeff[5] is just for kicks and giggles
        return jeff[a];
    }
}
