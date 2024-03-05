// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Informe 3 valores:");
        
        
        int valor1;
        int valor2;
        int valor3;
        int total;
        
        
        Scanner leia = new Scanner(System.in);
        valor1 = leia.nextInt();
        
        valor2 = leia.nextInt();
        
        valor3 = leia.nextInt();
        
        total= valor1 + valor2 + valor3;
        System.out.println("O valor total sera:"+ total);
            
            
            
        
        
        
    }
}
