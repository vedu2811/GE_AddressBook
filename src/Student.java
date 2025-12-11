public class Student {
    private String name;
    private String department;
    private Integer roll;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String dept){
        this.department=dept;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setRoll(Integer roll) {
        this.roll = roll;
    }
    public Integer getRoll(){
        return this.roll;
    }

}
