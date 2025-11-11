package homework.medicalCentre.exception;

public class DoctorNotFindByNameException extends  Exception{
    public DoctorNotFindByNameException() {
    }

    public DoctorNotFindByNameException(String message) {
        super(message);
    }

    public DoctorNotFindByNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoctorNotFindByNameException(Throwable cause) {
        super(cause);
    }

    public DoctorNotFindByNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
