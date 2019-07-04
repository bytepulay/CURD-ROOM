package com.example.curdroom;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    View view;
    private Button BnAddUser,BnViewUser,BnDeleteUser,BnUpdateUser,btnStudent;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_home, container, false);

       BnAddUser = view.findViewById(R.id.bn_add_user);
       BnViewUser = view.findViewById(R.id.bn_user_view);
       BnDeleteUser = view.findViewById(R.id.bn_delete_user);
       BnUpdateUser = view.findViewById(R.id.bn_update_user);
       btnStudent = view.findViewById(R.id.btnStudent);

        BnAddUser.setOnClickListener(this);
        BnViewUser.setOnClickListener(this);
        BnDeleteUser.setOnClickListener(this);
        BnUpdateUser.setOnClickListener(this);
        btnStudent.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {
    switch (v.getId())
    {
        case R.id.bn_add_user:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).addToBackStack(null).commit();
            break;

        case R.id.bn_user_view:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).addToBackStack(null).commit();
            break;

        case R.id.bn_delete_user:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteUserFragment()).addToBackStack(null).commit();
            break;


        case R.id.bn_update_user:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new UpdateUserFragment()).addToBackStack(null).commit();
            break;

        case R.id.btnStudent:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new StudentFragment()).addToBackStack(null).commit();
            break;

    }
    }
}
