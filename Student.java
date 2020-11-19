public class Student extends Person {
    
    private String sexuality;
    
    public Student(){
 
    }
    public Student(String id1,String name1,String phone1,String email1,String sexuality1){
        super(id1,name1,phone1,email1);
        setSexuality(sexuality1);
    }
    
 
 
    public void setSexuality(String newSexuality){
        this.sexuality = newSexuality;
    }
    public String getSexuality(){
        return this.sexuality;
    }
 
    public String showinfo(){
        return  "1.[Student] Id:" + getId() + "  2.Name: " + getName() + "  3.Phone:" + getPhone() + "  4.Email:" + getEmail() + "  5.Sexuality:" +getSexuality();
    }
}