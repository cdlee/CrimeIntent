package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
private Crime crime;
private EditText TitleField;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	crime = new Crime();
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup parent,
		Bundle savedInstanceState) {
	View v = inflater.inflate(R.layout.fragment_crime, parent, false);
	TitleField = (EditText)v.findViewById(R.id.crime_title);
	TitleField.addTextChangedListener(new TextWatcher() {
		public void onTextChanged(
				CharSequence c, int start, int before, int count) {
			crime.setTitle(c.toString()); //User input this will return a string that will set the crimes title
		}
		public void beforeTextChanged(
				CharSequence c, int start, int count, int after) {
			//intentionally left blank
		}
			public void afterTextChanged(Editable c) {
				//left blank as well
			}
		
	});
	return v;
}


}
