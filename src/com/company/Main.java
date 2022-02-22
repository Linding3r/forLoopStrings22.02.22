package com.company;

public class Main {
  public void letterByLetter() {
    String name = "Harry Potter";
    int lenght = name.length();
    String letter;
    for (int i = 0; i < lenght; i++) {
      letter = name.substring(i, i++);
      System.out.println(letter);
    }
  }

  public void letterByLetterChar() {
    String name = "Harry Potter";
    for (int i = 0; i < name.length(); i++) {
      char letter = name.charAt(i);
      System.out.println(letter);
    }
  }

  public int findIndexOf(String word, String letterFind) {
    int iReturn = -1;
    for (int i = 0; i < word.length(); i++) {
      String letter = word.substring(i, i + 1);
      if (letter.equals(letterFind)) {
        System.out.println(letter + " was found at index: " + i);
        iReturn = i;
      }
    }return iReturn;
  }

  public String reverseString(String name) {
    String letter = "";
    for (int i = (name.length())-1; i >= 0; i--) {
      letter += name.charAt(i);
    }return letter;
  }

  public String mockify(String sentence) {
    String letter = "";
    for (int i = 0; i < sentence.length(); i++) {
      int diceNumber = (int) (Math.random() * 2 + 1);
      if (diceNumber == 1) {
        letter += sentence.substring(i, i + 1).toUpperCase();
      }
      else{
        letter += sentence.substring(i, i + 1).toLowerCase();
      }
    }return letter;
  }


  public static void main(String[] args) {

    Main prg = new Main();
    System.out.println(prg.mockify("this is a test to test the test of our new test of tests"));


  }
}
