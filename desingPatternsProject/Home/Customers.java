package Home;

public class Customers {
    private String name,lastName,date,remarks,type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customers(String name, String lastName, String date, String remarks, String type) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.remarks = remarks;
        this.type = type;
    }
}
