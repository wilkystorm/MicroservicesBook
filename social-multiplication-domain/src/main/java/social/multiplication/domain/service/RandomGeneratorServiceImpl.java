package social.multiplication.domain.service;

import java.util.Random;

public class RandomGeneratorServiceImpl implements RandomGeneratorService {

	static final int MINIMUM_FACTOR = 11;
	static final int MAXIMUM_FACTOR = 99;
	
	@Override
	public int generateRandomFactor() {
		return new Random().nextInt( (MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
	}

}
