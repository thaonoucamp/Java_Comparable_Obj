package myPackage;

public class Person implements Comparable<Person>{
    private String ten;
    private int id;

    @Override
    public int compareTo(Person o) {
        return this.ten.compareTo(o.getTen());
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()){
//            return -1;
//        } else {
//            return 0;
//        }
    }

    public Person() {

    }

    public Person(String ten, int id) {
        this.ten = ten;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
