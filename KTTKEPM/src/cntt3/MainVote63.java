package cntt3;

public class MainVote63 {

	public static void main(String[] args) {
		User63 u1 = new User63("Phat");
		User63 u2 = new User63("Tin");
		User63 u3 = new User63("Duy");
		u1.vote(Candidate.DONAL_TRUMP);
		u2.vote(Candidate.JOE_BIDEN);
		u3.vote(Candidate.DONAL_TRUMP);
		Election63.getInstance().INKQ();;
	}

}
