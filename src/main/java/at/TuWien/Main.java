package at.TuWien;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //testvars
        String test = "Teststring_Einstufungstest";
        short result = (short) ExampleTest.myMult(3, 7);

        //Written Examples
        System.out.println(ExampleTest.myMult(21,4));
        System.out.println(ExampleTest.myMult(2,3500));

        System.out.println("\n----------- MYMULT -----------\n");

        System.out.println(ExampleTest.findMaxChar("abcdefg"));
        System.out.println(ExampleTest.findMaxChar("4321"));

        System.out.println("\n----------- FindMaxChar ----------- \n");

        System.out.println(ExampleTest.replaceNthChar(test, 1, '0'));
        System.out.println(ExampleTest.replaceNthChar(test, 3, '#'));
        System.out.println(ExampleTest.replaceNthChar(test, 10, '-'));
        System.out.println(ExampleTest.replaceNthChar(test, 30, 'X'));
        System.out.println(ExampleTest.replaceNthChar("A", 1, '#'));

        System.out.println("\n----------- PRINTPATTERN ----------- \n");

        ExampleTest.printPattern(3, '*');
        ExampleTest.printPattern(5, '+');


        System.out.println("\n************* K2 PROBETEST 2 *************\n");

        test = "Teststring_Einstufungstest";
        result = (short) ExampleTest2.countDivisors(299, 305);

        System.out.println("\n----------- COUNTDIVISORS ----------- \n");

        System.out.println(ExampleTest2.countDivisors(1,28));
        System.out.println(ExampleTest2.countDivisors(101,2001));
        System.out.println(ExampleTest2.countDivisors(8,8));

        System.out.println("\n----------- FINDDOUBLES ----------- \n");

        System.out.println(ExampleTest2.findDoubles(test));
        System.out.println(ExampleTest2.findDoubles("Haarspangenaal"));
        System.out.println(ExampleTest2.findDoubles("The Black Beast of Aaaaargh!"));
        System.out.println(ExampleTest2.findDoubles("Schokoladenkuchen"));

        System.out.println("\n----------- REVERSEINSERT ----------- \n");

        System.out.println(ExampleTest2.reverseInsert(test, '.'));
        System.out.println(ExampleTest2.reverseInsert("qwerty", '-'));
        System.out.println(ExampleTest2.reverseInsert("Pinkie Pie", '!'));

        System.out.println("\n----------- PRINTPATTERN ----------- \n");

        ExampleTest2.printPattern(4,'!');

        System.out.println();

        ExampleTest2.printPattern(5,'*');
    }
}