public class LapTrinhVien extends  NhanVienAbstract{
    private int overtimeHour;
    private float hourRate;
    LapTrinhVien(String name, float baseSalary, float bonus) {
        super(name, baseSalary, bonus);
        this.role = "Programmer";
    }
    LapTrinhVien(String name, float baseSalary) {
        super(name, baseSalary);
        this.role = "Programmer";
    }

    // set thời gian làm ngoài giờ và tiền làm trong 1 giờ
    public void setOvertimeAndRateHours(int overTimeHour, float hourRate) {
        if(overTimeHour < 0 || hourRate < 0) System.out.println("Nhập sai , số không nhỏ hơn 0");
        this.setOvertimeHour(overTimeHour);
        this.setHourRate(hourRate);
    }



    // ghi đè method tính tổng lương
    @Override
    float calculateTotalSalary() {
        return this.baseSalary + (this.getHourRate() * this.getOvertimeHour());
    }

    // ghi đè method show info.
    @Override
    void displayInfo() {
        System.out.println(this.role + " Name: " + this.name);
        System.out.println("Base Salary: $" + String.format("%.1f", this.baseSalary));
        System.out.println("Overtime Hours: " + this.getOvertimeHour());
        System.out.println("Hourly Rate: $" + String.format("%.1f", this.getHourRate()));
        System.out.println("Total Salary: $" + String.format("%.1f", this.calculateTotalSalary()));
    }


    public float getHourRate() {
        return hourRate;
    }

    public void setHourRate(float hourRate) {
        this.hourRate = hourRate;
    }

    public int getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(int overtimeHour) {
        this.overtimeHour = overtimeHour;
    }
}
