package cn.edu.guet.service;

import cn.edu.guet.bean.Room;
import cn.edu.guet.bean.Student;
import cn.edu.guet.bean.Water;
import cn.edu.guet.bean.WaterOrder;

import java.util.Date;
import java.util.List;

public interface IWaterService {
    public List<Water> getWater();
    public int countWater();
    public List<Student> getStudent();
    public List<Room> getAllRoom(String buid);
    public List<WaterOrder> insertOrder(String woId, String buid, int woNum, String woRoom, int woMoney, String woUser);
    public List<WaterOrder> getAllOrder(String woUser);
}
