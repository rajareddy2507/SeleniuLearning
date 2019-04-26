package com.Collections;

public class Address {
private String streeName;
private String state;
private long zipcd;

public Address(String streeName, String state, long zipcd) {
	super();
	this.streeName = streeName;
	this.state = state;
	this.zipcd = zipcd;
}
public String getStreeName() {
	return streeName;
}
public void setStreeName(String streeName) {
	this.streeName = streeName;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getZipcd() {
	return zipcd;
}
public void setZipcd(long zipcd) {
	this.zipcd = zipcd;
}

public String toString() {
	return "Address [streeName=" + streeName + ", state=" + state + ", zipcd=" + zipcd + "]";
}

}
