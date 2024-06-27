public class Main {
    public static void main(String[] args) {

        NguoiQuanLy ngQL = new NguoiQuanLy("Corona Cadogan", 6000, 1000);
        LapTrinhVien lapTV = new LapTrinhVien("Antal Nuka", 5000);
        lapTV.setOvertimeAndRateHours(20, 25);

        ngQL.displayInfo();
        System.out.println();
        lapTV.displayInfo();
    }
}