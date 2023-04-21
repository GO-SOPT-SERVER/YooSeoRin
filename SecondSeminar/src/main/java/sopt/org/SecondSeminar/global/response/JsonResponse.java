package sopt.org.SecondSeminar.global.response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class JsonResponse {

    public static ResponseEntity<?> ok(HttpStatus status, String message) {
        SuccessResponse response = SuccessResponse.builder()
                .status(status.value())
                .message(message)
                .build();
        return ResponseEntity.status(status.value())
                .body(response);
    }

    public static ResponseEntity<?> okWithData(HttpStatus status, String message, Object data) {
        SuccessResponse response = SuccessResponse.builder()
                .status(status.value())
                .message(message)
                .data(data)
                .build();
        return ResponseEntity.status(status.value())
                .body(response);
    }
}
