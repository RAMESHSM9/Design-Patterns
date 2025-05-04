package Behavioural.Observer.TaskObserver;

public interface Observer {
    public void onTaskCreation(Long taskId, Long userId);
}
