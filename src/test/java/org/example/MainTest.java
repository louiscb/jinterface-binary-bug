package org.example;

import com.ericsson.otp.erlang.OtpErlangBinary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void findError() {
        String value = "asdf";

        OtpErlangBinary works = Main.toOtpErlangBinaryWithBytes(value);
        String first  = new String(works.binaryValue());

        assertEquals(value, first);

        OtpErlangBinary binary = Main.toOtpErlangBinary(value);
        String second  = new String(binary.binaryValue());

        assertEquals(value, second);

    }
}