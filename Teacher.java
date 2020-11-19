public class Teacher extends Person{
    
    private String age;
    
    public Teacher(){
 
    }
    public Teacher(String id1,String name1,String phone1,String email1,String age1){
        super(id1,name1,phone1,email1);
        setAge(age1);
    }
    
 
 
    public void setAge(String newAge){
        this.age = newAge;
    }
    public String getAge(){
        return this.age;
    }
 
    public String showinfo(){
        return "1.[Teacher] Id:" + getId() + "  2.Name: " + getName() + "  3.Phone:" + getPhone() +"  4.Email:" +getEmail() + "  5.Age:" + getAge() ;
    }
}