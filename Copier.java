import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;






/**
 * This class copies the songs to the given directory
 * The default location of songs (iTunes library) in Mac OS is:
 *      ./Users/<username>/Music/iTunes/iTunes\ Media/Music
 * 
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.2.0
 */
public final class Copier
{
            /*  Fields  */

    private static String USER_NAME;
    private static String MAIN_FOLDER_PATH;




    public static void main(String[] args) throws Exception
    {
        // read client username
        readUserName();


        // open main folder of Musics
        File mainFolder = new File(MAIN_FOLDER_PATH);

    
        for (File folder: mainFolder.listFiles())
        {
            System.out.println(folder.getAbsolutePath());

            if (folder.getAbsolutePath().contains(".DS_Store"))
                continue;

            for (File subFolder: folder.listFiles())
            {
                System.out.println("\t" + subFolder.getName());

                if (subFolder.getAbsolutePath().contains(".DS_Store"))
                    continue;
                    
                for (File musicFile: subFolder.listFiles())
                    System.out.println("\t\t" + musicFile.getName());
            }
        }
    }





    // this method reads username
    private static void readUserName() throws Exception
    {
        Scanner in = new Scanner(new File("./username.bin"));
        USER_NAME = in.nextLine();
        MAIN_FOLDER_PATH = USER_NAME + "/Music/iTunes/iTunes Media/Music";
    }
}
