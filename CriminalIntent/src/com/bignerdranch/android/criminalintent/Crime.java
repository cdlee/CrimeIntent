package com.bignerdranch.android.criminalintent;

import java.util.UUID;

public class Crime {
private UUID Id;
private String Title;


public Crime() {
	//Generate UNique Identifier
	Id = UUID.randomUUID();
}


public String getTitle() {
	return Title;
}


public void setTitle(String title) {
	Title = title;
}


public UUID getId() {
	return Id;
}
}
