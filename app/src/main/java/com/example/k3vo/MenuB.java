package com.example.k3vo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class MenuB extends Fragment {

    private Button b1, b2, b3, b4, b5, b6, b7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu_b, container, false);

        b1 = (Button) v.findViewById(R.id.quiz_bab1);
        b2 = (Button) v.findViewById(R.id.quiz_bab2);
        b3 = (Button) v.findViewById(R.id.quiz_bab3);
        b4 = (Button) v.findViewById(R.id.quiz_bab4);
        b5 = (Button) v.findViewById(R.id.quiz_bab5);
        b6 = (Button) v.findViewById(R.id.quiz_bab6);
        b7 = (Button) v.findViewById(R.id.quiz_bab7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab I Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab II Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab III Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Bab IV Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab V Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab VI Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quiz Bab VII Sedang dalam Tahap Pengembangan.", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}