# Library Management System

A simple Java library management system that models books, library items, members, and borrowing functionality.

## Project Structure

```
src/
├── Main.java          # Entry point with example usage
├── Library.java       # Manages collections of items and members
├── LibraryItem.java   # Base class for all library items
├── Book.java          # Extends LibraryItem with author info
├── Person.java        # Base class for people
└── Member.java        # Extends Person with borrow/return functionality
```

## Class Overview

- **LibraryItem** – Base class with `id`, `title`, and `available` status.
- **Book** – Extends `LibraryItem`, adds `author`.
- **Person** – Base class with `id` and `name`.
- **Member** – Extends `Person`, can borrow and return `LibraryItem`s.
- **Library** – Holds lists of items and members; provides display methods.

## How to Run

### Compile
```bash
javac src/*.java -d out/
```

### Run
```bash
java -cp out/ Main
```

## Requirements

- Java 8 or higher
