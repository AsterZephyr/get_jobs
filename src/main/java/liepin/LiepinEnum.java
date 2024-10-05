package liepin;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

public class LiepinEnum {

    @Getter
    public enum CityCode {
        NULL("不限", "0"),
        ALL("全国", "410"),
        BEIJING("北京", "010"),
        SHANGHAI("上海", "020"),
        GUANGZHOU("广州", "050020"),
        SHENZHEN("深圳", "050090"),
        HANGZHOU("杭州", "070020"),
        CHENGDU("成都", "280020");

        private final String name;
        private final String code;

        CityCode(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static CityCode forValue(String value) {
            for (CityCode cityCode : CityCode.values()) {
                if (cityCode.name.equals(value)) {
                    return cityCode;
                }
            }
            return NULL;
        }

    }


    //
    @Getter
    public enum WorkYearCode {
        NULL("不限", "0"),
        YINGJIE("应届生", "1"),
        SHIXI("实习生", "2");

        private final String name;
        private final String code;

        WorkYearCode(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @JsonCreator
        public static WorkYearCode forValue(String value) {
            for (WorkYearCode workYearCode : WorkYearCode.values()) {
                if (workYearCode.name.equals(value)) {
                    return workYearCode;
                }
            }
            return NULL;
        }

    }

}
