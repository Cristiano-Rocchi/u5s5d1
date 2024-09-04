package cristianorocchi.u5s5d1.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OrdineConfig {

    private static final Logger logger = LoggerFactory.getLogger(OrdineConfig.class);

    @Value("${costo.coperto}")
    private double costoCoperto;


    @Bean
    public Tavolo tavoloOrdine() {
        return new Tavolo(1, 4);
    }


    @Bean
    public ElementoMenu pizzaMargheritaOrdine() {
        return new ElementoMenu("Pizza Margherita", 4.99);
    }

    @Bean
    public ElementoMenu lemonadeOrdine() { 
        return new ElementoMenu("Lemonade", 1.29);
    }


    @Bean
    public Ordine ordine() {
        return new Ordine(1, tavoloOrdine(), Arrays.asList(pizzaMargheritaOrdine(), lemonadeOrdine()), Ordine.StatoOrdine.IN_CORSO, 2, costoCoperto);
    }


    @Bean
    public CommandLineRunner runner() {
        return args -> {
            Ordine ordine = ordine();
            logger.info("\nOrdine Creato: \nNumero Ordine: {}, Tavolo: {}, Stato: {}, Importo Totale: {}",
                    ordine.getNumeroOrdine(),
                    ordine.getTavolo().getNumero(),
                    ordine.getStato(),
                    ordine.getImportoTotale());
        };
    }
}
