package hw_first_five.company.professions;

public class Driver {
    String FIO;
    String experience;
    public Driver(String FIO, String experience) {
        this.FIO = FIO;
        this.experience = experience;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }


}
