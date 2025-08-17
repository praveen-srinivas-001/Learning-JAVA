# Library Management System

A Java-based library management system for managing books, students, and library operations.

## Project Structure

```
├── .metadata/           # IDE metadata
├── libraryManagement/   # Main project directory
│   ├── settings/       # Project settings
│   ├── bin/           # Compiled binaries
│   └── src/           # Source code
│       └── college/   # Main package
│           ├── Book.java      # Book class
│           ├── Books.java     # Books collection class
│           ├── Library.java   # Library management class
│           ├── Student.java   # Student class
│           └── Students.java  # Students collection class
├── Main.class          # Main application entry point
└── Main.java           # Main Java file
```

## Features

- **Book Management**: Add, remove, and manage books in the library
- **Student Management**: Handle student registration and information
- **Library Operations**: Core library functionality for book lending and returns

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE (Eclipse, IntelliJ IDEA, or VS Code)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-management-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd library-management-system
   ```

3. Compile the Java files:
   ```bash
   javac *.java src/college/*.java
   ```

4. Run the application:
   ```bash
   java Main
   ```

## Usage

The system provides functionality to:

- Manage library books inventory
- Handle student registrations
- Process book checkouts and returns
- Track library operations

## Classes Overview

- **Book.java**: Represents individual books with properties like title, author, ISBN
- **Books.java**: Manages the collection of books
- **Student.java**: Represents student information
- **Students.java**: Manages student records
- **Library.java**: Core library operations and management
- **Main.java**: Application entry point

## Configuration

- `version.ini`: Contains version information
- Project settings are stored in the `settings/` directory

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

