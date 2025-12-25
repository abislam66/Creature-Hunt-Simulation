# Creature Hunt Simulation

## Overview
A Java-based object-oriented simulation that models interactions between
creatures, humans, monsters, and environmental obstacles using the
Model–View–Controller (MVC) architecture.

The project demonstrates clean separation of concerns, extensible design,
and core object-oriented programming principles.

## Simulation Description
The simulation consists of multiple entity types interacting within
a shared environment:

- **Creatures / Humans** that move through the world
- **Monsters** that hunt other entities
- **Bushes** that act as environmental obstacles
- A controller that coordinates interactions and simulation logic

The system is designed to be easily extended with new entity types
or behaviors.

## Architecture
The project follows the **MVC (Model–View–Controller)** pattern:

- **Model**: Represents the simulation state and entities
- **View**: Handles output and visualization
- **Controller**: Manages interactions and simulation flow

This structure keeps the code modular, readable, and maintainable.

## Features
- Multiple interacting entity types
- Object-oriented class hierarchy
- Use of inheritance and polymorphism
- Modular and extensible simulation design
- Clear separation of concerns via MVC

## Project Structure
All source files are located in the `src/` directory.
```
src/
├── Bush.java
├── Controller.java
├── Creature.java
├── Grader.java
├── Hunt.java
├── Model.java
├── Monster.java
├── Person.java
└── View.java

```

## How to Run
1. Compile the source files:
   ```bash
   javac src/*.java
Run the main simulation:

java -cp src Hunt


Tech Stack
Java
Object-Oriented Programming
MVC Architecture
