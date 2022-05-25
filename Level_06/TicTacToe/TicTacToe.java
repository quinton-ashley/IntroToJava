package games_java.TicTacToe;

import static games_java.QuintOS.*;

public class TicTacToe {
  public static void main(String[] args) {

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

    String bigO = " OOOOOO \n" +
        "OO    OO\n" +
        "OO    OO\n" +
        "OO    OO\n" +
        "OO    OO\n" +
        "OO    OO\n" +
        " OOOOOO ";

    String bigX = "XX    XX\n" +
        " XX  XX \n" +
        "  XXXX  \n" +
        "   XX   \n" +
        "  XXXX  \n" +
        " XX  XX \n" +
        "XX    XX";

    String bigSpace = "        \n".repeat(7);

    int gridRow = 3;
    int gridCol = 26;

    text(title, 5, 3);
    /* Part A: finish the grid of 9x8 spaces */
    text("─".repeat(26), gridRow + 7, gridCol);
    // text("─".repeat(26), ?, ?); // draw another horizontal line

    text("│\n".repeat(23), gridRow, gridCol + 8);
    // text("│\n".repeat(23), ?, ?); // draw another vertical line

    /* Part A: Make the buttons in the grid */
    // note the intervals! row += 8 and col += 9
    // test code, delete after reading
    button(bigO, gridRow, gridCol);
    button(bigX, gridRow + 8, gridCol + 9);
    button(bigO, gridRow + 16, gridCol + 18);
  }

}
