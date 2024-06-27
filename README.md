Description:
Track Switch is a simple Android car game where the player controls a red car to avoid collision
with other black cars. The game's objective is to survive as long as possible without crashing into
other cars. The game features include keeping track of the player's score and the highest score
achieved, which is stored using SharedPreferences.
The game dynamically adjusts the speed of gameplay, gradually increasing in correlation with
the duration of player engagement.
Instructions:
1. 1. Start Screen: When the application starts, the user is presented with a start button.
2. 2. Starting the Game: When the user taps the "Start" button, the game begins. The
background changes to a road image, and the player's red car appears at the bottom of
the screen. The user can control the car's position by tapping on the left or right side of
the screen.
3. 3. Gameplay: Other black cars start appearing from the top of the screen and move
downwards. The player must maneuver the red car to avoid collision with these black
cars.
4. 4. Scoring: The player earns points as time progresses without crashing into other cars.
The score is displayed on the screen.
5. 5. Game Over: If the player's red car collides with any black car, the game ends. The
final score is displayed along with the highest score achieved. The user can restart the
game by tapping the "Start" button in closeGame interface.
6. 6. High Score: The highest score achieved by the player is stored and displayed on the
screen. It is updated whenever a new high score is achieved.
