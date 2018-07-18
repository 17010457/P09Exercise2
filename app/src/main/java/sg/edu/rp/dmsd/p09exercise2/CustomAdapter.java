package sg.edu.rp.dmsd.p09exercise2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010457 on 7/18/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<employee_info> employeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<employee_info> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employeeList = objects;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);

        employee_info currentItem = employeeList.get(position);
        tvName.setText(currentItem.getEmployeeName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getSalary());

        return rowView;
    }
}