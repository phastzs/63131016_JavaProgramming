package cntt3;

public class User63 {
	
	String name;

	public User63(String name) {
		this.name = name;
	}

	public void vote(Candidate c) {		
		Election63.getInstance().vote(c, name);
	}
}
