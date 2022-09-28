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

    public void testFile()
    {
        File file = new File("data.csv");
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
                               System.out.println("NOT EVEN");
                               return false;
                           }
                       });
                        break;
                    case 2:
                        testerNum = s.nextInt();

                        break;
                    case 3:
                        testerNum = s.nextInt();

                        break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
