# DataDesigner

Create a program that an 1980s video rental store employee could've used to manage the store's inventory. Don't use any clickable buttons in this program, use the `text`, `prompt`, and `alert` functions instead.

## Instructions for Part A

Create a JSON file called `films.json`. For now just create one film inside it. A film object should have the following properties: `id` string, `title` string, `genre` number code, `rating` number, and `description` string. The rating should be a number 1-5. Each film object should have a unique two character long `id` string.

## Instructions for Part B

Try loading the film data from the `films.json` file and just log it to the JS console for now.

## Instructions for Part C

Add the film data to the table with the example films.

Now since we want to store multiple films in our JSON database, change your JSON file so that it just has one property called `films` which will contain an array of film objects. Add the film object you made previously and at least 3 more films to the array.

Your `dataDesigner.js` program should read the `films.json` file and display all the films in a table. Remove the example film data from the table. Use a `for of` loop to add films to the table.

Create a JSON file called `members.json`. Inside the object create a property called `members` which will contain an array of member objects. Add at least 3 members to the array. Each member object should have the following properties: `id` string, `name` string, and `rented` array. The `rented` array should contain the `id` strings of the films the member has rented.

When the program starts it should show a main menu prompt that gives the user three options: view a member, view a film's info, or exit (close the program).

If the user chooses to view a member, the program should display the member's name and the ID and titles of the films they have rented in the same format as the table you've made so far. The screen for viewing a member should have a prompt with three options: go back to the main menu, view a film's info, or return the film (delete the film from the user's rented list).

If the user chooses to view a film, the program should display the film's title, genre, rating, and description.

If the user chooses to exit the program, the program should call the QuintOS `exit` function.

If the user enters an invalid member ID, the program should display an error message and return to the main menu. If the user enters a valid member ID, the program should let the user edit the customer's rented movies list by adding or removing movies.
