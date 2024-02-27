// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        String nome;
        String sobrenome;
        int idade;
        
        
        Scanner leia = new Scanner(System.in);
       
       
        System.out.println("Escreva Seu Nome");
        
        nome = leia.next();
        sobrenome = leia.nextLine();
        // NextLine pega a informacao da linha inteira enquanto Next pega somente uma palavra
        idade = leia.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        
        
    }
}
