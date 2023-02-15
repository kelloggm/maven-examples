package util;

import org.apache.commons.lang3.StringUtils;

public class Util {

    public static String join(String... elements) {
        return StringUtils.join(elements);
    }

    // force WPI to infer something
    public Object getNull() {
	return null;
    }

}
