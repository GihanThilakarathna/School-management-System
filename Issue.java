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
public class Issue {
     private String book_id;
    private String member_id;
    private String issue_date;
    private String receive_date;
    
     public Issue(String book_id,String member_id,String issue_date,String receive_date)
    {
        this.book_id = book_id;
        this.member_id = member_id;
        this.issue_date = issue_date; 
        this.receive_date = receive_date;  
    }
     
     public String getbook_id()
    {
        return book_id;
    }
    
    public String getmember_id()
    {
        return member_id;
    }
    
    public String getissue_date()
    {
        return issue_date;
    }
    
     public String getreceive_date()
    {
        return receive_date;
    }
}
