import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 String choose = null;
	     boolean exit = false;
	     StudentManagement stmng = new StudentManagement();
	        int studentId;
	        showMenu();
	        while (true) {
	            choose = scanner.nextLine();
	            switch (choose) {
	            case "1":
	                stmng.add();
	                break;
	            case "2":
	                studentId = stmng.enterId();
	                stmng.edit(studentId);
	                break;
	            case "3":
	                studentId = stmng.enterId();
	                stmng.delete(studentId);
	                break;
	            case "4":
	                stmng.sortbyGpa();
	                break;
	            case "5":
	                stmng.sortbyName();
	                break;
	            case "6":
	                stmng.show();
	                break;
	            case "0":
	                System.out.println("Exited!");
	                exit = true;
	                break;
	            default:
	                System.out.println("Invalid! Please choose action in below menu:");
	                break;
	            }
	            if (exit) {
	                break;
	            }
	            // show menu
	            showMenu();
	        }
	  }
}
