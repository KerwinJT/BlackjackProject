## Blackjack Project - Week 4 Skill Distillery
This project simulates a game of Blackjack with a dealer and a single player. Through prompts, the player is able to make moves until the player decides to stay or the player busts. After the player passes the turn, the program will reveal the second card of the dealer and will proceed to hit or stay based on pre-written game logic. Once all turns have concluded, the game will print the results of the winner. The stages of code allow the program to determine bust, Blackjack (player and dealer), wins, and pushes.

### Topics and Technologies Used:

#### Topics:
This application applies Enums, Abstract classes, interfaces, and other OOP principles.

#### Technologies:
--Eclipse IDE --Java 8 --Git --GitHub Repositories --MacOS Terminal

### Lessons Learned
This project showed how powerful inheritance can be for reducing code while also introducing unintended behaviors if proper implementation is not followed. For instance, I encountered an issue with a null ArrayList that was be instantiated in an abstract class. Without properly invoking the sub-class in the main application, the program kept trying to access the empty ArrayList and would crash the program. Even though the stack trace pointed to where the error was occurring, it wasn't pointing to where the root of the problem lied. After searching through all lines of the code, I realized that I was trying to call a method and pass an empty ArrayList to the method. Since there was nothing in this ArrayList, the program kept throwing an error and crashing. Solving the problem meant that I had to specifically point to the proper list. After this was fixed, the program ran without issue.