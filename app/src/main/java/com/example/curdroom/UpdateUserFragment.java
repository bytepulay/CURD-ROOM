package com.example.curdroom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateUserFragment extends Fragment {

    private EditText txtUpdateId,txtUpdateName,txtUpdateEmail;
    private Button btnUpdate;

    public UpdateUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);

        txtUpdateId = view.findViewById(R.id.txtUpdateId);
        txtUpdateName = view.findViewById(R.id.txtUpdateName);
        txtUpdateEmail = view.findViewById(R.id.txtUpdateName);


        btnUpdate = view.findViewById(R.id.btnUpdate);



        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(txtUpdateId.getText().toString());
                String name = txtUpdateName.getText().toString();
                String email = txtUpdateEmail.getText().toString();

                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setEmail(email);
                MainActivity.myAppDatabase.myDao().updateUser(user);

                Toast.makeText(getActivity(),"User Update Succesfully ",Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

}
