import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    //        Khởi tạo phương thức contracter
    public StopWatch() {

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //    Khởi tạo phương thức getter
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    //Khởi tạo phương thức setter
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    //    Khởi taoh phương thức star() n tại của hệ thống.
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
// Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

//    Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số millisecond giây
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}


