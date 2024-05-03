public class formatadorCep {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23760649");
        } catch (cepInvalidoExcepicion e) {

            System.out.println("Cep inválido.");
        }
    }

    static String formatarCep(String cep) throws cepInvalidoExcepicion {

        if (cep.length() != 8)
            throw new cepInvalidoExcepicion();

        // simulando um cep formatado
        return "23.765-064";
    }
}
