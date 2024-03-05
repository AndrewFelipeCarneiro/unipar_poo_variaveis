// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Informe 4 notas para ser feito a media entre elas:");
        
        
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int total;
        
        
        Scanner leia = new Scanner(System.in);
        valor1 = leia.nextInt();
        valor2 = leia.nextInt();
        valor3 = leia.nextInt();
        valor4 = leia.nextInt();
        
        total= valor1 + valor2 + valor3 + valor4;
        total= total / 4;
        System.out.println("A media sera:"+ total);
            
            
            
        
        
        
    }
}
