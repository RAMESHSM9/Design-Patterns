package Behavioural.Observer.TaskObserver.services;

import Behavioural.Observer.TaskObserver.Observer;
import Behavioural.Observer.TaskObserver.utils.NotificationUtils;

public class SlackService implements Observer {
    public void sendSlack(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendSlack(subject, String.format(message, taskId, id));
    }

    @Override
    public void onTaskCreation(Long taskId, Long userId) {
        sendSlack(userId, taskId);
    }
}
