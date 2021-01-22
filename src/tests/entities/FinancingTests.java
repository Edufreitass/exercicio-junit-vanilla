package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	void entryShouldReturnTwentyPercentOfTotalAmount() throws Exception {
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 20000.0;
		
		// Act
		double result = f.entry();
		
		// Assert
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	void quotaShouldReturnCorrectQuotaValue() throws Exception {
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;
		
		// Act
		double result = f.quota();
		
		// Assert
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	void constructorShouldSetValuesWhenValidData() throws Exception {
		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() throws Exception {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Financing f = new Financing(100000.0, 2000.0, 79);
		});
	}
	
	@Test
	void setTotalAmountShouldSetValueWhenValidData() throws Exception {
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// Act
		f.setTotalAmount(90000.0);

		// Assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() throws Exception {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	void setIncomeShouldSetValueWhenValidData() throws Exception {
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// Act
		f.setIncome(3000.0);

		// Assert
		Assertions.assertEquals(3000.0, f.getIncome());
	}
	
	@Test
	void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() throws Exception {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1500.0);
		});
	}
	
	@Test
	void setMonthsShouldSetValueWhenValidData() throws Exception {
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// Act
		f.setMonths(81);
		
		// Assert
		Assertions.assertEquals(81, f.getMonths());
	}
	
	@Test
	void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() throws Exception {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
}
