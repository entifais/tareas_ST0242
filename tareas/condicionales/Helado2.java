import java.util.Scanner;
class Helado2{
    public static void main(String[] args){
        int temperaturaLimite = 27;
        Scanner input = new Scanner(System.in);
        int temperaturaActual = input.nextInt();
        int edad = input.nextInt();
        if (temperaturaActual > temperaturaLimite && edad > 18){
            System.out.println("Comprar helado cerveza");
        }
        else{
            System.out.println("Lo sentimos juventud");
        }
    }
}
