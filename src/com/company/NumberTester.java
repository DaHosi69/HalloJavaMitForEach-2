package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
private String filename;
private NumberTest oddTester;
private NumberTest primeTester;
private NumberTest palindromeTester;
private String path;

    public NumberTester(String fileName)
    {
        path = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester)
    {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }

    public static void main(String[] args)
    {
        String s = "";
        new NumberTester(s).testFile();

    }

    public void testFile()
    {
        File file = new File("C:\\Users\\hosne\\Desktop\\Git\\HalloJavaMitForEach\\HalloJavaMitForEach\\src\\com\\company\\data.csv");
        try {

            Scanner s = new Scanner(file);
            int opNum = s.nextInt();
            for (int i = 0; i <opNum; i++) {
                int testNum = s.nextInt();
                switch (testNum)
                {
                    case 1:
                       int testerNum = s.nextInt();
                       setOddEvenTester(oddTester -> {
                           if (testerNum % 2 == 0)
                           {
                               System.out.println("EVEN");
                               return true;
                           }

                           else
                           {
                               System.out.println("ODD");
                               return false;
                           }
                       });
                       oddTester.testNumber(testerNum);
                        break;
                    case 2:
                        testerNum = s.nextInt();
                        setPrimeTester(primeTester -> {
                            for (int t=2; t<= Math.sqrt(testerNum); t++) {
                                if(testerNum%t == 0){
                                    System.out.println("NO PRIME");
                                    return false;
                                }
                                else
                                {
                                    System.out.println("PRIME");
                                    return true;
                                }

                            }
                            return false;
                        });
                        primeTester.testNumber(testerNum);
                        break;

                    case 3:
                        testerNum = s.nextInt();
                        String numberStr = String.valueOf(testerNum);
                        setPalindromeTester(primeTester -> {
                            String normal = "",umgekehrt = "";
                            int length = numberStr.length();
                            normal = numberStr;
                            for ( int k = length -1;k >= 0; k--)
                                umgekehrt = umgekehrt + normal.charAt(k);
                            if (normal.equals(umgekehrt)){
                                System.out.println("PALINDROME");
                                return true;
                            }
                            else
                            {
                                System.out.println("NO PALINDROME");
                                return false;
                            }
                        });
                        palindromeTester.testNumber(testerNum);
                        break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
