package at.TuWien;

//start -- 18:45
//pause - 18:51- 55
//end - 19:35

//gesamttime - 46 min

public class ExampleTest2 {

    /*
        int countDivisors(int x, int y) liefert die Anzahl der Zahlen im Intervall [x,y] zurück, die durch 4 teilbar sind, aber nicht
        durch 6.
        Annahme(n): x > 0, y > 0, x <= y
     */
    public static int countDivisors(int x,int y){
        int divisionCounter = 0;
        for (int i =x;i<=y;i++){
            if((i%4)==0&&!((i%6)==0)) {
                divisionCounter++;
            }
        }
        return divisionCounter;
    }

    /*
        int findDoubles(String text) zählt, wie oft der Buchstabe 'a' innerhalb des Strings text zweimal direkt hintereinander
        vorkommt, und liefert diesen Wert zurück.
        Annahme(n): text.length() > 0.
     */
    public static int findDoubles(String text){
        int stackCounter = 0;
        int doubleChecker= 0;
        for (int i = 0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                if(stackCounter>0){
                    doubleChecker++;
                }
                stackCounter++;
            }
            else stackCounter=0;
        }
        return doubleChecker;
    }


    /*
        String reverseInsert(String text, char character) fügt zwischen je zwei Zeichen von text den Buchstaben character ein
        und gibt diesen String in umgekehrter Reihenfolge zurück.
        Annahme(n): text.length() > 1.
     */
    public static String reverseInsert(String text, char character){
        String reverseInsertedString="";
        for (int i= text.length()-1;i>=0;i--){
            reverseInsertedString+=text.charAt(i);
            if(i!=0)
                reverseInsertedString+=character;
        }
        return reverseInsertedString;
    }

    /*
        void printPattern(int n, char character) gibt auf der Konsole n Zeilen aus. Ist die aktuelle Zeilennummer gerade, wird
        2·n-mal das Zeichen character ausgegeben. Ist die aktuelle Zeilennummer ungerade, wird n-mal zuerst das Zeichen character
        gefolgt von einem Punkt '.' ausgegeben. Am Ende jeder Zeile wird die Zeilennummer ausgegeben. Die Zählung der Zeilennummern
        beginnt mit 1.
        Annahme(n): n > 0.
     */
    public static void printPattern(int n, char character){
        for(int i=0;i<n;i++){
            if(i%2==0){ //Gerade
                for(int y=0;y<2*n;y++)
                    System.out.print(character);
            }
            else //Ungerade
                for(int y=0;y<2*n;y++){
                    if(y%2==0)
                        System.out.print(".");
                    else
                        System.out.print(character);
                }
                System.out.print((i+1)+"\n");
        }
    }
}
