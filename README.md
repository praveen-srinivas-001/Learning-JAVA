# Library Management System

A comprehensive Java-based console application for managing library operations including books, students, and lending services.

## Project Structure

```
├── .metadata/           # Eclipse IDE metadata (ignored by git)
├── libraryManagement/   # Main Eclipse project directory
│   ├── settings/       # Eclipse project settings
│   ├── bin/           # Compiled class files (ignored by git)
│   └── src/           # Source code
│       └── college/   # Main package
│           ├── Book.java      # Book entity class
│           ├── Books.java     # Book collection management
│           ├── Library.java   # Main application with menu system
│           ├── Student.java   # Student entity class
│           └── Students.java  # Student collection management
```

## Features

### Book Management
- Add new books with serial number, name, author, and quantity
- Search books by serial number or author name
- Display all available books
- Update book quantities
- Track available vs total quantity

### Student Management
- Register new students with name and registration number
- Display all registered students
- Prevent duplicate registrations

### Library Operations
- **Check Out Books**: Students can borrow up to 3 books
- **Check In Books**: Return borrowed books to increase available quantity
- Real-time availability checking
- Comprehensive menu-driven interface

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE (Eclipse recommended, IntelliJ IDEA, or VS Code)

### Installation & Running

#### Method 1: Using Eclipse (Recommended)
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-management-system.git
   ```

2. Open Eclipse and import the project:
   - File → Import → General → Existing Projects into Workspace
   - Select the `libraryManagement` folder

3. Run the application:
   - Right-click on `Library.java` → Run As → Java Application

#### Method 2: Command Line
1. Navigate to the project directory:
   ```bash
   cd libraryManagement
   ```

2. Compile and run:
   ```bash
   javac src/college/*.java
   java -cp src college.Library
   ```

## Usage Guide

When you run the application, you'll see a menu with these options:

1. **Add new Book** - Register books in the system
2. **Upgrade Quantity** - Increase quantity of existing books  
3. **Search Book** - Find books by serial number or author
4. **Show All Books** - Display complete book inventory
5. **Register Student** - Add new students to the system
6. **Show All Students** - View registered students
7. **Check Out Book** - Allow students to borrow books
8. **Check In Book** - Process book returns
0. **Exit** - Close the application

### Example Workflow:
1. Add some books to the library
2. Register students
3. Students can check out available books
4. Students return books when done
5. View reports of all books and students

## Classes Overview

- **Book.java**: Entity class representing individual books with serial number, name, author, and quantity tracking
- **Books.java**: Collection manager for all books with methods for adding, searching, checking out/in
- **Student.java**: Entity class for student information and borrowed books tracking  
- **Students.java**: Collection manager for students with registration and book lending operations
- **Library.java**: Main application class with menu system and program entry point

## System Limitations

- Maximum 50 books can be stored
- Maximum 50 students can be registered  
- Each student can borrow maximum 3 books
- Console-based interface only

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

