public class Staff extends Person{
    
    private String height;
    
    public Staff(){
 
    }
    public Staff(String id1,String name1,String phone1,String email1,String height1){
        super(id1,name1,phone1,email1);
        setHeight(height1);
    }
    
 
 
    public void setHeight(String newHeight){
        this.height = newHeight;
    }
    public String getHeight(){
        return this.height;
    }
 
    public String showinfo(){
        return "1.[Teacher] Id:" + getId() + "  2.Name: " + getName() + "  3.Phone:" + getPhone() +"  4.Email:" +getEmail() + "  5.Height:" + getHeight() ;
    }
}