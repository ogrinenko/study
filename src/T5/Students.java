package T5;


public class Students extends University{

	// Students data fields
	String studentFirstName;
	String studentLastName;
	Specialization studentSpecialization;
	StudentsCource studentCourse;
	
	// Students Constructor
	public Students(String sFirstName, String sLastName, Specialization sSpec, StudentsCource sCourse) {
		studentFirstName = sFirstName;
		studentLastName = sLastName;
		studentSpecialization = sSpec;
		studentCourse = sCourse;
	}
	

}
