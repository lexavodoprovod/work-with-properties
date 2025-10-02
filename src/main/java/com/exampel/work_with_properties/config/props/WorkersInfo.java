package com.exampel.work_with_properties.config.props;

public class WorkersInfo {

    private PositionType position;

    private Integer sallary;

    public PositionType getPosition() {
        return position;
    }

    public void setPosition(PositionType position) {
        this.position = position;
    }

    public Integer getSallary() {
        return sallary;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "WorkersInfo{" +
                "position=" + position +
                ", sallary=" + sallary +
                '}';
    }
}
