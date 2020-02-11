import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String first_name;
    private String last_name;
    private String address;
    private String birthday;
    private String section;

    public Student(final String first_name, final String last_name, final String address, final String birthday,
            final String section) {
        this.first_name = ucfirst(first_name);
        this.last_name = ucfirst(last_name);
        this.address = ucfirst(address);
        this.birthday = ucfirst(birthday);
        this.section = ucfirst(section);
    }

    public void setFirstName(final String first_name) {
		this.first_name = ucfirst(first_name);
	}

	public void setLastName(final String first_name) {
		this.last_name = ucfirst(last_name);
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
    }
    public void setAddress(final String address) {
        this.address = ucfirst(address);
    }
    public String getAddress() {
        return address;
    }
    public void setBirthday(final String birthday) {
        this.birthday = ucfirst(birthday);
    }
    public String getBirthday() {
        return birthday;
    }
    public String getSection() {
        return section;
    }
    public void section(final String section) {
        this.section = ucfirst(section);
    }
	private String ucfirst(final String str) {
		return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
	}
}

class Test {
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		final ArrayList<Student> students = new ArrayList<Student>();

		char option = ' ';
		boolean flag = true;

		do {
			System.out.println("Welcome to Student Registration System.");
			System.out.println("[a] Register Student.");
			System.out.println("[b] Display All Students.");
			System.out.println("[c] Exit.");
			System.out.print("Option: ");
			option = scan.nextLine().charAt(0);

			switch(option) {
				case 'A': case 'a': 
					System.out.println("Enter New Student Record");
                    students.add(createStudent());
					break;
				case 'B': case 'b': 
					displayStudents(students);
					break;
				case 'C': case 'c': 
					flag = false; 
					break;
			}		
		} while(flag);
	}

	public static Student createStudent() {
		final Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		final String fname = scan.nextLine();
        System.out.print("Enter Last Name: ");
        final String lname = scan.nextLine();
        System.out.print("Enter Address: ");
        final String ndress = scan.nextLine();
        System.out.print("Enter Birthday: ");
        final String nbirth = scan.nextLine();
        System.out.print("Enter Section: ");
        final String nsect = scan.nextLine();
        return new Student(fname, lname, ndress, nbirth, nsect);
    }

    public static void displayStudents(final ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No student record available");
        } else {
            System.out.println("List of Students");
            for (final Student student : students) {
				System.out.println("Student ID No. " + students.indexOf(student));
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Birthday: " + student.getBirthday());
                System.out.println("Section: " + student.getSection());
			}
		}
	}
} 