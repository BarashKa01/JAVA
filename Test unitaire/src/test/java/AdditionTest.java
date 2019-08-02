import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest
{
    @Test
    public void doitAdditionnerDeuxNombres()
    {
        Addition addition = new Addition(3,2);
        assertEquals(4, addition.getResultat(), "L'addition de 3 et 2 doit donner 4");
    }
}
