public class OpcoesDeMoedas {
    public String escolha(int esc){
        switch (esc){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "USD";

            case 7:
                return "BRL";

            case 8:
                return "ARS";

            case 9:
                return "COP";

            case 10:
                return "EUR";

            case 11:
                return "RUB";

            case 12:
                return "JPY";
            default:
                throw new IllegalStateException("Unexpected value: " + esc);
        }
    }
}
