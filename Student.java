import java.util.Scanner;
public class Student {
    String name, id, group, email;
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
        this.group = "K62CB";
    }
    public Student(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }
    public Student(Student s){
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getGroup(){
        return  group;
    }
    public String getEmail(){
        return  email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getInfo(){
        return getName() + " - " + getId() + " - " + getGroup() + " - " +getEmail() ;
    }
}

