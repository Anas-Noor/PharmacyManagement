package Service;

public class FindMedicine {
    private String medicine_Name;

    public FindMedicine(String medicine_Name) {
        this.medicine_Name = medicine_Name;
    }


    @Override
    public String toString() {
        return "FindMedicine{" +
                "medicine_Name='" + medicine_Name + '\'' +
                '}';
    }

    public String getMedicine_Name() {
        return medicine_Name;
    }

    public void setMedicine_Name(String medicine_Name) {
        this.medicine_Name = medicine_Name;
    }
}
