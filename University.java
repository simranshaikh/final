import java.util.Scanner;
public class University {

	static int count=0;
	private static Professor professor;
	Exam exam;
	static Course course;
	
	
	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		University.count = count;
	}


	public static Professor getProfessor() {
		return professor;
	}


	public static void setProfessor(Professor professor) {
		University.professor = professor;
	}


	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}


	public static Course getCourse() {
		return course;
	}


	public static void setCourse(Course course) {
		University.course = course;
	}


	boolean studentVerificationProcess(Student student)
	{
		if (Validator.validateStudent(student))
			System.out.println(student.getSname()+"registered successfully");
		return true;

	}


	public void writeExamGetResult(Exam exam)
	{
		exam.setMarks(90);
		System.out.println("Marks --->"+exam.getMarks());
	}


	public void studentAdmission(Student student,Course course)
	{

		System.out.println("Your student Id is : "+(++count));
		System.out.println(student.getSname()+"you are registered successfully for"+course.getCname()+" Welcome to our Univerisity !!!");
	}


	public void studentCertificationProcess(Student student,Course course)
	{
System.out.println(student.getSname()+" your percentage is 80 above. .");
		System.out.println(student.getSname()+"you are java Professional Certified !!!");
	}


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("- - - Enter Student Name - - - ");
		String sname=sc.next();
		
		System.out.println("- - - Enter Student Age - - - ");
		int age=sc.nextInt();
		
		System.out.println("- - - Enter Student Marks - - - ");
		int marks=sc.nextInt();
		
		System.out.println("- - - Enter Course ID - - -");
		int cid=sc.nextInt();
		
		System.out.println("- - - Enter Course Name - - -");
		String cname=sc.next();
		
		System.out.println("- - - Enter Course Duration - - - ");
		int duration=sc.nextInt();
		
		System.out.println("- - - Enter Professor Name- - -");
		String pname=sc.next();
		

		Student s=new Student();
		s.setAge(age);
		s.setSname(sname);
		s.setPreviousMarks(marks);
		
		//course object
		Course c=new Course(cid, cname, duration);
	 
		//exam obj
	   Exam e=new Exam();
	   

	   //professor obj
	   Professor prof=new Professor();
	   prof.setPname(pname);
	   prof.setStudent(s);
	   //university obj
	   University u=new University();
		
		u.setExam(e);
		u.setCourse(c);
		u.setProfessor(prof);
		
	   
	   u.studentVerificationProcess(s);
	   u.studentAdmission(s, c);
	   prof.teaches(c);
	   prof.conductingExam(e);
	   prof.evaluatingPaper(e);
	   u.writeExamGetResult(e);
	   u.studentCertificationProcess(s, c); 

	
	}
}
