package com.bqstaff;

/**
 * Created by dannyolu on 10/11/2016.
 */
public class StaffOutput {

         int staffNamesCharacters = 10;
         int    staffAge   = 45;
         double staffSalary = 2000.00;
         int    companyPhoneNo = 131362666;
         char   companyRating = 'A';
         long   companyProfit = 200000000l;
         String companyAddress = "102 Oxford Street";
         String staffBonus      = "5%";


        public void listStaffNamesCharacters(){
            if(staffNamesCharacters <= 10)
                System.out.println("Staffs names should print out");
              else
                System.out.println("Staffs names should print out");

        }

        public void CountStaffAge() {
            for(int staffAge = 0; staffAge < 45; staffAge ++)
               System.out.println("Document staff age equal to or less than 45");
//            staffOutput = staffOutput + 1;
//            if(staffAge <= 45 )
//                System.out.println("Document staff age equal to or less than 45");
    }

        public void companyRatingByPublic() {
            if(companyRating == 'A' )
               System.out.println(" Best company in UK by Evening Standard");
            else
               System.out.println("5th company best company in the chart list");
    }

}
