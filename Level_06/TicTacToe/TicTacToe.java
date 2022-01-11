package games_java.TicTacToe;

import static games_java.QuintOS.*;

public class TicTacToe {

  String title = """
      TTTTT IIIII   CCC
        T     I    C
        T     I    C
        T     I    C
        T   IIIII   CCC

      TTTTT  AAA    CCC
        T   A   A  C
        T   AAAAA  C
        T   A   A  C
        T   A   A   CCC

      TTTTT  OOO   EEEE
        T   O   O  E
        T   O   O  EEE
        T   O   O  E
        T    OOO   EEEE""";

  String bigSpace = "        \n".repeat(7);

  String bigO = """
       OOOOOO
      OO    OO
      OO    OO
      OO    OO
      OO    OO
      OO    OO
       OOOOOO""".substring(1); // slice off the first newline character

  String bigX = """
      XX    XX
       XX  XX
        XXXX
         XX
        XXXX
       XX  XX
      XX    XX""".substring(1);

  int gridRow = 3;
  int gridCol = 26;

  public TicTacToe() {

    text(title, 5, 6);
    /* PART A: finish the grid of 9x8 spaces */
    text("─".repeat(26), gridRow + 7, gridCol);
    // text("─".repeat(26), ?, ?); // draw another horizontal line

    text("│\n".repeat(23), gridRow, gridCol + 8);
    // text("│\n".repeat(23), ?, ?); // draw another vertical line

    /* PART A: Make the buttons in the grid */
    // note the intervals! row += 8 and col += 9
    // test code, delete after reading
    button(bigO, gridRow, gridCol);
    button(bigX, gridRow + 8, gridCol + 9);
    button(bigO, gridRow + 16, gridCol + 18);

  }

  public static void main(String[] args) {
    new TicTacToe();
  }

}
