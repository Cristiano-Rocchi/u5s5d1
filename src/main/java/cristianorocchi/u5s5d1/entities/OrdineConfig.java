package cristianorocchi.u5s5d1.entities;

import cristianorocchi.u5s5d1.entities.ElementoMenu;
import cristianorocchi.u5s5d1.entities.Menu;
import cristianorocchi.u5s5d1.entities.Ordine;
import cristianorocchi.u5s5d1.entities.Tavolo;
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
    public CommandLineRunner runner(Menu menu) {
        return args -> {
            Tavolo tavolo = new Tavolo(1, 4);


            ElementoMenu pizzaMargherita = new ElementoMenu("Pizza Margherita", 4.99);
            ElementoMenu lemonade = new ElementoMenu("Lemonade", 1.29);


            Ordine ordine = new Ordine(1, tavolo, Arrays.asList(pizzaMargherita, lemonade), Ordine.StatoOrdine.IN_CORSO, 2, costoCoperto);

            logger.info("\nOrdine Creato: \nNumero Ordine: {}, Tavolo: {}, Stato: {}, Importo Totale: {}",
                    ordine.getNumeroOrdine(),
                    ordine.getTavolo().getNumero(),
                    ordine.getStato(),
                    ordine.getImportoTotale());
        };
    }
}


