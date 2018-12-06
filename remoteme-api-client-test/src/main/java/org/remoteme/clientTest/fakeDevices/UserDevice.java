package org.remoteme.clientTest.fakeDevices;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class UserDevice {
    int userId;
    int deviceId;



    public UserDevice(int userId, int deviceId) {

        this.userId=userId;
        this.deviceId=deviceId;
    }
}