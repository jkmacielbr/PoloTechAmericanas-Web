package br.ada.americanas.helloworldservlet.operation;

import java.math.BigDecimal;

public class subtractionOperation implements Operation{

    private BigDecimal first;
    private BigDecimal second;
    private BigDecimal result;


    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        this.first = first;
        this.second = second;
        return result = first.subtract(second);
    }

    @Override
    public String operationMath() {
        return "-";
    }

    @Override
    public String toString() {
        return "divOperation{" +
                "first=" + first +
                ", second=" + second +
                ", result=" + result +
                '}';
    }

}
