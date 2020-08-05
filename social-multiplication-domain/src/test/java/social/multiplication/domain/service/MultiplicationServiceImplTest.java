package social.multiplication.domain.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import social.multiplication.domain.Multiplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {
	
	@Mock
	private RandomGeneratorService randomGeneratorService;
	
	private MultiplicationService multiplicationService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		multiplicationService = new MultiplicationServiceImpl(randomGeneratorService);
	}
	
	@Test
	public void createRandomMultiplicationTest() {
		
		// given first 50 then 30
		given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);
		
		// when
		Multiplication multiplication = multiplicationService.createRandomMultiplication();
		
		// then 
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
		
	}

}
