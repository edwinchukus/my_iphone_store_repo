package com.bankaccount;

/**
 * Created by dannyolu on 07/11/2016.
 */
public class AccountDetails {

             String acountName = "Jonny Talk";
             String acoountHolderAddress = "231 old street,London";
             Long accountHolderPhoneNumber = 0774141L;
             String accountType = "personal account";
             Double minimumBalance = 200.00;
             Double maximumBalance = 500.00;
             boolean accountActive = false;



            public void withDrawMoney (){
//              if (minimumBalance  >= 200.00)


              System.out.println(" customer can withdraw money");
          }



            public void  payMoneys (){
               System.out.println("Via online Banking");
           }

            public void payBills (){
                System.out.println("Gas bill");
            }

            public void changeDetails (){
                System.out.println("New address" + 123);
    }


    }


