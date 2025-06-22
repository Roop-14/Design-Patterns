public class Student implements DailySession{
    Attendance attendance;

    Student(Attendance attendance){
        this.attendance = attendance;
    }

    @Override
    public void dailyLesson() {
       System.out.println("Attending the session");
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}
