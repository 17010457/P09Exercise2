package sg.edu.rp.dmsd.p09exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<employee_info> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployee = findViewById(R.id.ListViewEmployee);
        alEmployeeList = new ArrayList<>();
        employee_info employee1 = new employee_info("John","Software Technical Leader","3400.0");
        employee_info employee2 = new employee_info("May","Programmer","2200.0");

        alEmployeeList.add(employee1);
        alEmployeeList.add(employee2);

        caEmployee = new CustomAdapter(this,R.layout.employee_info2,alEmployeeList);
        lvEmployee.setAdapter(caEmployee);
    }
}
