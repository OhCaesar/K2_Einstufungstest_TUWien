package at.TuWien;

public class ExampleTest {

    //Per hand Multiplizieren
    public static int myMult(int x,int y){
        int multiSum = 0;
        for (int i = x;i>0;i--){
            multiSum+=y;
        }
        return multiSum;
    }

    public static char findMaxChar(String text){

        //Umschreiben without CharacterArray
        char highestChar=text.charAt(0);
        for (int i = 0;i<text.length();i++)
            if(text.charAt(i)>highestChar)
                highestChar=text.charAt(i);
        return highestChar;
    }


    //Normaly i wouldnt use the new keyword in a variable name but f*ck it
    public static String replaceNthChar(String text, int n, char replaceChar){
        int counter = -1;
        String newText = "";
        for (int i = 0;i<text.length();i++){
            if(counter==n-1)
            {
                newText+=replaceChar;
                counter=0;
            }else{
                newText+=text.charAt(i);
                counter++;
            }
        }
        return newText;
    }

    public static void printPattern(int n,char character){
        for (int i = 0; i<n;i++){
            for(int d = 0;d<i;d++){
                System.out.print(" ");
            }
            for(int y = 0;y<(n+i);y++){
                System.out.print(character);
            }
            System.out.print("\n");
        }
    }
}
