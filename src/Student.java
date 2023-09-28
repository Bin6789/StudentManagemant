import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private String address;
	private double gpa ;
	static int count = 0;
	
	public Student() {

	}
	public Student(int id, String name, int age, String address, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public int getID() {
		return id;
	}
	public void setId(int id) {
        this.id = id;
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
        this.age = age;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
        this.name = name;
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
        this.address = address;
    }
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
        this.gpa = gpa;
    }
	public String getFileLine() {
		return id +","+name+","+age+","+address+","+gpa+"\n";
	}
	@Override
	public String toString() {
		return id+","+name+","+age+","+address+","+gpa+"\n";
	}
	
}
