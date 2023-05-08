import java.util.Scanner;

public class segundaAtv {
    public  static void main(String[] args) {
Scanner input = new Scanner(System.in);
double num1,num2,soma,media;
System.out.println("Informe o primeiro número: ");  
num1 = input.nextDouble();  
System.out.println("Informe o segundo número: ");
num2 = input.nextDouble();
soma = num1 + num2;
media = soma/2;
System.out.println("A media dos numeros informados é de: " + media);
input.close();
}

    public double num1(double num1) {
        return num1;
    }

    public double num2(double num2) {
        return num2;
    }

    public double soma(double num1 , double num2) {
        return num1+num2;
    }

    public double media(double soma) {
        return soma/2;
    }

   
}