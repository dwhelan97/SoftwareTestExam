package CompanyEmployee;

public class Employee {
    String Name;
    String PPS;
    String Number;
    String EmpType;
    int Age;


    public Employee(String name,
                    String PPS ,String number, String empType, int age) {
        Name = name;
        this.PPS = PPS;
        Number = number;
        //EmpType = empType;
        Age = age;
        if(Name == "" ||Name.length()<3){
            throw new IllegalArgumentException("Error Invalid Name");
        }
        else if(PPS.length()<8||PPS.length()>10){
            throw new IllegalArgumentException("Error Invalid PPS Number");
        }
        else if(number.length()<9|| number.length()>10){
            throw new IllegalArgumentException("Error Invalid Phone Number");
        }
//        else if(EmpType.equalsIgnoreCase("Full-time")){
//           throw new IllegalArgumentException("Error Invalid Employment");
//        }
//        else if(EmpType != "Part-time"){
//            throw new IllegalArgumentException("Error Invalid Employment");
//        }
        else if(Age<16){
            throw new IllegalArgumentException("Error Too Young");
        }
        else {
            System.out.println("Successfully passed Criteria");
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        this.PPS = PPS;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public String getEmpType() {
        return EmpType;
    }

    public void setEmpType(String empType) {
        EmpType = empType;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public String toString(){
        return Name +PPS+Number;
    }
}
