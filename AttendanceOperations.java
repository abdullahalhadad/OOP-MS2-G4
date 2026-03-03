public interface AttendanceOperations {
    void timeIn();
    void timeOut();
    int computeTotalHours();
}