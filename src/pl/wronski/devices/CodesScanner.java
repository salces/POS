package pl.wronski.devices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.wronski.model.BarCode;

public class CodesScanner {

	private List<BarCode> exampleCodeBars = new ArrayList<>();
	private Random rand = new Random();

	public CodesScanner() {
		prepareExampleCodeBars();
	}

	public BarCode scan() {
		int randomIndex = rand.nextInt(exampleCodeBars.size());
		BarCode randomCodeBar = exampleCodeBars.get(randomIndex);
		return randomCodeBar;
	}

	private void prepareExampleCodeBars() {
		for (int i = 0; i < 10; i++) {
			exampleCodeBars.add(new BarCode(i));
		}
		exampleCodeBars.add(null);
		exampleCodeBars.add(null);
	}
}
