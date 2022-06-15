package com.tuturial.apidemo.Spring.tuturial.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private String status;
    private String message;
    private Object data;
}
