public class Calculator implements ICalculator
{
    @Override
    public int additionner(int nb1, int nb2) {
        return nb1 + nb2;
    }

    @Override
    public int soustraire(int nb1, int nb2) {
        return nb1 - nb2;
    }

    @Override
    public double diviser(int nb1, int nb2)

    {
        try
        {
            return nb1/nb2;
        }
        catch (Exception e)
        {

        }


    }

    @Override
    public int carre(int nb1)
    {
        int nb2 = nb1;
        return nb1*nb2;
    }

    @Override
    public int multiplier(int nb1, int nb2) {
        return nb1 * nb2;
    }
}
