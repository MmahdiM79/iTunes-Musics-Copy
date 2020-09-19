/*
 *              In The Name of God 
 * 
 * ==========================================
 * [] File Name:  main.c
 * 
 * [] Creation Date:  09-19-2020
 * 
 * [] Created By:  Mohammad Mahdi Malmasi (m.mahdi.m79@gmail.com / https://github.com/MmahdiM79)
 * ==========================================
 * 
 * 
 * This simple code, complie and run the Copier.java file and
 * Gives the destination path to it
 *
 * 
 * 
 */
/*
 *  Copyright ©️  2020  Mohammad Mahdi Malmasi.
 */





#include <stdio.h>
#include <stdlib.h>
#include <string.h>




#define raiseERROR(x) {printf("\n\x1b[31m \berror:  \x1b[0m"#x"\n\n\n"); exit(EXIT_FAILURE);}


int main(int argc, char const *argv[])
{
    // check Java file part
    FILE *fpin = fopen("./Copier.java", "r");
    if (fpin == NULL)
        raiseERROR(Copier.java file is not available. please download it from this link:
                    );
    fclose(fpin);


    
    // ask the USB name for coping
    printf("please enter your USB name:   ");

    // hold usb name
    char usbName[1000];

    // read the client input
    gets(usbName);




    // compile and run Java file
    system("javac Copier.java");
    system(strcat("java Copier ", usbName));


    return 0;
}
