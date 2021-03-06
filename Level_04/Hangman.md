# Hangman

[Hangman](<https://en.wikipedia.org/wiki/Hangman_(game)>) is a word guessing game for two or more players. One player thinks of a word and the other(s) try to guess it by suggesting letters. The word to guess is represented by underscores, representing each letter of the word. If the player(s) guess a correct letter in the word it is written in all the correct positions.

## Instructions for Part A

Split the `wordsList` String into an array of words, call it `words`. HINT: use the `split` String function.

Pick a random word from the array of words. HINT: Remember `.length` can be use to get the length of an array. Reference your use of `Math.random()` and `Math.floor(x)` in the GuessTheNumber game.

## Instructions for Part B

Create a `lines` array with the same amount of underscores as the chosen word. For example, if the word is "quiz" the `lines` array should have four dashes: `['_', '_', '_', '_']`. HINT: Use `word.length` and the `repeat` and `toCharArray` functions.

## Instructions for Part C

Display the `lines` array like this `_ _ _ _` in the prompt on a new line below the hangman text drawing. HINT: use a while loop with a counter variable and remember the newline character `\n`

If the player guesses a letter which occurs in the word, edit the `lines` array so the letter will be displayed in all its correct positions. For example if the word is "avenue" and the player has guessed "e" your prompt should display: `_ _ e _ _ e` HINT: use a while loop with a counter variable to loop through each letter in the word.

Make the game loop! Add a variable for how many wrong guess the player has made. If they get more than 6 wrong the game should end.

If the player guesses a letter which does not occur in the word, the computer should add a body part to the hangman stick figure. HINT: Don't check if they got a letter wrong, just ensure their guess matched none of the letters in the word.

## Instructions for Part D

Replace the while loops you used for counting, use for loops instead!

Make the game a bit easier by adding more drawings to the `hangman` array.

## Instructions for Part E

If the player has won the game by guessing each letter in the word, the `lines` array will not contain any line characters. HINT: Use `break` to exit the game loop early. Your program doesn't need to prompt the player for another guess if they already won.

The player guessing the word may, at any time, attempt to guess the whole word. If the word is correct, the game is over and the guesser wins.

At the end of the game tell the player if they won or lost and show them what the word was.
