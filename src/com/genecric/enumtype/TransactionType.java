package com.genecric.enumtype;

public enum TransactionType {
     DEPOSIT(4),
     WITHDRAW(5),
     TRANSFER(10),
     PAYMENT(15),
     OTHER(100);


     private  final int  transactionCode;
  private   TransactionType(int code ) {
      this.transactionCode=code;

    }

    public int getTransactionCode() {
        return transactionCode;
    }
}
