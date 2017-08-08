package T5;

import java.util.HashSet;

public abstract class University {
	
	// Enums for Course Specialization and Course number
	enum Specialization {MATHEMATICS, PHYSICS, LITERATURE, PHILOSOPHY, LANGUAGES };
	enum StudentsCource {FIRST, SECOND, THIRD, FOURTH, FIFTH};
	
	// Min count of students in group to start any course
	public static int minGroupCount = 5;
	
	public static HashSet<Teacher> returnListOfTeachersBasedOnTheirSpecialization(HashSet<Teacher> teachers, Specialization spec) {
		HashSet<Teacher> specTeachers = new HashSet<Teacher>();
		
		for (Teacher t: teachers) {
			if (t.teacherSpecialization == spec) {
				specTeachers.add(t);
			}
		}
		return specTeachers;
	}
	
	public static HashSet<Students> returnListOfStudentsBasedOnTheirSpecialization(HashSet<Students> students, Specialization spec) {
		HashSet<Students> specStudents = new HashSet<Students>();
		
		for (Students s: students) {
			if (s.studentSpecialization == spec) {
				specStudents.add(s);
			}
		}
		return specStudents;
	}
	
	
	
	
}
