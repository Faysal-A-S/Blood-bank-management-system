package BLL;

import DAL.DAO.User;
import UI.DisplayDetails;
import java.util.ArrayList;
import java.util.List;


public class UserManager {
   public static List<User> userList = new ArrayList<User>();
   
    public boolean saveUser(User aUser){
        userList.add(aUser);
        return true;
    }
    public List<User> displayUser(){
        /*for(Customer showCustomer:customerList){
            System.out.println("Name: "+showCustomer.getName());
            System.out.println("E-Mail: "+showCustomer.getEmail());
            System.out.println("Password: "+showCustomer.getPassword());
            System.out.println("Address: "+showCustomer.getAddress());
            System.out.println("Nationality: "+showCustomer.getNationality());
            System.out.println("Contact Number: "+showCustomer.getContactNo());
            System.out.println("Passport Number: "+showCustomer.getPassportNo());
        }*/
        return userList;
    }
}
