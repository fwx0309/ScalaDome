package com.fwx.java;

public class Id {
    public static void main(String[] args) {
        System.out.println("520103192707282810".matches("^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|81|82|91)\\d{4}(\\d{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\d{3}$"));
        System.out.println("520103192707282810".matches("^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|81|82|83|91)\\d{4}((18[8|9][0-9])|(19\\d{2})|(200[0-9]|201[0-9]))(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\d{3}([0-9]|x|X)$"));


        System.out.println("522221197909061621".matches("^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|81|82|91)\\d{4}(\\d{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\d{3}$"));
        System.out.println("522221197909061621".matches("^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|81|82|83|91)\\d{4}((18[8|9][0-9])|(19\\d{2})|(200[0-9]|201[0-9]))(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\d{3}([0-9]|x|X)$"));

    }
}
