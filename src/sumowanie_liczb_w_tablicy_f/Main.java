package sumowanie_liczb_w_tablicy_f;

public class Main {
    public static void main(String[] args)
    {
        int n = 100, i, suma = 0;
        int [] dane = new int[n];

        System.out.println("\nProgram sumuje liczby z przedziału od 1 do 100 znajdujące się w tablicy jednowymiarowej \n");

        for(i = 1; i <= dane.length; i++)
        {
            dane[i - 1] = i; //wisanie do tablicy dane liczb 1 do 100
        }
        for (int x : dane) //rozszerzona petla for
        {
            suma += x; //sumowanie liczb o d 1 do 100 znajdujace sie w tablicy
        }

        System.out.println("suma liczb od 1 do 100 wynosi: " + suma + ".");
    }
}
