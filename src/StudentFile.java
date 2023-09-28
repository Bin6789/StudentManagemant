

import java.io.BufferedWriter;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class StudentFile {
	
	public static void write(List<Student> StList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) {
            for (Student std : StList) {
                writer.write("Tên: " + std.getName() + "\n");
                writer.write("Tuổi: " + std.getAge() + "\n");
                writer.write("Địa chỉ: " + std.getAddress() + "\n");
                writer.write("Id: " + std.getID() + "\n");
                writer.write("\n");
            }
            writer.close();
            System.out.println("Lưu thông tin sinh viên vào tệp " + fileName + " thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu thông tin sinh viên vào tệp " + fileName);
            e.printStackTrace();
        }
    }
	@SuppressWarnings("unchecked")
	public List<Student> read() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (List<Student>) ois.readObject();
	}
}
