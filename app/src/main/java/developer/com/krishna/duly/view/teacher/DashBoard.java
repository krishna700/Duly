package developer.com.krishna.duly.view.teacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import developer.com.krishna.duly.R;
import developer.com.krishna.duly.presenter.AddNotice;
import developer.com.krishna.duly.presenter.AddStudent;
import developer.com.krishna.duly.presenter.DateClass;
import developer.com.krishna.duly.presenter.MarkAttendance;

public class DashBoard extends Fragment {

    Button notice,markAttendance,addStudent;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.teacher_dashboard, parent, false);
        notice=rootView.findViewById(R.id.notice);
        markAttendance=rootView.findViewById(R.id.markAttendance);
        addStudent=rootView.findViewById(R.id.addStudent);
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),AddNotice.class));

            }
        });
        markAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(getContext(),DateClass.class));
            }
        });
        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),AddStudent.class));

            }
        });

        return rootView;
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
