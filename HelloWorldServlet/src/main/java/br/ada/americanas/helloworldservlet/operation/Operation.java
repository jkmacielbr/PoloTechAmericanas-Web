package br.ada.americanas.helloworldservlet.operation;

import java.math.BigDecimal;

public interface Operation {

    BigDecimal execute (BigDecimal first, BigDecimal second);

    String operationMath();








}
