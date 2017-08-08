package T5;

import T5.University.*;
import java.util.HashSet;

public class Teacher {
	
	/**
	 * Teacher filed parameters
	 */
	HashSet<Students> students = new HashSet<>(20);
	String teacherFirstName;
	String teacherLastName;
	Specialization teacherSpecialization;
	boolean teacherHasGroup = false;
	
	/**
	 * Teacher Constructor
	 * @param firstName 
	 * @param lastName
	 * @param spec 
	 */
	Teacher(String firstName, String lastName, Specialization spec) {
		teacherFirstName = firstName;
		teacherLastName = lastName;
		teacherSpecialization = spec;
	}
	
	/**
	 * Adding Student ino the group is it's Specialization is the same as Teacher has
	 * @param newStudent
	 * @param displayLog - enable/disable logging of students 
	 */
	protected void addStudentIntoGroup(Students newStudent, boolean displayLog) {
		String msg;
		if (newStudent.studentSpecialization == teacherSpecialization) {
			msg = "Student " + newStudent.studentFirstName + " " + newStudent.studentLastName + " was assigned to " + this.teacherFirstName + " " + this.teacherLastName;
			students.add(newStudent);
		} else {
			msg = "Specialization " + newStudent.studentSpecialization + " of the Student" + newStudent.studentFirstName + " " + newStudent.studentLastName 
					+ " doesn't corresponds to teacher. Student: " + newStudent.studentSpecialization + ", while Teacher Specialization is: " + this.teacherSpecialization;
		}
		
		if (displayLog) {
			System.out.println(msg);
		}
		if (this.students.size() >= University.minGroupCount) {
			teacherHasGroup = true;
		}
			
	}

	/**
	 * Return list of Students currently in Teacher group
	 * @param logging - enable/disable logging of students in Group 
	 * @return
	 */
	protected HashSet<Students> getCurrentTeacherGroup(boolean logging) {
		if (logging) {
			System.out.println("Current group of " + this.teacherFirstName + " " + this.teacherLastName + " for Specialization " + this.teacherSpecialization + " contains: " + students.size() + " students.");
			for (Students s : this.students) {
				System.out.println(s.studentFirstName + " " + s.studentLastName );
			}
		}
		return students;
	}
	
	/**
	 * Return True - if group contains min count of students to start the course
	 * @param logging - enable/disable logging of students 
	 * @return
	 */
	protected boolean isGroupReadyToStartTeaching(boolean logging) {
		boolean fullGroup = false;
		if (this.getCurrentTeacherGroup(logging).size() >= University.minGroupCount) {
			fullGroup = true;
		}
		return fullGroup;
	}

	/**
	 * Return specific teacher based on Specialization from incoming Teachers list
	 * @param teachers
	 * @param spec
	 * @return
	 * @throws Exception - There is not Teacher with desired Specialization
	 */
	public static Teacher returnTeacherBasedOnSpecialization(HashSet<Teacher> teachers, Specialization spec) throws Exception {
		Teacher necessaryTeacher = null;;
		for (Teacher t : teachers) {
			if (t.teacherSpecialization == spec)
			{
				necessaryTeacher = t;
			}
		}
		if (necessaryTeacher == null) {
			throw new Exception("There is not Teacher with Specialization " + spec);
		}
		return necessaryTeacher;
	}

}
