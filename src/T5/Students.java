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
	
	@Override
	public int hashCode() {
	  int result = 1;
	  result = result + ((studentLastName == null) ? 0 : studentLastName.hashCode());
	  return result;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Students other = (Students) obj;
	    if ((studentLastName == null) || (studentFirstName == null)) {
	      if ((other.studentLastName != null) || (other.studentFirstName != null))
	        return false;
	    } else if ((!studentLastName.equals(other.studentLastName)) || (!studentFirstName.equals(other.studentFirstName))) 
	      return false;
	    return true;
	  }
	
	
}
