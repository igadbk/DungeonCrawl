# Dungeon Crawl 
Dungeon Crawl is a roguelike game implemented in Java, following object-oriented programming principles. The game is inspired by classic roguelike games and features tile-based gameplay, turn-based actions, and procedural generation of levels, monsters, and items.

## Gameplay

In Dungeon Crawl, the player's task is to explore a labyrinth and retrieve treasures from its depths. The game is divided into turns, where the player takes one action, followed by other entities controlled by the CPU. The goal is to navigate through the dungeon, defeat monsters, collect valuable items, and ultimately reach the bottom to claim the ultimate treasure.

## Features

The game incorporates the following features:

- Tile-based gameplay: The dungeon is represented by a grid of tiles, and the player can move across these tiles to explore the environment.
- Turn-based actions: The player and CPU-controlled entities take turns to perform actions, allowing strategic decision-making and planning.
- Procedural generation: The game utilizes procedural generation techniques to create randomized levels, monster placements, and item distributions, ensuring a unique experience with each playthrough.
- Permadeath: If the player dies during the game, it's game over, and they need to start from the beginning, emphasizing the importance of careful decision-making and resource management.

## Project Structure

The project follows the principles of layer separation, with the game logic and rules implemented in the `logic` package. This design allows for easy integration of different user interfaces, such as a graphical user interface, terminal-based interface, web interface, or even virtual reality. The logic code remains independent of the specific user interface implementation.

## License

Dungeon Crawl  is released under the [MIT License](LICENSE). Feel free to use, modify, and distribute the game according to the terms of the license.

## Acknowledgments

The Dungeon Crawl  project was developed as part of the Codecool curriculum. Special thanks to the instructors and mentors for their guidance and support.

Enjoy exploring the dungeon and conquering its challenges in Dungeon Crawl! If you have any questions or suggestions, please feel free to reach out.
