import java.io.IOException;

public interface ICalculator
{
    int additionner(int nb1, int nb2);
    int soustraire (int nb1, int nb2);
    double diviser(int nb1, int nb2) throws IOException;
    int carre(int nb1);
    int multiplier(int nb1, int nb2);
}