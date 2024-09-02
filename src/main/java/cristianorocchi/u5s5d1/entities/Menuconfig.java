package cristianorocchi.u5s5d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MenuConfig {

    @Bean
    public Topping cheese(){
        return new Topping("Cheese",92,0.69);
    }

    @Bean
    public Topping Ham(){
        return new Topping("Ham",35,0.99);
    }

    @Bean
    public Topping Onions(){
        return new Topping("Onions",22,0.69);
    }

    @Bean
    public Topping Pineapple(){
        return new Topping("Pineapple",24,0.79);
    }

    @Bean
    public Topping Salami(){
        return new Topping("Salami",86,0.99);
    }

    @Bean
    public Bevanda lemonade(){
        return new Bevanda("Lemonade","0,33l",128,1.29);
    }

    @Bean
    public Bevanda water(){
        return new Bevanda("Water","0,5l",0,1.29);
    }

    @Bean
    public Bevanda wine(){
        return new Bevanda("Wine","0,75l , 13%",607,7.49);
    }

    @Bean
    public Pizza salamiPizza(){
        return new Pizza("Salami Pizza", Arrays.asList("tomato","cheese"),Arrays.asList(Salami()),1160,5.99);
    }

    @Bean
    public Pizza hawaiian(){
        return new Pizza("Hawaiian Pizza", Arrays.asList("tomato","cheese"),Arrays.asList(Ham(),Pineapple()),1024,6.49);
    }

    @Bean
    public Pizza margherita(){
        return new Pizza("MargheritaPizza", Arrays.asList("tomato","cheese"),Arrays.asList(),1104,4.99);
    }

    @Bean
    public Menu menu(){
        return new Menu(
                Arrays.asList(salamiPizza(),margherita(),hawaiian()),
                Arrays.asList(cheese(),Ham(),Pineapple(),Onions()),
                Arrays.asList(lemonade(),water(),wine())
        );
    }
}