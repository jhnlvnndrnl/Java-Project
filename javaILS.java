import java.util.*;

public class javaILS {

  static void Title() {
    System.out.println("=======Laboratory Exercises========");
  }

  static void Line() {
    System.out.println("===================================");
  }

  static void Between() {
    System.out.println(" ");
  }

  public static void main(String[] args) {
    try (Scanner ruri = new Scanner(System.in)) {
      
      OUTER:
      try {
        while (true) {
          Between();
          Title();
          Between();
          System.out.println("Instruction:");
          System.out.println("Choose the laboratory exercise");
          System.out.println("that you want to view");
          Between();
          Line();
          Between();
          System.out.println("Menu:");
          System.out.println("(0) Exit");
          System.out.println("(1) Lab 1");
          System.out.println("(2) Lab 2");
          System.out.println("(3) Lab 3");
          System.out.println("(4) Lab 4");
          System.out.println("(5) Lab 5");
          System.out.println("(6) Lab 6");
          System.out.println("(7) Lab 7");
          System.out.println("(8) Lab 8");
          System.out.println("(9) Lab 9");
          System.out.println("(10) Lab 10");
          System.out.println("(11) Lab 11");
          System.out.println("(12) Lab 12");
          Between();
          Line();
          System.out.print("View Lab: ");
          int x = ruri.nextInt();
          switch (x) {
            case 0:
              Between();
              Line();
              System.out.println("Program Exited, Thankyou!");
              System.exit(0);
              break;
            case 1:
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Output your Name");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out = ruri.next();
              if (out.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.println("Output:");
                System.out.println("John Elvin S. Endrenal");
                Between();
                Line();
              } else if (out.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose = ruri.next();
              if (choose.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose.equalsIgnoreCase("no")) {
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
				System.exit(0);
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 2:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Output the Following:");
              System.out.println("Fullname");
              System.out.println("Cellphone Number");
              System.out.println("Adress");
              System.out.println("Guardian");
              System.out.println("Cellphone Nuber");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put = ruri.next();
              if (put.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.println("Output:");
                System.out.println("John Elvin S. Endrenal");
                System.out.println("09674270830");
                System.out.println("San Pablo City, Laguna");
                System.out.println("Benedick P. Endrenal");
                System.out.println("09511826130");
                Between();
                Line();
              } else if (put.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.print("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String pick = ruri.next();
              if (pick.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 3:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Create Variable seperately for:");
              System.out.println("First Name");
              System.out.println("Middle Name");
              System.out.println("Last Name");
              System.out.println("Grade Level");
              System.out.println("8 Subjects");
              Between();
              System.out.println("Output the following:");
              System.out.println("My Name in LN, FN, MN");
              System.out.println("My Grade Level is...");
              System.out.println("My Subjects are...");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out1 = ruri.next();
              if (out1.equalsIgnoreCase("yes")) {
                Between();
                Line();
                String name1 = "John Elvin";
                String name2 = "Salazar";
                String name3 = "Endrenal";
                String name4 = "Grade 11";
                String name5 = "Computer Programming 1";
                String name6 = "Computer Programming 2";
                String name7 = "General Mathematics";
                String name8 =
                  "21st Century Literature from the Philippines and the World";
                String name9 = "Media and Information Literacy";
                String name10 = "Oral Communication";
                String name11 =
                  "Introduction to the Philosophy of the Human Person";
                String name12 = "Physical Education";

                System.out.println("Output:");
                System.out.println(
                  "My name is " + name3 + ", " + name1 + ", " + name2
                );
                System.out.println("My grade level is " + name4);
                System.out.println(
                  "My Subjects are " +
                  name5 +
                  ", " +
                  name6 +
                  ", " +
                  name7 +
                  ", "
                );
                System.out.println(name7 + ", " + name8 + ", " + name9 + ", ");
                System.out.println(name10 + ", " + name11 + ", and " + name12);
                Between();
                Line();
              } else if (out1.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose1 = ruri.next();
              if (choose1.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose1.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 4:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Output the following:");
              System.out.println("The sum of 1, 2, 3, and 4 is...");
              System.out.println("2-3-4-1 is...");
              System.out.println("The product of 3, 4, 1, and 2 is...");
              System.out.println("4 / 3 / 2 / 1 =...");
              System.out.println("The Average of 2, 3, 4, and 1 is...");
              Between();
              System.out.println("Example");
              System.out.println("1st = 5");
              System.out.println("2nd = 10");
              System.out.println("3rd = 15");
              System.out.println("4th = 20");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put1 = ruri.next();
              if (put1.equalsIgnoreCase("yes")) {
                Between();
                Line();
                int nm1 = 5;
                int nm2 = 10;
                int nm3 = 15;
                int nm4 = 20;
                int sum = nm1 + nm2 + nm3 + nm4;
                int sub = nm2 - nm3 - nm4 - nm1;
                int pro = nm1 * nm2 * nm3 * nm4;
                int dvd = nm4 / nm3 / nm2 / nm1;
                int average = (nm2 + nm3 + nm4 + nm1) / 4;

                System.out.println(
                  "The sum of " +
                  nm1 +
                  ", " +
                  nm2 +
                  ", " +
                  nm3 +
                  ", " +
                  nm4 +
                  " is " +
                  sum
                );
                System.out.println(
                  nm2 + " - " + nm3 + " - " + nm4 + " - " + nm1 + " is " + sub
                );
                System.out.println(
                  "The product of " +
                  nm1 +
                  ", " +
                  nm2 +
                  ", " +
                  nm3 +
                  ", " +
                  nm4 +
                  " is " +
                  pro
                );
                System.out.println(
                  nm4 + " / " + nm3 + " / " + nm2 + " / " + nm1 + " = " + dvd
                );
                System.out.println(
                  "The average of " +
                  nm2 +
                  ", " +
                  nm3 +
                  ", " +
                  nm4 +
                  ", " +
                  nm1 +
                  " is " +
                  average
                );
                Between();
                Line();
              } else if (put1.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String pick1 = ruri.next();
              if (pick1.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick1.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 5:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Menu:");
              System.out.println("1-Addition");
              System.out.println("2-Subtraction");
              System.out.println("3-Mutiplication");
              System.out.println("4-Division");
              System.out.println("5-Modulus");
              System.out.println("6-Average");
              Between();
              System.out.println("Enter Operation");
              System.out.println("Enter First numer");
              System.out.println("Enter Second number");
              System.out.println("Enter Third number");
              Between();
              System.out.println("Output:");
              System.out.println("The Answer is -");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out2 = ruri.next();
              if (out2.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.println("Menu:");
                System.out.println("(1) Addition");
                System.out.println("(2) Subtraction");
                System.out.println("(3) Mutiplication");
                System.out.println("(4) Division");
                System.out.println("(5) Modulus");
                System.out.println("(6) Average");
                Between();
                System.out.print("Enter Operation: ");
                int num1 = ruri.nextInt();
                System.out.print("Enter First numer: ");
                int num2 = ruri.nextInt();
                System.out.print("Enter Second number: ");
                int num3 = ruri.nextInt();
                System.out.print("Enter Third number: ");
                int num4 = ruri.nextInt();
                Between();

                if (num1 == 1) {
                  System.out.println("The Answer is " + (num2 + num3 + num4));
                } else if (num1 == 2) {
                  System.out.println("The Answer is " + (num2 - num3 - num4));
                } else if (num1 == 3) {
                  System.out.println("The Answer is " + (num2 * num3 * num4));
                } else if (num1 == 4) {
                  System.out.println("The Answer is " + (num2 / num3 / num4));
                } else if (num1 == 5) {
                  System.out.println("The Answer is " + (num2 % num3 % num4));
                } else if (num1 == 6) {
                  System.out.println(
                    "The Answer is " + ((num2 + num3 + num4) / 3)
                  );
                } else {
                  System.out.println("Error");
                }
                Between();
                Line();
              } else if (out2.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose2 = ruri.next();
              if (choose2.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose2.equalsIgnoreCase("no")) {
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
				System.exit(0);
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 6:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter Word");
              Between();
              System.out.println("Menu:");
              System.out.println("First Letter");
              System.out.println("Second Letter");
              System.out.println("Second2 Letter");
              System.out.println("Last Letter");
              Between();
              System.out.println("Choose output");
              Between();
              System.out.println("Output:");
              System.out.println("Chosen Letter");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put3 = ruri.next();
              if (put3.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.print("Enter Word: ");
                String Sen = ruri.next();
                Between();
                System.out.println("Menu:");
                System.out.println("(F) First Letter");
                System.out.println("(S) Second Letter");
                System.out.println("(S2) Second2 Letter");
                System.out.println("(L) Last Letter");
                Between();

                System.out.print("Choose output: ");
                String Name2 = ruri.next();

                int Len = Sen.length();
                if (Name2.equalsIgnoreCase("F")) {
                  System.out.print("The First Letter is ");
                  System.out.println(Sen.charAt(0));
                } else if (Name2.equalsIgnoreCase("S")) {
                  System.out.print("The Second Letter is ");
                  System.out.println(Sen.charAt(1));
                } else if (Name2.equalsIgnoreCase("S2")) {
                  System.out.print("The Second to the last Letter is ");
                  System.out.println(Sen.charAt(Len - 2));
                } else if (Name2.equalsIgnoreCase("L")) {
                  System.out.print("The Last Letter is ");
                  System.out.println(Sen.charAt(Len - 1));
                } else {
                  System.out.println("Error");
                }
              } else if (put3.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              Between();
              Line();
              System.out.print("Continue? YES or NO: ");
              String pick2 = ruri.next();
              if (pick2.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick2.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 7:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter First Number");
              System.out.println("Enter Last Number");
              Between();
              System.out.println("Output:");
              System.out.println("First Number");
              System.out.println("     |");
              System.out.println("     |");
              System.out.println("     |");
              System.out.println("Last Number");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out3 = ruri.next();
              if (out3.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.print("Enter First Number: ");
                int a = ruri.nextInt();
                Between();
                System.out.print("Enter Last Number: ");
                int b = ruri.nextInt();
                Between();

                System.out.println("Output:");

                int c;
                for (c = a; c <= b; c++) {
                  System.out.println(c);
                }

                int d;
                for (d = a; d >= b; d--) {
                  System.out.println(d);
                }
                Between();
                Line();
              } else if (out3.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose3 = ruri.next();
              if (choose3.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose3.equalsIgnoreCase("no")) {
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
				System.exit(0);
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 8:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter Word");
              Between();
              System.out.println("Output:");
              System.out.println("The word will repeat as many");
              System.out.println("as the number of letters.");
              Between();
              System.out.println("(Enter any single letter to break the loop)");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put4 = ruri.next();
              if (put4.equalsIgnoreCase("yes")) {
                Between();
                Line();
                String w;
                int n;
                int v;
                do {
                  System.out.print("Enter Word: ");
                  w = ruri.next();
                  n = w.length();

                  for (v = 0; v < n; v++) {
                    System.out.println(w);
                  }
                } while (n != 1);
              } else if (put4.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              Between();
              Line();
              System.out.print("Continue? YES or NO: ");
              String pick3 = ruri.next();
              if (pick3.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick3.equalsIgnoreCase("no")) {
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
				System.exit(0);
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 9:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter name");
              System.out.println("Enter Section");
              Between();
              System.out.println("Menu");
              System.out.println("(Add) Addition");
              System.out.println("(Sub) Subtraction");
              System.out.println("(Mul) Multiplication");
              System.out.println("(Div) Divison");
              System.out.println("(Ave) Average");
              Between();
              System.out.println("Enter Operation: ");
              System.out.println("Enter First Number: ");
              System.out.println("Enter Second Number: ");
              System.out.println("Enter Third Number: ");
              Between();
              System.out.println("Output:");
              Between();
              System.out.println("Name:");
              System.out.println("Section:");
              Between();
              System.out.println("Add = Sum of (F), (S) and (T) is -");
              System.out.println("Sub = (F) - (S) - (F) is -");
              System.out.println("Mul = The Product of (T), (F) and (S) is -");
              System.out.println("Div =  T / S / F is -");
              System.out.println("Ave = The Ave of (S), (T) and (F) is -");
              Between();
              System.out.println("The loop will end if the Operator");
              System.out.println(" you entered is not in the menu");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out4 = ruri.next();
              if (out4.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.print("Enter Name: ");
                String name = ruri.next();
                System.out.print("Enter Section: ");
                String section = ruri.next();
                Between();
                while (true) {
                  System.out.println("Menu:");
                  System.out.println("(Add) Addition");
                  System.out.println("(Sub) Subtraction");
                  System.out.println("(Mul) Multiplication");
                  System.out.println("(Div) Divison");
                  System.out.println("(Ave) Average");
                  Between();
                  System.out.print("Enter Operation: ");
                  String op = ruri.next();
                  System.out.print("Enter First Number: ");
                  int fnum = ruri.nextInt();
                  System.out.print("Enter Second Number: ");
                  int snum = ruri.nextInt();
                  System.out.print("Enter Third Number: ");
                  int tnum = ruri.nextInt();
                  if (op.equalsIgnoreCase("add")) {
                    Between();
                    Line();
                    System.out.println("Name: " + name);
                    System.out.println("Section: " + section);
                    Between();
                    System.out.print(
                      "The sum of " +
                      fnum +
                      ", " +
                      snum +
                      " & " +
                      tnum +
                      "  is "
                    );
                    System.out.println(fnum + snum + tnum);
                    Between();
                    Line();
                  } else if (op.equalsIgnoreCase("sub")) {
                    Between();
                    Line();
                    System.out.println("Name: " + name);
                    System.out.println("Section: " + section);
                    Between();
                    System.out.print(
                      fnum + " - " + snum + " - " + tnum + " - " + " is "
                    );
                    System.out.println(fnum - snum - tnum);
                    Between();
                    Line();
                  } else if (op.equalsIgnoreCase("mul")) {
                    Between();
                    Line();
                    System.out.println("Name: " + name);
                    System.out.println("Section: " + section);
                    Between();
                    System.out.print(
                      "The product of " +
                      fnum +
                      ", " +
                      snum +
                      " & " +
                      tnum +
                      "  is "
                    );
                    System.out.println(fnum * snum * tnum);
                    Between();
                    Line();
                  } else if (op.equalsIgnoreCase("div")) {
                    Between();
                    Line();
                    System.out.println("Name: " + name);
                    System.out.println("Section: " + section);
                    Between();
                    System.out.print(
                      fnum + " / " + snum + " / " + tnum + " / " + " is "
                    );
                    System.out.println(fnum / snum / tnum);
                    Between();
                    Line();
                  } else if (op.equalsIgnoreCase("ave")) {
                    Between();
                    Line();
                    System.out.println("Name: " + name);
                    System.out.println("Section: " + section);
                    Between();
                    System.out.print(
                      "The average of " +
                      fnum +
                      ", " +
                      snum +
                      " & " +
                      tnum +
                      "  is "
                    );
                    System.out.println((fnum + snum + tnum) / 3);
                    Between();
                    Line();
                  } else {
                    Between();
                    Line();
                    break;
                  }
                }
              } else if (out4.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose4 = ruri.next();
              if (choose4.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose4.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
                break;
              }
            case 10:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter First Number");
              System.out.println("Enter Second Number");
              Between();
              System.out.println("Math Class Menu");
              System.out.println("Pow");
              System.out.println("Round (2nd)");
              System.out.println("Min");
              System.out.println("Max");
              System.out.println("Ceil (1st)");
              System.out.println("Floor (2nd)");
              System.out.println("Abs (1st)");
              System.out.println("Random");
              Between();
              System.out.println("Choose Class");
              Between();
              System.out.println("Output:");
              System.out.println("The Answer is -");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put5 = ruri.next();
              if (put5.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.print("Enter First Number: ");
                double num1 = ruri.nextDouble();
                System.out.print("Enter Second Number: ");
                double num2 = ruri.nextDouble();
                Between();
                System.out.println("Math Class Menu");
                System.out.println("Pow");
                System.out.println("Round (2nd)");
                System.out.println("Min");
                System.out.println("Max");
                System.out.println("Ceil (1st)");
                System.out.println("Floor (2nd)");
                System.out.println("Abs (1st)");
                System.out.println("Random");
                Between();
                System.out.print("Choose class: ");
                String output = ruri.next();
                Between();
                if (output.equalsIgnoreCase("pow")) {
                  double p = Math.pow(num1, num2);
                  System.out.println("The answer is " + p);
                } else if (output.equalsIgnoreCase("round")) {
                  double r = Math.round(num2);
                  System.out.println("The answer is " + r);
                } else if (output.equalsIgnoreCase("min")) {
                  double mn = Math.min(num1, num2);
                  System.out.println("The answer is " + mn);
                } else if (output.equalsIgnoreCase("max")) {
                  double mx = Math.max(num1, num2);
                  System.out.println("The answer is " + mx);
                } else if (output.equalsIgnoreCase("ceil")) {
                  double c = Math.ceil(num1);
                  System.out.println("The answer is " + c);
                } else if (output.equalsIgnoreCase("floor")) {
                  double f = Math.floor(num2);
                  System.out.println("The answer is " + f);
                } else if (output.equalsIgnoreCase("abs")) {
                  double a = Math.abs(num1);
                  System.out.println("The answer is " + a);
                } else if (output.equalsIgnoreCase("random")) {
                  double r = Math.random();
                  System.out.println("The answer is " + r);
                } else {
                  System.out.println("Error");
                }
              } else if (put5.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              Between();
              Line();
              System.out.print("Continue? YES or NO: ");
              String pick4 = ruri.next();
              if (pick4.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick4.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 11:
              Between();
              Line();
              System.out.println("Instruction:");
              Line();
              System.out.println("Enter # of Inputs");
              System.out.println("Enter Number");
              Between();
              System.out.println("Output: (all of numbers)");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String out5 = ruri.next();
              if (out5.equalsIgnoreCase("yes")) {
                Between();
                System.out.print("Enter # of inputs: ");
                int input = ruri.nextInt();
                Between();

                int[] a = new int[input];

                int s = 0;
                int p = 0;
                for (p = 0; p < input; p++) {
                  System.out.print("Enter Number: ");
                  a[s] = ruri.nextInt();
                  s++;
                }
                Between();
                System.out.print("Output: ");
                int j = 0;
                for (j = 0; j < input; j++) {
                  System.out.print(a[j] + ", ");
                }
                Between();
                Line();
              } else if (out5.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              System.out.print("Continue? YES or NO: ");
              String choose5 = ruri.next();
              if (choose5.equalsIgnoreCase("yes")) {
                continue;
              } else if (choose5.equalsIgnoreCase("no")) {
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
				System.exit(0);
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
            case 12:
              Between();
              Line();
              System.out.println("Instruction:");
              Between();
              System.out.println("Enter 5 numbers");
              Between();
              System.out.println("Output: (Highest and Lowest Number)");
              Between();
              Line();
              System.out.print("See output? YES or NO: ");
              String put6 = ruri.next();
              if (put6.equalsIgnoreCase("yes")) {
                Between();
                Line();
                System.out.print("Enter 1st Number: ");
                int number1 = ruri.nextInt();

                System.out.print("Enter 2nd Number: ");
                int number2 = ruri.nextInt();

                System.out.print("Enter 3rd Number: ");
                int number3 = ruri.nextInt();

                System.out.print("Enter 4th Number: ");
                int number4 = ruri.nextInt();

                System.out.print("Enter 5th Number: ");
                int number5 = ruri.nextInt();
                Between();
                int[] numbers = { number1, number2, number3, number4, number5 };

                Arrays.sort(numbers);

                System.out.println(
                  "The lowest number is " + String.valueOf(numbers[0])
                );
                System.out.println(
                  "The highest number is " + String.valueOf(numbers[4])
                );
              } else if (put6.equalsIgnoreCase("no")) {
                continue;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
              Between();
              Line();
              System.out.print("Continue? YES or NO: ");
              String pick5 = ruri.next();
              if (pick5.equalsIgnoreCase("yes")) {
                continue;
              } else if (pick5.equalsIgnoreCase("no")) {
				System.exit(0);
                Between();
                Line();
                System.out.println("Program Discontinued, Thankyou!");
                break;
              } else {
                System.out.println("Error");
				System.exit(0);
                break;
              }
          }
        }
      } catch (Exception e) {
        System.out.println("Error");
      }
    }
  }
}