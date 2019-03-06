package edu.utd.cs2336;

public class BasketballPlayer {

	protected String name, position, team;
	protected int height, weight, agility, speed, ballHandling;
	
	public BasketballPlayer() {
		name = position = team = "unknown";
		height = weight = agility = speed = ballHandling = 0;
	}
	
	public BasketballPlayer(String name, String position, String team) {
		this.name = name;
		this.position = position;
		this.team = team;
		
		height = weight = agility = speed = ballHandling = 0;
	}
	
	public BasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling) {
		this.name = name;
		this.position = position;
		this.team = team;
		
		this.height = height;
		this.weight = weight;
		this.agility = agility;
		this.speed = speed;
		this.ballHandling = ballHandling;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getAgility() {
		return this.agility;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getBallHandling() {
		return this.ballHandling;
	}
	
	public String toString() {
		return "Player: " + getName() + ", Position: " + getPosition() + ", Team: " + getTeam() + ", Value: " + getValue();
	}
	
	public int getValue() {
		switch(this.position) {
		case "Center":
			if(height >= 82 && weight > 220 && weight < 250 && ballHandling > 5) return 10;         //10
			else if(height >= 80 && weight > 210 && weight < 260 && ballHandling > 5) return 8;     //8
			else if(height >= 80 && ballHandling > 4) return 6;                                     //6
			else if(height > 78 && agility > 7) return 5;       								    //5
			else if(height > 78) return 4;														    //4
			else if(height > 76 && agility > 5) return 2;										    //2
			else return 0;																	        //0
		case "Forward":
			if(height >= 80 && (agility > 8 || speed > 7)) return 10;							    //10
			else if(height >= 78 && agility > 6 && speed > 5) return 8;							    //8
			else if(height >= 77 && agility > 5) return 6;										    //6
			else if(height >= 76 && speed > 4) return 5;										    //5
			else if(height >= 75 && (speed > 3 || agility > 3)) return 3;						    //3
			else if(height >= 74) return 1;														    //1
			else return 0;																		    //0
		case "Guard":
			if(height >= 78 && ballHandling > 7 && (speed > 7 || agility > 7)) return 10;           //10
			else if(height >= 76 && ballHandling > 7 && (speed > 6 || agility > 6)) return 8;	    //8
			else if(height >= 74 && ballHandling > 5 && agility > 5 && speed > 6) return 6;		    //6
			else if(ballHandling > 6 && agility > 6 && speed > 5) return 4;							//4
			else if(ballHandling > 4 && agility > 4) return 2;										//2
			else return 0;																			//0
		default:
			return -1;
		}
	}
}
