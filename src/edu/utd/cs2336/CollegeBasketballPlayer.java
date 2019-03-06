package edu.utd.cs2336;

public class CollegeBasketballPlayer extends BasketballPlayer {
	private int eligibiltyRemaining;
	private String role;
	
	public CollegeBasketballPlayer() {
		super();
		eligibiltyRemaining = 4;
		role = "bench";
	}
	
	public CollegeBasketballPlayer(String name, String position, String team) {
		super(name, position, team);
		eligibiltyRemaining = 4;
		role = "bench";
	}
	
	public CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligibilityRemaining, String role) {
		super(name, position, team, height, weight, agility, speed, ballHandling);
		this.eligibiltyRemaining = eligibilityRemaining;
		this.role = role;
	}
	
	public int getEligitibiltyRemaining() {
		return this.eligibiltyRemaining;
	}
	
	public String getRole() {
		return this.role;
	}
	
	@Override
	public String toString() {
		 return super.toString() + "\t" + "role: " + getRole();
	}
	
	public boolean draftable() {
		return (role.equalsIgnoreCase("starter") && super.getValue() > 4) || (role.equalsIgnoreCase("bench") && super.getValue() > 8);
	}
}
