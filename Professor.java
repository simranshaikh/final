
public class Professor {

	private String pname;
	private Student student;
	
	public void teaches(Course course)
	{
		System.out.println(pname+"  is teaching "+course.getCname()+"  to "+student.getSname());
		
	}
	
	public void conductingExam(Exam exam)
	{
		System.out.println(pname+" is conducting "+exam.getEname()+" to"+student.getSname());
	}
	
	public int evaluatingPaper(Exam exam)
	{
		System.out.println(pname+" is evaluating "+student.getSname()+" "+exam.getEname()+" paper");
		
		return 0;
		
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
