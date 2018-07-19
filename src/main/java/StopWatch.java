public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return startTime;

    }

    public long stop() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
