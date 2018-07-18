package sg.edu.rp.dmsd.p09exercise2;

/**
 * Created by 17010457 on 7/18/2018.
 */

public class employee_info {
    private String employeeName;
    private String title;
    private String salary;

    public employee_info(String employeeName, String title, String salary) {
        this.employeeName = employeeName;
        this.title = title;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee_info{" +
                "employeeName='" + employeeName + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
