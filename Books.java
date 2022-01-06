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
public class Books {
    private String book_id;
    private String author;
    private String book_name;
    private String catagory;
    
    public Books(String book_id,String author,String book_name,String catagory)
    {
        this.book_id = book_id;
        this.author = author;
        this.book_name = book_name;
        this.catagory = catagory;   
    }
    
     public String getbook_id()
    {
        return book_id;
    }
    
    public String getauthor()
    {
        return author;
    }
    
    public String getbook_name()
    {
        return book_name;
    }
    
    public String getcatagory()
    {
        return catagory;
    }
    
}

