# TicTacAIO

Make an artificial intelligence player that places Os on the grid!

## Instructions

For TicTacAIO you'll just be adding onto your code from 'TicTacToe'. Copy and paste the code into your `TicTacAIO.java` file.

Make buttons to let the user pick between starting a two player game or one player game against your AI player.

Make three levels of AI player:

- Easy : picks the first available space
- Medium : picks one of the available spaces left (not from tbe whole grid)
- Hard : picks a winning move if available, blocks opponent's winning moves if they have any, otherwise it picks any available space

Start by making the easy AI.

Make the medium AI, which should only pick a space from a list of available spaces. HINT: Use an ArrayList!

Then implement the hard AI.

Also make a "Challenge Mode" option for the AI difficulty. Make it progressive, so the player has to beat the easy AI, then the medium AI, before they play against the hard AI.

## CHALLENGE SECTION

TicTacToe is a solved game, meaning that if both players always play their best moves, the game will end in a forced draw.

Try implementing a Very Hard AI player that's unbeatable and uses strategies to win against unskilled players.

First make a 0 player mode to test your Very Hard AI against your Hard AI. Have a limit to the number of matches that will be played. You should be able to view the results of each match.
