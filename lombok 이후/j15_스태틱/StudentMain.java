package j15_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		for(int i = 0; i < 10 ; i++)
		{
			student[i] = new Student("최연" + (i + 1));
		}
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
			
	}

}