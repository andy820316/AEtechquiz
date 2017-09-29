package transformer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TransformerBattle {

	public static void main(String[] args) {
		ArrayList<Transformer> transformers = new ArrayList<Transformer>();
		//name, fraction, str, int, spd, endur, rank, courage,firepower,skill
		/*Sample Data
		Transformer optimus = new Transformer("PredaKing","D",1,2,3,3,1,6,6,7);
		Transformer optimus9 = new Transformer("Rhinox","D",9,2,3,3,4,4,3,7);
		Transformer optimus3 = new Transformer("Freezer","D",5,2,9,3,4,5,3,10);
		Transformer optimus6 = new Transformer("Coolblaze","D",1,2,3,3,5,5,16,7);
		Transformer optimus1 = new Transformer("Optimus Prime","A",1,2,3,6,9,5,6,7);
		Transformer optimus2 = new Transformer("Bumblebee","A",5,2,3,3,4,5,3,1);
		Transformer optimus4 = new Transformer("Starfire","A",1,5,3,6,3,5,6,7);
		Transformer optimus5 = new Transformer("Inferno","A",8,2,6,3,6,9,1,7);
		transformers.add(optimus6);
		transformers.add(optimus5);
		transformers.add(optimus4);
		transformers.add(optimus3);
		transformers.add(optimus2);
		transformers.add(optimus9);
		transformers.add(optimus1);
		transformers.add(optimus);
		*/
		String csvFile = "pathfile";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] input = line.split(cvsSplitBy);

                transformers.add(new Transformer(input[0],input[1],Integer.parseInt(input[2]),
                		Integer.parseInt(input[3]),Integer.parseInt(input[4]),Integer.parseInt(input[5]),
                		Integer.parseInt(input[6]), Integer.parseInt(input[7]), Integer.parseInt(input[8]), Integer.parseInt(input[9])));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
		} finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
		
		battle battle = new battle(transformers);
		battle.beginBattle();
	}

}
