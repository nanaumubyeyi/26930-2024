package umubyeyi;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
        p1.name = "kelly";
        p1.age = 24;
        p1.city = "kigali";
        p1.height = 1.70;
        Person.totalPeople++;


        Person p2 = new Person();
        p2.name = "nana";
        p2.age = 25;
        p2.city = "Kampala";
        p2.height = 1.75;
        Person.totalPeople++;


        Person p3 = new Person();
        p3.name = "james";
        p3.age = 22;
        p3.city = "Nairobi";
        p3.height = 1.65;

        Person.totalPeople++;
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
      System.out.println("\n ------- set height ------");
        p1.setHeight(1.70);
        p2.setHeight(1.83);


       System.out.println("\n---- had have birth day ----");
        p1.haveBirthday();


        System.out.println("\n--- Creating 5 more people ---");

        for (int i = 1; i <= 5; i++) {
            Person p = new Person();
            p.name = "Person" + i;
            p.age = 20 + i;
            p.city = "City" + i;
            p.height = 1.70 + (i * 0.01);

            Person.totalPeople++;

            p.displayInfo();
        }


        Person.showTotalPeople();
	}

}
