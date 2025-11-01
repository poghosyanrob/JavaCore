package homework.employee;

public class EmployeeIdNotFoundException extends Exception {
    public EmployeeIdNotFoundException(String message) {
        super(message);
    }

    public EmployeeIdNotFoundException() {
    }

    public EmployeeIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmployeeIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
