package com.example.Addnumbers;

		import com.example.addSample.add;
		import com.example.addSample.addController;
		import org.junit.jupiter.api.Test;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.junit.jupiter.api.Assertions;
		import org.junit.jupiter.api.Test;


@SpringBootTest
class AddnumbersApplicationTests {

	@Test
	public void testAddition() {
		int a = 5;
		int b = 7;
		int expected = 12;
		add model = new add(a,b);
		addController addObject = new addController();
		int result = addObject.add(model);
		Assertions.assertEquals(expected, result);
	}
}

