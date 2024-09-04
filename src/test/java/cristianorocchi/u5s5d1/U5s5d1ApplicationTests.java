package cristianorocchi.u5s5d1;

import cristianorocchi.u5s5d1.entities.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class U5s5d1ApplicationTests {

	@Autowired
	private Menu menu;

	@Test
	void contextLoads() {
	}

	@Test
	public void testNumeroPizzeNelMenu() {
		List<Pizza> pizze = menu.getPizze();
		Assertions.assertEquals(3, pizze.size(), "Il menu dovrebbe contenere 3 pizze.");
	}

	@Test
	public void testBevandaPresenteNelMenu() {
		List<Bevanda> bevande = menu.getBevande();
		boolean lemonadePresente = bevande.stream().anyMatch(bevanda -> bevanda.getNome().equals("Lemonade"));
		Assertions.assertTrue(lemonadePresente, "La Lemonade dovrebbe essere presente nel menu.");
	}

	@Test
	public void testPrezzoPizzaMargherita() {
		Pizza margherita = menu.getPizze().stream()
				.filter(pizza -> pizza.getNome().equals("MargheritaPizza"))
				.findFirst()
				.orElse(null);
		Assertions.assertNotNull(margherita, "La pizza Margherita dovrebbe essere presente nel menu.");
		Assertions.assertEquals(4.99, margherita.getPrezzo(), 0.01, "Il prezzo della pizza Margherita dovrebbe essere 4.99.");
	}

	@ParameterizedTest
	@CsvSource({
			"Cheese, 92",
			"Ham, 35",
			"Onions, 22",
			"Pineapple, 24",
			"Salami, 86"
	})
	public void testCalorieTopping(String nomeTopping, int calorieAttese) {
		Topping topping = menu.getToppings().stream()
				.filter(t -> t.getNome().equals(nomeTopping))
				.findFirst()
				.orElse(null);
		Assertions.assertNotNull(topping, "Il topping " + nomeTopping + " dovrebbe essere presente nel menu.");
		Assertions.assertEquals(calorieAttese, topping.getCalorie(), "Il numero di calorie per " + nomeTopping + " dovrebbe essere " + calorieAttese + ".");
	}


}
