package bt15.modal;

public class Student {
    private int id;
    private String name;
    private double diemTrungBinh;

    public Student() {
    }

    public Student(int id, String name, double diemTrungBinh) {
        this.id = id;
        this.name = name;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Điểm trung bình: " + diemTrungBinh;
    }
}
