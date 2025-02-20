// Reglas de FizzBuzz:
// Imprime "Fizz" si el número es divisible por 3.
// Imprime "Buzz" si el número es divisible por 5.
// Imprime "FizzBuzz" si el número es divisible por ambos (3 y 5).
// Si no es divisible por ninguno, imprime el número.

class Main
{
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
                         
            System.out.println((i % 3 == 0 && i % 5 == 0  )? "fizzbuzz" :(i % 3 == 0 )? "fizz" :(i % 5 == 0 )? "buzz":i);
 
        }
    }
}