package job51;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

public class Job51Enum {

    @Getter
    public enum jobArea {
        NULL("不限", "0"),
        BEIJING("北京", "010000"),
        SHANGHAI("上海", "020000"),
        GUANGZHOU("广州", "030200"),
        SHENZHEN("深圳", "040000"),
        CHENGDU("成都", "090200"),
        WUHAN("武汉", "180200"),
        NANJING("南京", "070200"),
        CQ("重庆", "060000"),
        HANGZHOU("杭州", "080200");
        private final String name;
        private final String code;

        jobArea(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static jobArea forValue(String value) {
            for (jobArea cityCode : jobArea.values()) {
                if (cityCode.name.equals(value)) {
                    return cityCode;
                }
            }
            return NULL;
        }

    }


    @Getter
    public enum Degree {
        NULL("不限", "0"),
        JUNIOR_COLLEGE("大专", "03"),
        BACHELOR("本科", "04");

        private final String name;
        private final String code;

        Degree(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static Degree forValue(String value) {
            for (Degree degree : Degree.values()) {
                if (degree.name.equals(value)) {
                    return degree;
                }
            }
            return NULL;
        }
    }

    //
    @Getter
    public enum Industry {
        NULL("不限", "0"),
        INTERNET("计算机硬件", "37"),
        COMPUTER_SOFTWARE("计算机软件", "01"),
        COMPUTER_FUWU("计算机服务", "38"),
        COMPUTER_TX("电信运营", "39"),
        COMPUTER_TX2("网络设备", "31"),
        CLOUD_COMPUTING("互联网", "32");

        private final String name;
        private final String code;

        Industry(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static Industry forValue(String value) {
            for (Industry industry : Industry.values()) {
                if (industry.name.equals(value)) {
                    return industry;
                }
            }
            return NULL;
        }

    }

    @Getter
    public enum WorkYear {
        NULL("不限", ""),
        SCHOOL("在校生应届生", "01");
        private final String name;
        private final String code;

        WorkYear(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static WorkYear forValue(String value) {
            for (WorkYear workYear : WorkYear.values()) {
                if (workYear.name.equals(value)) {
                    return workYear;
                }
            }
            return NULL;
        }

    }

    @Getter
    public enum Salary {
        NULL("不限", "0"),
        BELOW_2K("2千以下", "01"),
        FROM_2K_TO_3K("2-3千", "02"),
        FROM_3K_TO_4_5K("3-4.5千", "03"),
        FROM_4_5K_TO_6K("4.5-6千", "04"),
        FROM_6K_TO_8K("6-8千", "05"),
        FROM_8K_TO_10K("0.8-1万", "06"),
        FROM_10K_TO_15K("1-1.5万", "07"),
        FROM_15K_TO_20K("1.5-2万", "08"),
        FROM_20K_TO_30K("2-3万", "09"),
        FROM_30K_TO_40K("3-4万", "10"),
        FROM_40K_TO_50K("4-5万", "11"),
        ABOVE_50K("5万以上", "12");

        private final String name;
        private final String code;

        Salary(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static Salary forValue(String value) {
            for (Salary salary : Salary.values()) {
                if (salary.name.equals(value)) {
                    return salary;
                }
            }
            return NULL;
        }
    }

}
