package com.genecric.enumtype;

public class EnumTest {

    public static void main(String[] args) {

      useConstantMethod(6);
      useEnumMethod(TransactionType.WITHDRAW);
    }


    private static void useConstantMethod(int i){
        if (i==TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is depositing .....");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdraw .....");

        } else if (i==TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is transfer .....");

        } else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is payment......");

        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println("money is other .....");

        }else {
            System.out.println("your Transaction is not valid .....");
        }
    }


    private static void useEnumMethod(TransactionType transactionType){
        if (transactionType==transactionType.DEPOSIT){
            System.out.println("Money is depositing .....");
        } else if (transactionType==transactionType.WITHDRAW) {
            System.out.println("Money is withdraw .....");

        } else if (transactionType==transactionType.TRANSFER) {
            System.out.println("Money is transfer .....");

        } else if (transactionType==transactionType.PAYMENT) {
            System.out.println("Money is payment......");

        } else if (transactionType==transactionType.OTHER) {
            System.out.println("money is other .....");

        }else {
            System.out.println("your Transaction is not valid .....");
        }

    }
}
