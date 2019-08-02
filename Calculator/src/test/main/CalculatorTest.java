
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest
{
    @test
    void doitAdditionner()
    {
        Calculator addition = new Calculator();

        assertEquals(5, addition.additionner(3,2), "Ca ne doit pas être ça !" );
    }

    @test
    void doitSoustraire()
    {

        Calculator soustraire = new Calculator();
        assertEquals(3, soustraire.soustraire(5,2));

    }

    @test
    void doitMultiplier()
    {
        Calculator multiplication = new Calculator();
        assertEquals(25, multiplication.multiplier(5,5));
    }

    @test
    void doitDiviser()
    {

    }

    @test
    void doitLeverUneErreurSiLeDenominateurEstZero()
    {

    }

    @test
    void doitEleverAuCarre()
    {

    }

    @test
    void eleverAuCarreDoitEtreEquivalentAMultiplierUnNombreParLuiMeme()
    {

    }

}
