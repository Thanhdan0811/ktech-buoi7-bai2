abstract class NhanVienAbstract {
    String name;
    String role;
    float baseSalary;
    float bonus;

    NhanVienAbstract(String name, float baseSalary, float bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    NhanVienAbstract(String name, float baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }


    float calculateTotalSalary() {
        return this.baseSalary + this.bonus;
    }
    void displayInfo() {
        System.out.println(this.role + " Name: " + this.name);
        System.out.println("Base Salary: $" + String.format("%.1f", this.baseSalary));
        System.out.println("Bonus: $" + String.format("%.1f", this.bonus));
        System.out.println("Total Salary: $" + String.format("%.1f", this.calculateTotalSalary()));
    }

}
