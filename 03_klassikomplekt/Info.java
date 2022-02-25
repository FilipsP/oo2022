public class Info {
    String model;
    String processor;
    String graphics;
    int ram;
    int hdd;


    @Override
    public String toString() {
        return "Info{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
