package com.proxy.dynamic;

public interface PersionBean {

    String getName();
    String getGender();
    int getHotOrNotRating(int rating);

    void setName(String name);
    void setGender(String gender);
    void setHotOrNotRating(int rating);

}
