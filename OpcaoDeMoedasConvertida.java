public class OpcaoDeMoedasConvertida extends OpcoesDeMoedas{
    @Override
    public String escolha(int esc){
        switch (esc){
            case 1:
                return "BRL";

            case 2:
                return "ARS";

            case 3:
                return "COP";

            case 4:
                return "EUR";
            case 5:
                return "RUB";
            case 6:
                return "JPY";
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return "USD";
            default:
                throw new IllegalStateException("Unexpected value: " + esc);
        }
    }
}
