public class OlaMundo {
    /**
     * Constructor for objects of class OlaMundo
     */
    public static class OlaAlguem {
        public static String geraSaudacao(String nome) {
            return "Ola " + nome + "!";
        }
    }
    
    public static void main(String[] args) {
        String saudacao = OlaAlguem.geraSaudacao("Mundo");
        System.out.println(saudacao);
    }
}
