public class Data {
    private String mataKuliah, tugas, deadline;

    public Data(String mataKuliah, String tugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getTugas() {
        return tugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + mataKuliah + ", tugas = " + tugas + ", deadline = " + deadline;
    }

}