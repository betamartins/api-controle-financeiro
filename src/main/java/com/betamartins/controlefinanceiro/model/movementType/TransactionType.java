package com.betamartins.controlefinanceiro.model.movementType;

public enum TransactionType {
    EXPENSE(0, "Expense"),
    EARNING(1, "Earning");

    private Integer id;
    private String transactionDescription;

    TransactionType(Integer id, String transactionDescription){
        this.id = id;
        this.transactionDescription = transactionDescription;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTransactionDescription() {
        return this.transactionDescription;
    }
}
