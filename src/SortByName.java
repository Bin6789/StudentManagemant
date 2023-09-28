import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	public int compare(Student student1, Student student2) {
		
		// TODO Auto-generated method stub
		return student1.getName().compareTo(student2.getName());
	}

}
