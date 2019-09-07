package DAL.DAO;

public class User {
    
    private String name;
    private String email;
    private String password;
    private String contactNo;
    private String address;
    private String nationality;
    private String passportNo;
    private String userName;

  /*  public User(String name, String email, String password, String contactNo, String address, String nationality, String passportNo, String userName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
        this.address = address;
        this.nationality = nationality;
        this.passportNo = passportNo;
        this.userName = userName;
    }

   
    */
    
   public User(){
       
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the passportNo
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * @param passportNo the passportNo to set
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getUserName() {
        return userName;
    }
    
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
