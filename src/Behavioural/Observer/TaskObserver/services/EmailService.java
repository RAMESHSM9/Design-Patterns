package Behavioural.Observer.TaskObserver.services;

import Behavioural.Observer.TaskObserver.Observer;
import Behavioural.Observer.TaskObserver.utils.NotificationUtils;

public class EmailService implements Observer {
    public void sendEmail(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendEmail(subject, String.format(message, taskId, id));
    }

    @Override
    public void onTaskCreation(Long taskId, Long userId) {
        sendEmail(userId, taskId);
    }
}
