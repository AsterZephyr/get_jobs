package job51;

import boss.BossEnum;
import lombok.Data;
import lombok.SneakyThrows;
import utils.JobUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Job51Config {


    /**
     * 搜索关键词列表
     */
    private List<String> keywords;

    /**
     * 城市编码
     */
    private List<String> jobArea;

    /**
     * 薪资范围
     */
    private List<String> salary;

    private List<String> workYear;
    private List<String> industry;
    private List<String> degree;

    @SneakyThrows
    public static Job51Config init() {
        Job51Config config = JobUtils.getConfig(Job51Config.class);
        // 转换城市编码
        config.setJobArea(config.getJobArea().stream().map(value -> Job51Enum.jobArea.forValue(value).getCode()).collect(Collectors.toList()));
        config.setIndustry(config.getIndustry().stream().map(value -> Job51Enum.Industry.forValue(value).getCode()).collect(Collectors.toList()));
        // 转换薪资范围
        config.setSalary(config.getSalary().stream().map(value -> Job51Enum.Salary.forValue(value).getCode()).collect(Collectors.toList()));
        // 转换薪资范围
        config.setWorkYear(config.getWorkYear().stream().map(value -> Job51Enum.WorkYear.forValue(value).getCode()).collect(Collectors.toList()));
        config.setDegree(config.getDegree().stream().map(value -> Job51Enum.Degree.forValue(value).getCode()).collect(Collectors.toList()));
        return config;
    }

}
