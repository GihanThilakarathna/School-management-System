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
 class User03 {
   
    
    private String staff_id01;
    private String reason01;
    private String date01;
    private String leavetype01;
    private String time01;
    

    
     public User03(String staff_id01,String reason01,String date01,String leavetype01,String time01)
     {
         
        this.staff_id01 = staff_id01;
        this.reason01 = reason01;
        this.date01 = date01;
        this.leavetype01 = leavetype01;
        this.time01 = time01;
        
     }
     
      public String getstaff_id01()
    {
        return staff_id01;
    }
    
    public String getreason01()
    {
        return reason01;
    }
    
    public String getdate01()
    {
        return date01;
    }
    
    public String getleavetype01()
    {
        return leavetype01;
    }
    
    public String gettime01()
    {
        return time01;
    }
    
  
    }
  

