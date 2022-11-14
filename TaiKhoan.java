package QuanLyAcount;

public class TaiKhoan {
    int id;
    String userName;
    String passWord;
    String phoneNumber;
    String dateBirthday;

    public TaiKhoan() {}

    public TaiKhoan(int id, String userName, String passWord, String phoneNumber, String dateBirthday) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.dateBirthday = dateBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    @Override
    public String toString() {
        return "nhan vien nay co ID la" + getId()+ "tk la " + getUserName() + "\n" +
                "sdt la: " + getPhoneNumber() + ", ngay sinh: " + getDateBirthday() +
                super.toString();
    }
}
