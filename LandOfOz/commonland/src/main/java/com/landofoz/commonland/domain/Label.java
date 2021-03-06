package com.landofoz.commonland.domain;

import com.landofoz.commonland.persistence.Persistent;

/**
 * Created by ericm on 10/17/2015.
 */
public class Label extends Persistent {

    private String name;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
