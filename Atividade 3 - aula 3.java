// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Informe 2 notas para ser feito a media entre elas:");
        
        
        int valor1;
        int valor2;
        
        int total;
        
        
        Scanner leia = new Scanner(System.in);
        valor1 = leia.nextInt();
        
        valor2 = leia.nextInt();
        
        
        
        total= valor1 + valor2;
        total= total / 2;
        System.out.println("A media sera:"+ total);
            
            
            
        
        
        
    }
}
