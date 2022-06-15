package com.hiimakun.user.valueObject;

import com.hiimakun.user.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {

    private User user;
    private Department department;
}
