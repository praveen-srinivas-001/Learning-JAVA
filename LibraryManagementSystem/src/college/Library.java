package college;

import java.util.Scanner;


public class Library {

 public static void main(String[] args)
 {

     Scanner input = new Scanner(System.in);

     System.out.println(
         "***********************Welcome to the Library!**********************");
     System.out.println(
         "                  Select From The Following Options:               ");
     System.out.println(
         "**********************************************************************");

     // Creating object of book class
     Books ob = new Books();
     // Creating object of students class
     Students obStudent = new Students();

     int choice;
     int searchChoice;

     do {

         ob.dispMenu();
         choice = input.nextInt();

         // Switch case
         switch (choice) {

             // Case
         case 1:
             Book b = new Book();
             ob.addBook(b);
             break;

             // Case
         case 2:
             ob.upgradeBookQty();
             break;

         // Case
         case 3:

             System.out.println(
                 " press 1 to Search with Book Serial No.");
             System.out.println(
                 " Press 2 to Search with Book's Author Name.");
             searchChoice = input.nextInt();

             switch (searchChoice) {

             case 1:
                 ob.searchBySno();
                 break;

             case 2:
                 ob.searchByAuthorName();
             }
             break;

             // Case
         case 4:
             ob.showAllBooks();
             break;

         case 5:
             Student s = new Student();
             obStudent.addStudent(s);
             break;

         case 6:
             obStudent.showAllStudents();
             break;

         case 7:
             obStudent.checkOutBook(ob);
             break;

             // Case
         case 8:
             obStudent.checkInBook(ob);
             break;

         default:
             System.out.println("ENTER BETWEEN 0 TO 8.");
         }

     }while (choice != 0);
     
     input.close();
 }
}