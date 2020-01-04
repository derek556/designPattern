package com.proxy.dynamic;

public class PersionBeanImpl implements PersionBean{

    String name;
    String gender;
    int rating;
    int ratingCount = 0;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public int getHotOrNotRating(int rating) {
        if(ratingCount==0) return 0;
        return (rating / ratingCount);
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
