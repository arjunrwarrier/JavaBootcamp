package Constructor;

public class ConstructorGetSet {
   Integer rollNumber;
   Integer idNumber;

   //constructor parametarised

    public ConstructorGetSet(Integer rollNumber, Integer idNumber) {
        this.rollNumber = rollNumber;
        this.idNumber = idNumber;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }
}



class ConstructorMain{
    public static void main(String[] args) {
        ConstructorGetSet c1 = new ConstructorGetSet(1,234);
        System.out.println(c1.getIdNumber());
        System.out.println(c1.getRollNumber());

    }
}
