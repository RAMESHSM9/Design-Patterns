package Behavioural.Observer.TaskObserver.services;

import Behavioural.Observer.TaskObserver.Observer;
import Behavioural.Observer.TaskObserver.utils.NotificationUtils;

public class AppService implements Observer {
    public void sendPush(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, id));
    }

    @Override
    public void onTaskCreation(Long taskId, Long userId) {
        sendPush(userId, taskId);
    }
}
