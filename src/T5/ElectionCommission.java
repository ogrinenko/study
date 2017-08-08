package T5;

import java.util.ArrayList;
import java.util.HashSet;

import T5.University.*;

public class ElectionCommission {

	

	public static void main(String[] args) {

		// Create Teachers 
		HashSet<Teacher> allTeachers = new HashSet<Teacher>();
		allTeachers.add(new Teacher("Vladimir", "Sencov", Specialization.MATHEMATICS));
		allTeachers.add(new Teacher("Vladimir", "Sencov", Specialization.MATHEMATICS));
		allTeachers.add(new Teacher("Vitalii", "Tsygan", Specialization.PHYSICS));
		allTeachers.add(new Teacher("Elena", "Kravets", Specialization.LITERATURE));
		allTeachers.add(new Teacher("Inna", "Shvets", Specialization.LANGUAGES));
		allTeachers.add(new Teacher("Viktoriia", "Bondarenko", Specialization.PHILOSOPHY));
		
		// Create 12 Students to be analyzed
		HashSet<Students> allStudents = new HashSet<Students>();
		
		allStudents.add(new Students("Ivan", "Sokol", Specialization.PHYSICS, StudentsCource.FIRST));
		allStudents.add(new Students("Ivan", "Mikhailenko", Specialization.PHILOSOPHY, StudentsCource.SECOND));
		allStudents.add(new Students("Tamara", "Brizgalova", Specialization.LANGUAGES, StudentsCource.FIRST));
		allStudents.add(new Students("Vlad", "Gusev", Specialization.MATHEMATICS, StudentsCource.THIRD));
		allStudents.add(new Students("Serhii", "Babenko", Specialization.MATHEMATICS, StudentsCource.FIRST));
		allStudents.add(new Students("Mikhailo", "Solodkii", Specialization.PHYSICS, StudentsCource.FOURTH));
		allStudents.add(new Students("Elena", "Komisarova", Specialization.PHYSICS, StudentsCource.FIRST));
		allStudents.add(new Students("Vitalii", "Bashkevich", Specialization.PHYSICS, StudentsCource.FIFTH));
		allStudents.add(new Students("Serhii", "Panasenko", Specialization.PHYSICS, StudentsCource.FIRST));
		allStudents.add(new Students("Ivan", "Korenkov", Specialization.PHYSICS, StudentsCource.SECOND));
		allStudents.add(new Students("Bohdan", "Onishchenko", Specialization.LITERATURE, StudentsCource.FOURTH));
		allStudents.add(new Students("Dmitrii", "Nikitin", Specialization.MATHEMATICS, StudentsCource.FIFTH));
		allStudents.add(new Students("Anton", "Zemlyanskii", Specialization.MATHEMATICS, StudentsCource.THIRD));
		allStudents.add(new Students("Andrii", "Zinevich", Specialization.MATHEMATICS, StudentsCource.THIRD));
		allStudents.add(new Students("Andrii", "Zinevich", Specialization.MATHEMATICS, StudentsCource.THIRD));
		allStudents.add(new Students("Andrii", "Zinevich", Specialization.MATHEMATICS, StudentsCource.THIRD));
		allStudents.add(new Students("Andrii", "Zinevich", Specialization.MATHEMATICS, StudentsCource.THIRD));
		
		// Form Groups based on Specialization with max group count
		ArrayList<HashSet<Students>> dividedGroups = new ArrayList<HashSet<Students>>(); 
//		for (Students s : allStudents) {
//			
//			switch (s.studentSpecialization) {
//			case MATHEMATICS:
//			//	dividedGroups.add(e)
//				break;
//
//			
//			}
//			
//			
//			
//		}
		
		dividedGroups = University.returnListOfPeoplesBasedOnTheirSpecialization(allStudents,Specialization.MATHEMATICS);
		
		
		
		// Assign All students to Teachers
		for (Students s : allStudents) {
			String erroMsg = "Dear " + s.studentFirstName + " " + s.studentLastName + " , we are sorry, but for specialization " + s.studentSpecialization + " we do not have a Teacher.";
			switch (s.studentSpecialization) {
				
			case MATHEMATICS :
				try {
					Teacher.returnTeacherBasedOnSpecialization(allTeachers, Specialization.MATHEMATICS).addStudentIntoGroup(s, false);
				} catch (Exception e) {
						System.out.println(erroMsg);
				}
				break;
			case PHYSICS :
				try {
					Teacher.returnTeacherBasedOnSpecialization(allTeachers, Specialization.PHYSICS).addStudentIntoGroup(s, false); 
				} catch (Exception e) {
					System.out.println(erroMsg);
			}
				break;
			case PHILOSOPHY :
				try {
					Teacher.returnTeacherBasedOnSpecialization(allTeachers, Specialization.PHILOSOPHY).addStudentIntoGroup(s, false);
				} catch (Exception e) {
					System.out.println(erroMsg);
			}
				break;
			case LANGUAGES :
				try {
					Teacher.returnTeacherBasedOnSpecialization(allTeachers, Specialization.LANGUAGES).addStudentIntoGroup(s, false);
				} catch (Exception e) {
					System.out.println(erroMsg);
			}
				break;
			case LITERATURE :
				try {
					Teacher.returnTeacherBasedOnSpecialization(allTeachers, Specialization.LITERATURE).addStudentIntoGroup(s, false);
				} catch (Exception e) {
					System.out.println(erroMsg);
			}
				break;
			}
			
		}
		
		// Display status of the Groups that are/not ready to start the course
		for (Teacher t : allTeachers) {
			if (t.isGroupReadyToStartTeaching(false))
			{
				System.out.println("Group of " + t.teacherFirstName + " " + t.teacherLastName + " is ready to start the course of " + t.teacherSpecialization);
				t.getCurrentTeacherGroup(true);
				System.out.println();
			} else {
				System.out.println("Group of " + t.teacherFirstName + " " + t.teacherLastName + " doesn't contains enough students.");
			}
			
		}
		
	}

}
