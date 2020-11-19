public class Person {
    
    private String id , name , phone, email ;
    
    public Person(){
 
    }
    public Person(String id1,String name1,String phone1,String email1){
        setId(id1);
        setName(name1);
        setPhone(phone1);
        setEmail(email1);
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
 
    public void setId(String newId){
        this.id = newId;
    }
    public String getId(){
        return this.id;
    }
 
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }
    public String getPhone(){
        return this.phone;
    }
 
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String getEmail(){
        return this.email;
    }
 
 
    public String showinfo(){
        return  getId() + ", " + getName() + ", "+ getPhone() + ", " + getEmail()   ;
    }
}