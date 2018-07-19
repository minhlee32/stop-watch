public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return startTime=System.currentTimeMillis();

    }

    public long stop() {
        return endTime=System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
