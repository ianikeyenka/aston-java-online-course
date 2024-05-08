package exception;

import java.io.IOException;

public class ReadException extends IOException {

    public ReadException(String message) {
        super(message);
    }
}
