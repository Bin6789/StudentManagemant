
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class StudentManagement {
	public static Scanner input = new Scanner(System.in);
	private StudentFile StFile;
	public List<Student> StList = new ArrayList<>();
	public StudentManagement() {
		try {
			StFile = new StudentFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unused")
	public void add() throws IOException {
		boolean check = true;
		int id = 0;
		if (StList.size()> 0) {
			id = StList.size() + 1;
		}
		else {
			id = 1;
		}
		 System.out.println("Student id: " + id);
		 String name = enterName();
		 int age = enterAge();
		 String address = enterAddress();
		 float gpa = enterGpa();
		 Student St = new Student(id,name,age,address,gpa);
		 StList.add(St);
		 StudentFile.write(StList,"Student.txt");
	}
	public void edit(int id) throws IOException {
        boolean isExisted = false;
        for (Student st : StList) {
            if (st.getID() == id) {
                isExisted = true;
                st.setName(enterName());
                st.setAge(enterAge());
                st.setAddress(enterAddress());
                st.setGpa(enterGpa());
                break;
            }
            StudentFile.write(StList,"Student.txt");
        }
        if (!isExisted) {
        	System.out.printf("id "+ id+ " not existed.\n");
        }
    }
	public void delete(int id) {
        for (Student st : StList) {
            if (st.getID() == id) {
            	StList.remove(st);
                break;
            }
            else {
            	System.out.printf("id "+ id+ " not existed.\n");
            	break;
            }
        }
    }
        
	 public void sortbyName() {
	        Collections.sort(StList, new SortByName());
	    }
	 public void sortbyGpa() {
		 Collections.sort(StList, new SortByGpa());
	 }
	 public void show() {
	        for (Student student : StList) {
	           System.out.print(student.toString());
	        }
	    }
	 public int enterId() {
		 System.out.print("Enter student's id: ");
	        while (true) {
	            try {
	                int id = Integer.parseInt((input.nextLine()));
	                return id;
	            } catch (NumberFormatException ex) {
	                System.out.print("invalid! Enter student's id again: ");
	            }
	        }
	 }
	 public String enterName() {
		 System.out.print("Enter student's name: ");
	     return input.nextLine();
	 }
	 public int enterAge() {
		 System.out.print("Enter student's age: ");
	        while (true) {
	            try {
	                int age = Integer.parseInt((input.nextLine()));
	                if (age < 0 | age > 100) {
	                	throw new NumberFormatException();
	                }
	                return age;
	            } catch (NumberFormatException ex) {
	                System.out.print("invalid! Enter student's age again: ");
	            }
	        }
	 }
	 public String enterAddress() {
		 System.out.print("Enter student's address: ");
	     return input.nextLine();
	 }
	 public float enterGpa() {
		 System.out.print("Enter student's gpa: ");
	        while (true) {
	            try {
	                float gpa = Float.parseFloat((input.nextLine()));
	                if (gpa < 0 | gpa > 4.0) {
	                	throw new NumberFormatException();
	                }
	                return gpa;
	            } catch (NumberFormatException ex) {
	                System.out.print("invalid! Enter student's gpa again: ");
	            }
	        }
	 }
}
