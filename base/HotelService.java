package base;

import helpers.AppHelper;

public class HotelService {

    private String name;
    private int fee;
    private int roomNo;

    public HotelService(String _name, int _fee, int _roomNo) {
        setName(_name);
        setFee(_fee);
        setRoomNo(_roomNo);
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public void displayService() {
        AppHelper.MyPrint("Service Name: " + name);
        AppHelper.MyPrint("Service Fee: Rs. " + fee);
        AppHelper.MyPrint("Room Number: " + roomNo);
    }
}
