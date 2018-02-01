package springboot.animated.banner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalColors {
    //			+~~~~~~+~~~~~~+~~~~~~~~~~~+
//			|  fg  |  bg  |  color    |
//			+~~~~~~+~~~~~~+~~~~~~~~~~~+
//			|  30  |  40  |  black    |
//			|  31  |  41  |  red      |
//			|  32  |  42  |  green    |
//			|  33  |  43  |  yellow   |
//			|  34  |  44  |  blue     |
//			|  35  |  45  |  magenta  |
//			|  36  |  46  |  cyan     |
//			|  37  |  47  |  white    |
//			|  39  |  49  |  default  |
//			+~~~~~~+~~~~~~+~~~~~~~~~~~+

    final static String FG_BLACK = (char)27 + "[30m";
    final static String FG_RED = (char)27 + "[31m";
    final static String FG_GREEN = (char)27 + "[32m";
    final static String FG_YELLOW = (char)27 + "[33m";
    final static String FG_BLUE = (char)27 + "[34m";
    final static String FG_MAGENTA = (char)27 + "[35m";
    final static String FG_CYAN = (char)27 + "[36m";
    final static String FG_WHITE = (char)27 + "[37m";
    final static String FG_DEFAULT = (char)27 + "[39m";

    final static String BG_BLACK = (char)27 + "[40m";
    final static String BG_RED = (char)27 + "[41m";
    final static String BG_GREEN = (char)27 + "[42m";
    final static String BG_YELLOW = (char)27 + "[43m";
    final static String BG_BLUE = (char)27 + "[44m";
    final static String BG_MAGENTA = (char)27 + "[45m";
    final static String BG_CYAN = (char)27 + "[46m";
    final static String BG_WHITE = (char)27 + "[47m";
    final static String BG_DEFAULT = (char)27 + "[49m";

    final static String COLOR_RESET = BG_DEFAULT + FG_DEFAULT;

    final static List<String> ALL_BACKGROUNDS = new ArrayList<>(
            Arrays.asList(BG_BLACK, BG_RED, BG_GREEN, BG_YELLOW, BG_BLUE, BG_MAGENTA, BG_CYAN, BG_WHITE, BG_DEFAULT)
    );

    final static List<String> ALL_FOREGROUNDS = new ArrayList<>(
            Arrays.asList(FG_BLACK, FG_RED, FG_GREEN, FG_YELLOW, FG_BLUE, FG_MAGENTA, FG_CYAN, FG_WHITE, FG_DEFAULT)
    );
}
