
public class Validator {

	
	public static boolean validateStudent(Student s)
	{
		
		if(Registrar.registerStudent(s))
		{
		if(s.getPreviousMarks()>80)
		{
			return true;
		}
		else
		return false;
		}
	else
		return false;
	}

	}

