package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("John", "Quincy", "Adams", dBirthDate, "525 AdamsFamily Way", "656-747-9670", "JQAdams@USA.edu","Law");
		Student stu3 = new Student("John", "Fitzgerald", "Kennedy", dBirthDate, "123 Martha's Vineyard Street", "534-455-2433", "JFK@USA.edu","Political Science");
		Student stu4 = new Student("Franklin", "Delanore", "Roosevelt", dBirthDate, "834 Empire State Drive", "410-439-8485", "FDR@USA.edu","Law");
		Student stu5 = new Student("Dwight", "Dee", "Eisenhower", dBirthDate, "345 Main Street NJ", "345-608-0089", "@udel.edu","Business Administration");
		
		HashMap<UUID, Student> my_students = new HashMap<UUID, Student>();
		my_students.put(stu1.getPersonID(), stu1);
		my_students.put(stu2.getPersonID(), stu2);
		my_students.put(stu3.getPersonID(), stu3);
		my_students.put(stu4.getPersonID(), stu4);
		my_students.put(stu5.getPersonID(), stu5);

		assertTrue(my_students.size() == 5);
	}

}
