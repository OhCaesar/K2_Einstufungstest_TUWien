package at.TuWien;

//Mit Kontrolle - 28:30

//Steuerung Q
public class ExampleTest3 {


    public static int getIntegerRoot(int k){
        for(int i = 1 ; i<=k;i++)
            if(i*i==k)
                return i;
        return -1;
    }

    public static String getThird(String a,String b,String c){
        if(a==b&&b==c&&a==c)
            return "alle gleich";
        else if (a!=b&&b!=c&&a!=c)
            return "alle unterschiedlich";

        if(a!=b && b==c) return a;
        if(c!=b && a==c) return b;
        else return c;
    }

    public static String replaceA(String s){
        int counter=1;
        String sCopy="";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                sCopy+=counter;
                counter++;
            }
            else sCopy+=s.charAt(i);
        }
        return sCopy;
    }

    public static void printBars(int i){
        boolean vorzeichen = true;
        for(int y = 1;y<=i;y++){
            if(y%3!=0) {
                System.out.print(y);
                if (vorzeichen)
                    System.out.print("-");
                else
                    System.out.print("+");
                vorzeichen =! vorzeichen;
            }
        }
        System.out.println();
        vorzeichen=false;
        for(int x = 1;x<=i;x++){
            if(x%3==0) {
                System.out.print(x);
                if(vorzeichen)
                    System.out.print("-");
                else
                    System.out.print("+");
                vorzeichen=!vorzeichen;
            }
        }
        System.out.println();
    }


}
