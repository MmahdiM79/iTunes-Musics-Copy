import java.io.File;
import java.util.Arrays;






/**
 * This class copies the songs to the given directory
 * The default location of songs (iTunes library) in Mac OS is:
 *      ./Users/<username>/Music/iTunes/iTunes\ Media/Music
 * 
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0
 */
public final class Copier
{
            /*  Fields  */

    private static final String USER_NAME = "mm.m.mm";
    private static final String MAIN_FOLDER_PATH = "/Users/" + USER_NAME + "/Music/iTunes/iTunes Media/Music";




    public static void main(String[] args) 
    {
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
}
