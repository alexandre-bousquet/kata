import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Population2Test {
    private Population population;
    private Population2 nouvellePopulation;

    @Before
    public void init() {
        this.population = new Population();
        this.nouvellePopulation = new Population2();
    }

    @Test
    public void evolution() {
        for (int i = 0; i < 10000; i++) {
            this.population.evolution();
            this.nouvellePopulation.evolution();
            assertEquals(this.population.toString(), this.nouvellePopulation.toString());
        }
    }
}