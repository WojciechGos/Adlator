package com.example.wojciech.fraction;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentConstant#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentConstant extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button number_one;
    private  Button number_two;
    private  Button number_three;
    private  Button number_four;
    private  Button number_five;
    private  Button number_six;
    private  Button number_seven;
    private  Button number_eight;
    private  Button number_nine;
    private  Button number_zero;



    public FragmentConstant() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragmentConstant newInstance(String param1, String param2) {
        FragmentConstant fragment = new FragmentConstant();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_constant, container, false);
        number_one = view.findViewById(R.id.button_constant_number_one);
        number_two = view.findViewById(R.id.button_constant_number_two);
        number_three = view.findViewById(R.id.button_constant_number_three);
        number_four = view.findViewById(R.id.button_constant_number_four);
        number_five = view.findViewById(R.id.button_constant_number_five);
        number_six = view.findViewById(R.id.button_constant_number_six);
        number_seven = view.findViewById(R.id.button_constant_number_seven);
        number_eight = view.findViewById(R.id.button_constant_number_eight);
        number_nine = view.findViewById(R.id.button_constant_number_nine);
        number_zero = view.findViewById(R.id.button_constant_number_zero);

        return view;

    }

}
