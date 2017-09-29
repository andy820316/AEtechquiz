package transformer;

import java.util.ArrayList;

public class TransformerBattle {

	public static void main(String[] args) {
		ArrayList<Transformer> transformers = new ArrayList<Transformer>();
		//name, fraction, str, int, spd, endur, rank, courage,firepower,skill
		/*Sample Data
		Transformer optimus = new Transformer("PredaKing","D",1,2,3,3,1,6,6,7);
		Transformer optimus9 = new Transformer("Rhinox","D",5,2,3,3,4,5,3,7);
		Transformer optimus3 = new Transformer("Freezer","D",5,2,9,3,4,5,3,10);
		Transformer optimus6 = new Transformer("Coolblaze","D",1,2,3,3,5,5,16,7);
		Transformer optimus1 = new Transformer("Optimus Prime","A",1,2,3,6,9,5,6,7);
		Transformer optimus2 = new Transformer("Bumblebee","A",5,2,3,3,4,5,3,7);
		Transformer optimus4 = new Transformer("Starblack","A",1,5,3,6,3,5,6,7);
		Transformer optimus5 = new Transformer("Inferno","A",7,2,6,3,6,9,1,7);
		transformers.add(optimus6);
		transformers.add(optimus5);
		transformers.add(optimus4);
		transformers.add(optimus3);
		transformers.add(optimus2);
		transformers.add(optimus9);
		transformers.add(optimus1);
		transformers.add(optimus);
		*/
		
		battle battle = new battle(transformers);
		battle.beginBattle();
	}

}
