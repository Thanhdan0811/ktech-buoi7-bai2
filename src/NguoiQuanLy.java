public class NguoiQuanLy extends  NhanVienAbstract{

    NguoiQuanLy(String name, float baseSalary, float bonus) {
        super(name, baseSalary, bonus);
        this.role = "Manager";
    }

    // ghi đè method tính tổng lương
    @Override
    float calculateTotalSalary() {
        return this.baseSalary + this.bonus;
    }

    @Override
    void displayInfo() {
        System.out.println(this.role + " Name: " + this.name);
        System.out.println("Base Salary: $" + String.format("%.1f", this.baseSalary));
        System.out.println("Bonus: $" + String.format("%.1f", this.bonus));
        System.out.println("Total Salary: $" + String.format("%.1f", this.calculateTotalSalary()));
    }

}
