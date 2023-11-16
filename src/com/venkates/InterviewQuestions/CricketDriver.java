package com.venkates.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CricketDriver {
	
public static void main(String[] args) {
	
	List<Player> players=new ArrayList<Player>();
	players.add(new Player("Sachin",100, "Batsmen"));
	players.add(new Player("Dravid",50, "Batsmen"));
	players.add(new Player("Bumrah",30, "Bowler"));
	players.add(new Player("Yadav",70, "Batsmen"));
	players.add(new Player("Gill",80, "Batsmen"));
	players.add(new Player("Ashwin",80, "Bowler"));
	
	Team mumInd=new Team();
	mumInd.setPlayers(players);
		
	//Find out the total score of the team
	System.out.println("Total score of the team "+ players.stream().mapToInt(player -> player.getScore()).reduce(0,(a,b) -> a+b));
	
	// Group the players according to the skill
	Map<String, List<Player>>  groupByTye= players.stream().collect(Collectors.groupingBy(Player::getType));
	System.out.println("Grouping by player type"+ groupByTye);

	
}
}
