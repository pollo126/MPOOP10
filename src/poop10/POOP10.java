
package poop10;

public class POOP10 {
    
    public static double dividir (double x, double y) throws ArithmeticException {
        return x/y;
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 2;
        double c = a/b;
        
        System.out.println("Resultado de a/b: " + c);
        
        int[] arreglo = new int[5];

        try {
            for (int i = 0; i < 10; i++) {
                arreglo[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            x.printStackTrace();
            System.out.println("Error: indice fuera de rango");
        }
        for (int i = 0; i < 5; i++) {
            arreglo[i] = i;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento [" + i + "]: " + arreglo[i]);
        }
        double x = 5;
        double y = 0;
        
        try {
            double w = dividir(x,y);
            System.out.println("Resultado de x/y: " + w);
        } catch (ArithmeticException e) {
             System.out.println("Error: División por cero no permitida.");
             e.printStackTrace();
        }
        
        Cuenta cuenta1 = new Cuenta();
        
        try {
            cuenta1.depositarSaldo(1000); 
            cuenta1.depositarSaldo(25000); 
            cuenta1.consultarSaldo();
            
         //retiro prueba
            cuenta1.retirarSaldo(100); 
            cuenta1.retirarSaldo(100);  
            cuenta1.retirarSaldo(100);  
            cuenta1.retirarSaldo(100);  //LimiteDeRetirosException
        } catch (SaldoInsuficienteException e) {
            System.out.println("\n--- Capturada Saldo Insuficiente ---");
            e.printStackTrace();
        } catch (TopeDeDepositoException e) {
            System.out.println("\n--- Capturada Tope de Depósito ---");
            e.printStackTrace();
        } catch (LimiteDeRetirosException e) {
            System.out.println("\n--- Capturada Límite de Retiros ---");
            e.printStackTrace();
        }
    }
}