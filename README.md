# Sudoku-Solver
Sudoku is a game played on a 9x9 grid where every single square is filled with a number from 1 to 9 unique to its row, column, and 3x3 subgrid. This is a program that takes unsolved sudoku from the user and prints out solved sudoku on to the console.This program is completely built in Java using techniques like Recursion and Back-Tracking.
# understanding the problem
  You are given a Sudoku puzzle and you need to fill the empty cells without violating any rules. A sudoku solution must satisfy all of the following rules:

   * There must not be any repeating character in any row
   
   * Same goes for every column
   
   * In addition to that, every grid is further divided into smaller grids for side square_root(N)
   
   * Each of the smaller grids must not have repeating number.
   
   * For every value of N, you can only insert number in the range [1, N]. Suppose that the value of N is 9, then you must insert the numbers in the range [1, 9].
# How it works
This particular algorithm employs the use of backtracking, one of the more common methods to solve Sudoku puzzles. I've written a simple algorithm to give an idea of how the program works.

   * Start.

   * We start with the first empty cell.

   * We generate a list of possible valid values that can be filled in that cell.

   * We iterate over this list and start with the first value. This value is placed in the required cell.

   * We move on to the next cell. We again generate a list of possibilities. However, if no list can be generated, then this means that there is something wrong with        the value of the previous cell. We then move back to the previous cell and place the next value on the generated list in the cell now. We repeat this step until        the current cell has a valid value placed inside it.

   * We stop when we reach the 81st cell (the last cell in a Sudoku puzzle) and have placed a valid value.

   * The puzzle has now been solved

   * Stop.
# personal motivation
Sudoku is a very favourite game puzzle of mine.After I took an intro to programming course in my first year of university, one of my first personal projects was a solution generator in C. I still remember the feelings of excitement and enjoyment that I felt. Now after learning Java I wanted to build a small project that will boost  my confidence to build many more in future.so I decided to build one on my favourite game puzzle.The algorithm design is like the puzzle to me.I always want to try to come up with things on my own before looking at how other people do things. Perhaps in doing so, I will come up with something new, and maybe even something that is better in some ways than existing approaches.
# Tools used
* Visual Studio Code
