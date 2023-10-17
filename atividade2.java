import java.util.Scanner;
    public class atividade2 {

        public static void main(String[] args) throws Exception{

            Scanner in = new Scanner(System.in);

            System.out.print("Digite o valor do comprimento:");
            double comprimento = in.nextDouble();
            System.out.print("Digite o valor da largura/base maior:");
            double largura = in.nextDouble();
            System.out.print("Digite o valor do raio/base menor:");
            double raio = in.nextDouble();


            double triangulo = ((comprimento * largura)/2);
            double circulo = (raio * raio) * 3.14;
            double trapezio = ((largura + raio ) * comprimento)/2;
            double quadrado = (comprimento * largura);
            double retangulo = (comprimento * largura);


            System.out.println("A área do triângulo é equivalente a: " + triangulo);
            System.out.println("A área do círculo é equivalente a: " + circulo);
            System.out.println("A área do trapézio é equivalente a:" + trapezio);
            System.out.println("A área do quadrado é equivalente a: " + quadrado);
            System.out.println("A área do retâgulo é equivalente a: " + retangulo);
        
            in.close();

        }
}