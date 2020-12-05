package hcl46208;

public class BookOrderBean {
private int orderId;
private String userName;
private String bookName;
private String price;
private int num;
private String zipcode;
private String phone;
private String creditcard;
private double total;
public int getOrderId() {
    return orderId;
}
public void setOrderId(int orderId) {
    this.orderId = orderId;
}
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
    this.userName = userName;
}
public String getBookName() {
    return bookName;
}
public void setBookName(String bookName) {
    this.bookName = bookName;
}
public String getPrice() {
    return price;
}
public void setPrice(String price) {
    this.price = price;
}
public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
public String getZipcode() {
    return zipcode;
}
public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getCreditcard() {
    return creditcard;
}
public void setCreditcard(String creditcard) {
    this.creditcard = creditcard;
}
public double getTotal() {
    return total;
}
public void setTotal(double total) {
    this.total = total;
}
public BookOrderBean(int orderId, String userName, String bookName, String price, int num, String zipcode, String phone,
        String creditcard, double total) {
    super();
    this.orderId = orderId;
    this.userName = userName;
    this.bookName = bookName;
    this.price = price;
    this.num = num;
    this.zipcode = zipcode;
    this.phone = phone;
    this.creditcard = creditcard;
    this.total = total;
}
public BookOrderBean() {
    super();
    // TODO Auto-generated constructor stub
}

}