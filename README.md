MySquare Painter

This is a simple Java application that allows you to control a square using your keyboard and paint the grid cells. The application creates a grid of squares and a movable square that you can control using the keyboard.

Table of Contents

Overview
How to Use
Dependencies
Installation
Contributing
License

Overview

This Java application consists of the following main components:

MyKeyboard: This class handles keyboard input and moves the square accordingly. It listens for key presses and moves the square left (A key), right (D key), up (W key), or down (S key). Additionally, it allows you to paint the current square cell (SPACE key).
MySquare: This class represents the movable square on the grid. It can be moved in different directions (left, right, up, down) and can be painted.
SquarePainter: This class initializes the grid of squares and the movable square. It sets up the grid, initializes the keyboard input, and starts the application.
Main: This is the main class that initiates the SquarePainter and starts the application.
How to Use

Clone this repository to your local machine.
Compile and run the Main class in your preferred Java development environment.
Once the application starts, you can control the blue square using the following keys:
A: Move left
D: Move right
W: Move up
S: Move down
SPACE: Paint the current square cell in blue
Paint the grid cells by moving the blue square to different positions and pressing the SPACE key.
Dependencies

This application uses the following dependencies:

SimpleGraphics: A simple graphics library for Java.
Installation

Clone this GitHub repository to your local machine:
bash
Copy code
git clone https://github.com/your-username/MySquarePainter.git
Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).
Make sure to include the SimpleGraphics library in your project.
Compile and run the Main class to start the application.
Contributing

If you'd like to contribute to this project, please follow these guidelines:

Fork the repository.
Create a new branch for your feature or bug fix.
Make your changes and test them thoroughly.
Commit your changes with a clear and descriptive commit message.
Push your changes to your fork.
Create a pull request to the original repository.
Your pull request will be reviewed, and once approved, it will be merged into the main branch.
License

This project is licensed under the MIT License. See the LICENSE file for details.
