public class fibonacci {

    public static void main(String[] args) {
        int numero = 21;

        if (fibonacci(numero)) {
            System.out.println("O número " + numero + " está presente na sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não está presente na à sequência de Fibonacci!");
        }
    }

    public static boolean fibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int a = 0;
        int b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
    }

    /*
    OBS : para melhor entendimento e visualização
     do código, optei por colocar as funções dos metodos na mesma
     classe, em vez de outra classe.
     */