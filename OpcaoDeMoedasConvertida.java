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
                return "USD";

            case 5:
                return "USD";

            case 6:
                return "USD";
            default:
                throw new IllegalStateException("Unexpected value: " + esc);
        }
    }
}
