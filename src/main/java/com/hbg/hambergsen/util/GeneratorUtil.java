package com.hbg.hambergsen.util;

import org.mybatis.generator.api.ShellRunner;

public class GeneratorUtil {

    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
