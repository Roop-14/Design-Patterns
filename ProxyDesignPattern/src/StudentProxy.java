public class StudentProxy extends Student{

    StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void dailyLesson() {
       if (super.getAttendance().isPresent()){
           super.dailyLesson();
       }else
           throw new RuntimeException("Student is not present");
    }
}
