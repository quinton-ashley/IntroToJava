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

  public void startGame() {
    txt(title, 5, 3);

    /* Part A: finish the grid of 9x8 spaces */
    txt("─".repeat(26), gridRow + 7, gridCol);
    // txt("─".repeat(26), ?, ?); // draw another horizontal line

    txt("│\n".repeat(23), gridRow, gridCol + 8);
    // txt("│\n".repeat(23), ?, ?); // draw another vertical line

    // the following buttons were created just to help you make the grid
    // you can delete them once you're done
    button(bigO, gridRow, gridCol);
    button(bigX, gridRow + 8, gridCol + 9);
    button(bigO, gridRow + 16, gridCol + 18);
  }

  public TicTacToe() {
    startGame();
  }

  public static void main(String[] args) {
    new TicTacToe();
  }

}
