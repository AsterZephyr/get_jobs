package zhilian;

import lombok.Data;
import lombok.SneakyThrows;
import utils.JobUtils;

import java.util.List;
import java.util.Objects;

@Data
public class ZhilianConfig {
    /**
     * 搜索关键词列表
     */
    private List<String> keywords;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 薪资范围
     */
    private String salary;

    private String type;


    @SneakyThrows
    public static ZhilianConfig init() {
        ZhilianConfig config = JobUtils.getConfig(ZhilianConfig.class);
        // 转换城市编码
        config.setCityCode(ZhilianEnum.CityCode.forValue(config.getCityCode()).getCode());
        config.setType(ZhilianEnum.Type.forValue(config.getType()).getCode());
        String salary = config.getSalary();
        config.setSalary(Objects.equals("不限", salary) ? "0" : salary);
        return config;
    }

}
