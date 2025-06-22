public class ReminderPrint {


    public void printReminders() {
        Reminder.reminders.forEach(System.out::println);
    }
}
