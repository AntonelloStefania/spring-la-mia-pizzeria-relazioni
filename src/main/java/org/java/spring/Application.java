package org.java.spring;

import org.java.spring.db.pojo.Ingredient;
import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.IngredientService;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private IngredientService ingredientService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Ingredient ing1 = new Ingredient("Mozzarella");
		Ingredient ing2 = new Ingredient("Salsa di pomodoro");
		Ingredient ing3 = new Ingredient("Funghi");
		Ingredient ing4 = new Ingredient("Peperoni");
		Ingredient ing5 = new Ingredient("Salame");
		Ingredient ing6 = new Ingredient("Prosciutto crudo");
		Ingredient ing7 = new Ingredient("Olive nere");
		Ingredient ing8 = new Ingredient("Basilico");
		Ingredient ing9 = new Ingredient("Peperoncino");
		Ingredient ing10 = new Ingredient("Gorgonzola");
		
		ingredientService.save(ing1);
		ingredientService.save(ing2);
		ingredientService.save(ing3);
		ingredientService.save(ing4);
		ingredientService.save(ing5);
		ingredientService.save(ing6);
		ingredientService.save(ing7);
		ingredientService.save(ing8);
		ingredientService.save(ing9);
		ingredientService.save(ing10);
		
		
		pizzaService.save(new Pizza("Margherita Classica", " Una pizza tradizionale con pomodoro, mozzarella fresca e basilico.", "https://primochef.it/wp-content/uploads/2019/08/SH_pizza_fatta_in_casa-1200x800.jpg", 8.50, ing1, ing2,ing9));
		pizzaService.save(new Pizza("Quattro Formaggi Special", "Una deliziosa combinazione di quattro formaggi: mozzarella, gorgonzola, fontina e parmigiano.", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/06/3234_Pizza.jpg?resize=895%2C616&ssl=1", 10.00, ing3,ing10,ing6,ing8));
		pizzaService.save(new Pizza("Pepperoni Piccanti", "Pizza con pomodoro, mozzarella e peperoni piccanti per un tocco di calore.", "https://wips.plug.it/cips/buonissimo.org/cms/2012/05/69630013_m.jpg", 9.50,ing5,ing4,ing10));
		pizzaService.save(new Pizza("Vegetariana Salutare", "Una pizza leggera e sana con pomodoro, mozzarella, funghi, peperoni, cipolla e olive.", "https://www.guardini.com/images/guardinispa/ricette/full/pizza_set_2021_full.jpg", 11.00,ing1,ing2,ing9,ing3,ing5));
		pizzaService.save(new Pizza("Prosciutto e Funghi", "Un classico con pomodoro, mozzarella, prosciutto cotto e funghi freschi.", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2019/10/4102_Pizza.jpg?resize=895%2C616&ssl=1", 9.75,ing2,ing9,ing5,ing7));
		pizzaService.save(new Pizza("Pizza al Pesto Genovese", " Uno strato di pesto genovese, mozzarella fresca, pomodori ciliegia e pinoli.", "https://staticcookist.akamaized.net/wp-content/uploads/sites/21/2023/08/pizza-al-pesto-still-life-ok-1200x675.jpg", 10.50,ing3,ing8,ing4));
		pizzaService.save(new Pizza("Mare e Monti", "Un mix di sapori di mare e terra con frutti di mare e prosciutto crudo.", "https://www.unmondodisapori.it/wp-content/uploads/2017/10/mariemonti.jpg", 12.00,ing1,ing10,ing5,ing3));
		pizzaService.save(new Pizza("Capricciosa Deluxe", " Una pizza ricca con pomodoro, mozzarella, prosciutto cotto, funghi, olive nere e carciofi.", "https://wips.plug.it/cips/buonissimo.org/cms/2019/04/pizza-capricciosa.jpg", 11.50,ing2,ing9,ing7,ing5,ing6,ing4));

		
	}

}
