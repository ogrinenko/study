package T5;


public abstract class University {
	
	// Enums for Course Specialization and Course number
	enum Specialization {MATHEMATICS, PHYSICS, LITERATURE, PHILOSOPHY, LANGUAGES };
	enum StudentsCource {FIRST, SECOND, THIRD, FOURTH, FIFTH};
	
	// Min count of students in group to start any course
	int minGroupCount = 5;
}
