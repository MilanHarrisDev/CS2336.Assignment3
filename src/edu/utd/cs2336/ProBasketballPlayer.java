package edu.utd.cs2336;

public class ProBasketballPlayer extends BasketballPlayer {
	private int yearsInLeague;
	private String role;
	
	public ProBasketballPlayer() {
		super();
		yearsInLeague = 0;
		role = "bench";
	}
	
	public ProBasketballPlayer(String name, String position, String team) {
		super(name, position, team);
		yearsInLeague = 0;
		role = "bench";
	}
	
	public ProBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int yearsInLeague, String role) {
		super(name, position, team, height, weight, agility, speed, ballHandling);
		this.yearsInLeague = yearsInLeague;
		this.role = role;
	}
	
	public int getYearsInLeague() {
		return this.yearsInLeague;
	}
	
	public String getRole() {
		return this.role;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/t" + "Role: " + getRole() + ", Years in League" + getYearsInLeague();
	}
	
	public int newContractValue() {
		if(getYearsInLeague() < 3) return 0;
		else if(role.equalsIgnoreCase("Starter")) 
		{
			if(super.getValue() > 8 && getYearsInLeague() >= 10) return 12000000;
			else if(super.getValue() > 7 && getYearsInLeague() >= 8) return 10000000;
			else if(super.getValue() > 7 && getYearsInLeague() >= 5) return 8000000;
			else if(super.getValue() > 5 && getYearsInLeague() >= 10) return 6000000;
			else if(getYearsInLeague() >= 5) return 2000000;
			else return 1000000;
		}
		else if(role.equalsIgnoreCase("Bench"))
		{
			if(super.getValue() > 8 && getYearsInLeague() > 10) return 7500000;
			else if(super.getValue() > 7 && getYearsInLeague() > 8) return 5000000;
			else if(super.getValue() > 5 && getYearsInLeague() > 10) return 4500000;
			else if(getYearsInLeague() > 7) return 2000000;
			else return 500000;
		}
		else return 0;
	}
}
