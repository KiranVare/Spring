package spring_jpa_ecom_mvc.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import spring_jpa_ecom_mvc.DTO.ErrorResponse;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    //custom exception handler
    //exception handle usind model also called as DTO
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(ResourceNotFoundException e) {
        ErrorResponse er = new ErrorResponse();
        er.setMessage(e.getMessage());
        er.setStatus(HttpStatus.NOT_FOUND);
        er.setSuccess(false);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND).
                body(er);

    };

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<String> handleException(ResourceNotFoundException ex)
//    {
//        System.out.println("Error Occurred "+ex.getMessage());
////        return ResponseEntity.status(400).body(ex.getMessage());
//        //if error codes not remembered then
//
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body("Error Occurred:-"+ex.getMessage());
//    }

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> handleException(RuntimeException ex)
//    {
//        System.out.println("Error Occurred "+ex.getMessage());
////        return ResponseEntity.status(400).body(ex.getMessage());
//        //if error codes not remembered then
//
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body("Error Occurred:-"+ex.getMessage());
//    }
}
