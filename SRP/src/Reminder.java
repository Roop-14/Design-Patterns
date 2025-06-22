import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {
    private int reminderId;
    private String note;
    private LocalDateTime  time;


    public static List<Reminder>  reminders=new ArrayList<Reminder>();

    public Reminder() {}
    public Reminder(int reminderId, String note, LocalDateTime time, List<Reminder> reminders) {
        this.reminderId = reminderId;
        this.note = note;
        this.time = time;
    }

    public void addReminder(Reminder reminder) {
        boolean isValid=validateReminder(reminder);
        if(!isValid) {
            throw  new RuntimeException("Invalid reminder");
        }
        reminders.add(reminder);
    }

    public boolean validateReminder(Reminder reminder) {
        if(reminder.getReminderId()<=0) {
            return false;
        }
        if(reminder.getNote().isBlank()){
            return false;
        }
        return true;

    }



    public void removeReminder(int reminderId) {
        reminders.removeIf(reminder -> reminder.getReminderId()==reminderId);

    }




    public int getReminderId() {
        return reminderId;
    }

    public String getNote() {
        return note;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "reminderId=" + reminderId +
                ", note='" + note + '\'' +
                ", time=" + time +
                '}';
    }
}
