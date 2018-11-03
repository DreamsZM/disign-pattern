package com.zy.design.principle.liskovsubstitution;

import lombok.Data;

@Data
public class Square extends Rectangle {

    private long sideLength;

    @Override
    public long getLength() {
        return super.getLength();
    }
}
