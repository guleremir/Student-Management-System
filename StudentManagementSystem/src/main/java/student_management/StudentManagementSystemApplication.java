package student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import student_management.entity.Student;
import student_management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Student student1 = new Student("Emir", "Güler", "guleremir@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Nur", "Gürsoy", "nurgursoy@gmail.com");
//		studentRepository.save(student2);
	}

}
