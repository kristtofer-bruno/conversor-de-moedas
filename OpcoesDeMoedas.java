public class OpcoesDeMoedas {
    public String escolha(int esc){
        switch (esc){
            case 1:
                return "USD";

            case 2:
                return "USD";

            case 3:
                return "USD";

            case 4:
                return "BRL";

            case 5:
                return "ARS";

            case 6:
                return "COP";
            default:
                throw new IllegalStateException("Unexpected value: " + esc);
        }
    }
}
