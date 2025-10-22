package Spring.Constructor.Injection;

public class Person {
	private String Name;
	private  int personId;
	
	public Person(String name, int personId) {
		this.Name=name;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return this.Name+"  :"+ this.personId;
	}
	
	

}
