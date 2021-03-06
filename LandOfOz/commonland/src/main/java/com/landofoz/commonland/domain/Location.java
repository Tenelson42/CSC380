package com.landofoz.commonland.domain;

import com.landofoz.commonland.persistence.Persistent;

/**
 * Created by ericm on 10/17/2015.
 */
public class Location extends Persistent {

    public static final int
        HALLWAY = 0,
        ELEVATOR = 1,
        ESCALATOR = 2,
        STAIRWAY = 3,
        ENTRANCE = 4,
        DESTINATION = 5;

    private float longitude;

    private float latitude;

    private int type;

    private Floor floor;


    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

}
