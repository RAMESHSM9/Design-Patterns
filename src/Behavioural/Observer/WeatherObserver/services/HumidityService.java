package Behavioural.Observer.WeatherObserver.services;

import Behavioural.Observer.WeatherObserver.Observer;
import Behavioural.Observer.WeatherObserver.utils.NotificationUtils;

public class HumidityService  implements Observer {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }

    @Override
    public void updateOnCrossingThresold(double val) {
        trigger(val);
    }
}
