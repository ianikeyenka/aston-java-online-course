package exception;

import java.io.IOException;

public class WriteException extends IOException {

    public WriteException(String message) {
        super(message);
    }
}
