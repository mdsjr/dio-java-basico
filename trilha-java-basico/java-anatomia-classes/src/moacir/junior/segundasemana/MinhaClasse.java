package moacir.junior.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        
        String primeiroNome = "Moacir";
        String segundoNome = "Domingos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
        
    }
    
}