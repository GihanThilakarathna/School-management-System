package staffff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Members {
    private String member_id;
    private String member_name;
    private String class1;
    
    public Members(String member_id,String member_name,String class1)
    {
        this.member_id = member_id;
        this.member_name = member_name;
        this.class1 = class1; 
    }
    
     public String getmember_id()
    {
        return member_id;
    }
    
    public String getmember_name()
    {
        return member_name;
    }
    
    public String getclass1()
    {
        return class1;
    }
}