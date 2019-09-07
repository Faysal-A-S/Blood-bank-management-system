package BLL;

import DAL.DAO.Donor;
import UI.DisplayDetails;
import java.util.ArrayList;
import java.util.List;


public class DonorManager {
  public static  List<Donor> donorList = new ArrayList<Donor>();
    public boolean saveDonor(Donor aDonor){
        donorList.add(aDonor);
        return true;
    }
    public List<Donor> displayDonor(){
        /*
        for(Donor showDonor:DonorList){
            System.out.println("Name: "+showDonor.getName());
            System.out.println("Blood Group: "+showDonor.getBloodGroup());
            System.out.println("Contact Number: "+showDonor.getContactNo());
            System.out.println("Address: "+showDonor.getAddress());
        }    
        */
        return donorList;
    }

}