package transformer;

import java.util.ArrayList;
import java.util.Collections;

public class battle {
	//Splits the list of transformers into their respective fractions
	public battle(ArrayList<Transformer> transformers){ 
		for(int i = 0; i<transformers.size() ;i++){
			if(transformers.get(i).getFrac().equals("D")){
				decepticons.add(transformers.get(i));
			}else if(transformers.get(i).getFrac().equals("A")){
				autobots.add(transformers.get(i));
			}
		}
	}
	ArrayList<Transformer> decepticons = new ArrayList<Transformer>(); 
	ArrayList<Transformer> autobots = new ArrayList<Transformer>(); 
	ArrayList<Transformer> survivors = new ArrayList<Transformer>(); 
	
	public void beginBattle(){
		int rounds = Math.min(decepticons.size(), autobots.size()); // rounds of battle needed
		int deceptVictories = 0;
		int autoVictories = 0;
		int result ;
		Collections.sort(decepticons);
		Collections.sort(autobots);
		System.out.println("Battles Beginning !!!!");
		System.out.println("Decepticons have : " + decepticons.size() + "combatants");
		System.out.println("Autobots have : " + autobots.size() + " combatants");
		for(int i = 0; i < rounds;i++){
			System.out.println("Battle #"+(i+1)+" !!!!!");
			result = fight(autobots.get(i),decepticons.get(i)); // retrieves result of battle between two transformers
			if(result == 1){
				autoVictories++;
				survivors.add(autobots.get(i));
				System.out.println(autobots.get(i).getName()+ " Wins the battle");
			}else if (result == -1){
				deceptVictories++;
				survivors.add(decepticons.get(i));
				System.out.println(decepticons.get(i).getName()+ " Wins the battle");
			}else{  //DRAW
				if(result == 0){ //OPTIMUS VS PREDAKING Game end
					System.out.println("Optimus vs PredaKing, battle terminated");
					System.out.println("All Transformers destroyed in fight");
					return;
				}
				System.out.println("It was a draw! Both transformers destoryed");
			}
		} 
		// Add the transformers that did not fight onto the survivors list 
		if (autobots.size() > rounds){
			for(int i = rounds;i<autobots.size();i++){
				survivors.add(autobots.get(i));
			}
		}else if(decepticons.size()>rounds){
			for(int i = rounds;i<autobots.size();i++){
				survivors.add(autobots.get(i));
			}
		}
		
		//Ending of battles
		if (autoVictories > deceptVictories){ //Autobots win
			System.out.println("Battles Ended !!" );
			
			System.out.print("Autobots Win : "); //Display the winners
			for(int i =0; i< autobots.size();i++){
					System.out.print(autobots.get(i).getName()+ ", ");
			}
			System.out.println("");
			System.out.print("Survivors from the losing team: "); //Display the survivors
			for(int i =0; i< survivors.size();i++){
				if(survivors.get(i).getFrac().equals("D")){
					System.out.print(survivors.get(i).getName()+ ", ");
				}
			}
		} else if (autoVictories < deceptVictories){ //Decepticon Win
			System.out.println("Battle Ended");
			System.out.print("Decepticon Win : "); //Display the winners
			for(int i =0; i< decepticons.size();i++){
				System.out.print(decepticons.get(i).getName()+ ", ");
			}
			System.out.println("");
			System.out.print("Survivors from the losing team: "); //Display the survivors
			for(int i =0; i< survivors.size();i++){
				if(survivors.get(i).getFrac().equals("A")){
					System.out.print(survivors.get(i).getName()+ ", ");
				}
			}
			
		}else{
			 //Assuming if the score ends in a tie, survivors from each side are listed
			System.out.println("DRAW");
			System.out.print("Survivors from the Autobots: ");
			for(int i =0; i< survivors.size();i++){
				if(survivors.get(i).getFrac().equals("A")){
					System.out.print(survivors.get(i).getName()+ ", ");
				}
			}
			System.out.println("");
			System.out.print("Survivors from the Decepticons: ");
			for(int i =0; i< survivors.size();i++){
				if(survivors.get(i).getFrac().equals("D")){
					System.out.print(survivors.get(i).getName()+ ", ");
				}
			}
		}
		
	}
	//compares two transformers and returns 1 if autobots win,
	//-1 if decepticon wins, 9 if tie and 0 in the case of PredaKing vs Optimus Prime
	public int fight(Transformer t_a, Transformer t_d){ 
		if(t_a.getName().equals("Optimus Prime")){//Check if optimus is fighting
			if(t_d.getName().equals("PredaKing")){ // Check if predaking is fighting optimus
				return 0;
			}else{
				System.out.println("Optimus automatically wins");
				return 1;
			}
		}else if (t_d.getName().equals("PredaKing")){ //Check if predaking is fighting
			System.out.println("PredaKing automatically wins");
			return -1;
		}

		if( t_a.getCourage() >= t_d.getCourage()+4 && t_a.getStr() >= t_d.getStr()+3 ){ //down 4 or more points of courage and 3 or more points of strength
			System.out.println(t_d.getName() + " has fled the battle");
			return 1;
		}else if(t_d.getCourage() >= t_a.getCourage()+4 && t_d.getStr() >= t_a.getStr()+3){
			System.out.println(t_a.getName() + " has fled the battle");
			return -1;
		}else if(t_a.getSkill() >= t_d.getSkill()+3){
			System.out.println(t_a.getName() + " has better skills than " + t_d.getName()); // up 3 or more in skill
			return 1;
		}else if(t_d.getSkill() >= t_a.getSkill()+3){
			System.out.println(t_d.getName() + " has better skills than "  + t_a.getName());
			return -1;
		}else if(t_a.getOverall() > t_d.getOverall()){
			System.out.println(t_a.getName() + " has a higher overall stats than "  + t_d.getName()); // overall stats
			return 1;
		}else if(t_d.getOverall() > t_a.getOverall()){
			System.out.println(t_d.getName() + " has a higher overall stats than "  + t_a.getName());
			return -1; 
		}
		return 9; // return 9 if battle is a tie;
	}

}
