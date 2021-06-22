
package atividadelogica04;

/**
 * @author odavi
 */
public class AtividadeLogica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, acSoma;
        cont = 10; acSoma = 0;
        
        while(cont >= 3){
            System.out.println(cont);
            acSoma += cont;
            cont--;
        }//fim do loop
        System.out.println("Soma: "+acSoma);
    }
    
}
