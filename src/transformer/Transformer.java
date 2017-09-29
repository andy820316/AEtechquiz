package transformer;

public class Transformer implements Comparable<Transformer> { // Class Transformer to hold the stats of each transformer
	private String name; 
	private String fraction;
	private int strength;
	private int intelligence;
	private int speed;
	private int endurance;
	private int rank;
	private int courage;
	private int firepower;
	private int skill; 
	private int overall; 
		public Transformer (String name, String fraction, int strength, int intelligence,
				int speed,int endurance, int rank, int courage, int firepower, int skill ){
			this.setName(name);
			this.setFrac(fraction);
			this.setStr(strength);
			this.setInt(intelligence);
			this.setSpd(speed);
			this.setRank(rank);
			this.setCourage(courage);
			this.setFpw(firepower);
			this.setSkill(skill);
			this.setOverall(strength + intelligence + speed + endurance + firepower); 
			
		}
		public String getFrac() {
			return fraction;
		}
		public void setFrac(String fraction) {
			this.fraction = fraction;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStr() {
			return strength;
		}
		public void setStr(int strength) {
			this.strength = strength;
		}
		public int getInt() {
			return intelligence;
		}
		public void setInt(int intelligence) {
			this.intelligence = intelligence;
		}
		public int getSpd() {
			return speed;
		}
		public void setSpd(int speed) {
			this.speed = speed;
		}
		public int getEnd() {
			return endurance;
		}
		public void setEnd(int endurance) {
			this.endurance = endurance;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public int getCourage() {
			return courage;
		}
		public void setCourage(int courage) {
			this.courage = courage;
		}
		public int getFpw() {
			return firepower;
		}
		public void setFpw(int firepower) {
			this.firepower = firepower;
		}
		public int getSkill() {
			return skill;
		}
		public void setSkill(int skill) {
			this.skill = skill;
		}
		public int getOverall() {
			return overall;
		}
		public void setOverall(int overall) {
			this.overall = overall;
		}

		@Override
		public int compareTo(Transformer transformer) { //To help sort transformers by rank.
			int comprank = transformer.getRank();
			return comprank - this.rank ;
		}


}
