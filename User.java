/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

/**
 *
 * @author DuminduS
 */
class User {
    
    private String reg_number;
    private String full_name;
    private String gender;
    private String age;
    private String address;
    private String contact_no;
    private String email;
    private String reg_date;
    
    
    
    public User(String reg_number,String full_name,String gender,String age,String address,String contact_no,String email,String reg_date)
    {
        this.reg_number = reg_number;
        this.full_name = full_name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.contact_no = contact_no;
        this.email = email;
        this.reg_date = reg_date;
        
        
    }
    
    public String getreg_number()
    {
        return reg_number;
    }
    
    public String getfull_name()
    {
        return full_name;
    }
    
    public String getgender()
    {
        return gender;
    }
    
    public String getage()
    {
        return age;
    }
    
    public String getaddress()
    {
        return address;
    }
    
    public String getcontact_no()
    {
        return contact_no;
    }
    
    public String getemail()
    {
        return email;
    }
    
     public String getreg_date()
    {
        return reg_date;
    }
   
    
}
