package org.example;

import com.ericsson.otp.erlang.OtpErlangBinary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static OtpErlangBinary toOtpErlangBinary(String value) {
        return new OtpErlangBinary(value);
    }

    public static OtpErlangBinary toOtpErlangBinaryWithBytes(String value) {
        return new OtpErlangBinary(value.getBytes());
    }
}