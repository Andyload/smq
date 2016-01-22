package com.example.test.util;

public class NativeUtils {

	static {
		System.loadLibrary("test-jni");
	}

	public static native String hello();
}
