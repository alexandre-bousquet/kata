package Q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PopulationTest {
    private Base.Population population;
    private Population nouvellePopulation;

    @Before
    public void init() {
        this.population = new Base.Population();
        this.nouvellePopulation = new Population();
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