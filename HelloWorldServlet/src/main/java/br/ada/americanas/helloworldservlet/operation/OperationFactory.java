package br.ada.americanas.helloworldservlet.operation;

public class OperationFactory {

    public static Operation create(String symbolMath) {
        Operation operation;
        switch (symbolMath) {
            case "+" -> {
                operation = new sumOperation();
                break;
            }
            case "-" -> {
                operation = new subtractionOperation();
                break;
            }
            case "*" -> {
                operation = new multiplicationOperation();
                break;
            }
            case "/" -> {
                operation = new divOperation();
                break;
            }
            default -> throw new RuntimeException("Operação não permitida");
        }
        return operation;
    }


}
