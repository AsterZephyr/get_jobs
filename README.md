<h1 align="center">🍀Get Jobs【工作无忧】</h1>
<div align="center">

[![Stars](https://img.shields.io/github/stars/AsterZephyr/get_jobs?style=flat&label=%F0%9F%8C%9Fstars&labelColor=ff4f4f&color=ff8383)](https://github.com/AsterZephyr/get_jobs)
[![License](https://img.shields.io/badge/📑licenses-MIT-34D058?labelColor=22863A&style=flat)](https://github.com/AsterZephyr/get_jobs/blob/master/LICENSE)
[![Issues closed](https://img.shields.io/github/issues-search?query=repo%3AAsterZephyr/get_jobs/0is%3Aclosed&label=%F0%9F%A4%8F%F0%9F%8F%BBFissues/0closed&labelColor=008B8B&color=00CCCC)](https://github.com/AsterZephyr/get_jobs/issues?q=is%3Aissue+is%3Aclosed)
[![Forks](https://img.shields.io/github/forks/AsterZephyr/get_jobs?style=flat&label=%F0%9F%8F%85Forks&labelColor=800080&color=912CEE)](https://github.com/AsterZephyr/get_jobs/forks)
</div>

### 🌴源码地址

- Github：https://github.com/AsterZephyr/get_jobs

### 🌞 特色功能

- 支持国内全部招聘平台(Boss直聘、猎聘、拉勾、51job、智联招聘)
- 集中化配置，仅需修改配置文件即可完成自定义筛选
- 全局日志记录，投递记录可追踪
- 内置driver驱动，自动判断系统环境适配驱动版本
- 超长cookie登录，大部分平台每周仅需扫码一次
- 内置xpathHelper插件，方便快速定位元素
- Boss默认过滤猎头岗位，可修改代码自定义修改条件
- Boss自动更新黑名单企业，避免重复投递

### 🔞️ 注意事项

- ❌必须要关闭墙外代理，由于主要针对的国内平台，墙外代理会导致页面加载缓慢
- 💪🏻如你有"折腾精神"希望自己配置，如你不想麻烦，可联系作者部署
- 📰由于不同系统的页面不一样，导致可能不兼容，文末会给出文档，尽可能让大家能自定义修改

> 已经有人在交流群里 **发广告** 等与本项目无关的信息  
> 如果带着不同目的或者没想清楚就进群的  
> 一经发现群主会对您的家人及朋友进行亲切(**没有素质**)的问候  
> 并将您请出群聊，请珍惜交流的机会，谢谢！

## 🚀 如何使用？

### 1️⃣ 使用git拉取代码

```
git clone https://github.com/AsterZephyr/get_jobs.git
cd get_jobs
```

### 2️⃣ 环境配置:JDK17+、Maven、Chrome、ChromeDriver

> 目前driver版本号：123.0.6312.122
> chrome需要版本为：124.0.6367.61及以上(默认最新即可)

- 目前程序自动判断系统环境，使用对应的chromedriver，无需手动下载
- 但是你的Chrome版本必须是在Chrome官网下载的，并且为最新版本，才可使用
- 如果你是mac intel芯片版本，请自行下载对应的驱动到src/main/resources路径下解压
- 如果你是mac m1芯片的版本，需要解压【[chromedriver-mac-arm64.zip](src/main/resources/chromedriver-mac-arm64.zip)
  】后使用
- 如果你是linux系统，需要解压【[chromedriver-linux64.zip](src/main/resources/chromedriver-linux64.zip)】后使用

更多环境配置详情请点击：📚 [环境配置](https://github.com/AsterZephyr/get_jobs/wiki/环境配置)

### 3️⃣ 修改配置文件(一般默认即可,需要修改自己的地区和岗位)

- 🔩 通用配置
    - 日志文件在 **target/logs** 目录下，所有日志都会输出在以运行日期结尾的日志文件中
    - **Constant.WAIT_TIME**：超时等待时间，单位秒，用于等待页面加载
    - **cookie登录**: 扫码后会自动保存**cookie.json**文件在代码运行目录下，换号直接删除**cookie.json**即可
    - 每个平台的配置转换码都在平台文件夹下的Enum类里，找到相应的代码添加到类中即可

- ⚙️ **主要的配置文件**（[config.yaml](src/main/resources/config.yaml))
  ```
  # 带[ ]括号的，就是多选，不带的就是单选
  boss:
  sayHi: "您好,我有7年工作经验,还有AIGC大模型、Java,Python,Golang和运维的相关经验,希望应聘这个岗位,期待可以与您进一步沟通,谢谢！" #必须要关闭boss的自动打招呼
  keywords: [ "大模型工程师", "AIGC工程师","Python", "Golang", "Java" ] # 需要搜索的职位,会依次投递
  industry: [ "不限" ] # 公司行业，只能选三个，相关代码枚举的部分，如果需要其他的需要自己找
  cityCode: [ "上海" ] # 只列举了部分,如果没有的需要自己找：目前支持的：全国 北京 上海 广州 深圳 成都
  experience: [ "不限" ] # 工作经验："应届毕业生", "1年以下", "1-3年", "3-5年", "5-10年", "10年以上"
  jobType: "不限" #求职类型："全职", "兼职"
  salary: "不限" # 薪资（单选）："3K以下", "3-5K", "5-10K", "10-20K", "20-50K", "50K以上"
  degree: [ "不限" ] # 学历: "初中及以下", "中专/中技", "高中", "大专", "本科", "硕士", "博士"
  scale: [ "不限" ] # 公司规模："0-20人", "20-99人", "100-499人", "500-999人", "1000-9999人", "10000人以上"
  stage: [ "不限" ] # "未融资", "天使轮", "A轮", "B轮", "C轮", "D轮及以上", "已上市", "不需要融资"
  
  job51:
  jobArea: [ "上海" ]  #工作地区：目前只有【北京 成都 上海 广州 深圳】
  keywords: [ "java", "python", "go", "golang", "大模型", "软件工程师" ] #关键词：依次投递
  salary: [ "不限" ] #薪资范围：只能选5个【"2千以下", "2-3千", "3-4.5千", "4.5-6千", "6-8千", "0.8-1万", "1-1.5万", "1.5-2万", "2-3万", "3-4万", "4-5万", "5万以上"】
  
  lagou:
  keywords: [ "AI工程师","Java","Golang","Python" ] #搜索关键词
  cityCode: "上海" #拉勾城市名没有限制,直接填写即可
  salary: "不限" #薪资【"不限","2k以下", "2k-5k", "5k-10k", "10k-15k", "15k-25k", "25k-50k", "50k以上"】
  scale: [ "不限" ] #公司规模【"不限","少于15人", "15-50人", "50-150人", "150-500人", "500-2000人", "2000人以上"】
  
  liepin:
  cityCode: "上海" # 目前支持的：全国 北京 上海 广州 深圳 成都
  keywords: [ "Java", "Python", "Golang", "大模型" ]
  salary: "不限" # 填 15$30 代表 15k-30k
  
  zhilian:
  cityCode: "上海"
  salary: "25001,35000" #薪资区间
  keywords: [ "AI工程师", "AIGC", "Java", "Python", "Golang" ]
  ```
- boss直聘([Boss.java](src/main/java/boss/Boss.java))【每日仅可发起100次新聊天，活跃度还行，但是每日投递次数太少】

  > 注意：Boss必须要关闭自动打招呼，设置配置文件的sayHi为你的打招呼语，否则会投递失败  
  > 投递结束后会自动更新黑名单企业，发送过不合适等消息的HR的公司会加入黑名单，不会在投递该公司  
  > 现在找工作是很难，但也别做舔狗，我们是打工人不是牛马！
  ```
  data.json //黑名单数据，在投递结束后会查询聊天记录寻找不合适的公司添加进去
      ├── blackCompanies: List.of("复深蓝"); // 公司黑名单，多个用逗号分隔
      ├── blackRecruiters: List.of("猎头"); // 排除招聘人员，比如猎头
      └── blackJobs: List.of("外包", "外派"); // 排除岗位，比如外包，外派
  ```

- 51job([Job.java](src/main/java/job51/Job51.java))【投递有上限，且限制搜索到的岗位数量，没什么活人】

  ```
  51job现在已经烂掉了，不建议使用
  现在投递一段时间后会出现投递上限，
  ```
- 拉勾([Lagou.java](src/main/java/lagou/Lagou.java))【投递无上限，会限制投递的频率，没什么活人而且投不了几个岗位】

   ```
   默认使用微信扫码，请绑定微信账号
  
   拉勾需要指定默认投递简历(在线简历 or 附件简历)，否则会投递失败
  
   拉勾直接使用的是微信扫码登录，运行后直接扫码即可，开箱通用
  
   但是拉勾由于反爬机制较为严重，代码中嵌套了大量的sleep，导致效率较慢
  
   这边建议拉勾的脚本运行一段时间后差不多就行了，配合手动在app或者微信小程序投递简历效果更佳！
   ```

- 猎聘([Liepin.java](src/main/java/liepin/Liepin.java))【默认打招呼无上限，主动发消息有上限，虽然成功率不高，好在量大】

  > 注意：需要在猎聘App最新版设置打招呼语(默或者自定义皆可)，即可自动发送消息，不会被限制

   ```
   只可微信扫码，请绑定微信账号
  
   需要使用最新版猎聘手机app设置打招呼文本，只要不主动发消息，可以无限制对猎头打招呼，程序默认为该配置。
   ```

- 智联招聘([ZhiLian.java](src/Fmain/Fjava/Fzhilian/FZhiLian.java))【投递上限100左右，岗位质量较差,走投无路可以考虑】

   ```
  智联招聘需要指定默认投递简历(在线简历 or 附件简历)，否则会投递失败
  
  只可微信扫码，请绑定微信账号
   ```

### 4️⃣ 最后一步：运行代码

- 🏃🏻‍♂️‍➡️ 直接运行你想要投递平台的下的代码即可  
  ![运行图片](src/main/resources/images/run1.png)

****

### ✍🏼 例:Boss投递日志

<img src="src/main/resources/images/boss.png" alt="Boss投递日志">

### ✍🏼 猎聘投递日志

<img src="src/main/resources/images/liepin.png" alt="猎聘投递日志">

### ✍🏼 寻找城市码

<img src="src/main/resources/images/getCity.png" alt="猎聘投递日志">

## 📧 联系方式

- 如果需要帮助，请提交issue或联系作者

## 👨🏻‍🔧 

> 点击下面的链接可直接加群

[![][pr-welcome-shield]][pr-welcome-link]

## 🚩 

- 授人以渔: [自定义修改你的代码](https://github.com/AsterZephyr/get_jobs/wiki/授人以渔‐自定义修改你的代码)
- 本项目受此启发:https://github.com/BeammNotFound/get-jobs-51job , 感谢大佬，让我们将爱传递下去~

---

## 📑 更新日志

- 2024-04-15 01:52:18
    1. 新增config.yaml,目前仅需修改配置文件即可，已全平台支持
    2. cookie有效期延长，保持至少一周（拉勾平台除外）【安慰剂】
- 2024-04-28 15:20:06
    1. boos：自动更新黑名单公司
- 2024-05-13 01:49:38
    1. boos：若公司名小于2个字或4个字母则不会添加进黑名单
    2. 添加linux系统支持。
- 2024-06-06 01:49:38
    1. boos：若公司名小于2个字或4个字母则不会添加进黑名单
    2. 添加linux系统支持。
- 2024-06-06 17:41:20  
  1. boss支持多城市投递。

--- 

## 🤝 参与贡献

我们非常欢迎各种形式的贡献  
如果你对贡献代码感兴趣  
可以查看我们的 [Issues](https://github.com/AsterZephyr/get_jobs/issues)
和 [discussions](https://github.com/AsterZephyr/get_jobs/discussions)  
期待你的大展身手，向我们展示你的奇思妙想。

- 提交Pr流程：
    1. fork本项目
    2. 从master分支新建分支
    3. 开发完成后提交pull request到lok666/get_jobs的【dev】分支，注意是dev！！！
    4. 等待管理员审核验证提交代码无误后，合并到master分支

[![][pr-welcome-shield]][pr-welcome-link]

--- 

### 📰 开源协议

<details><summary><h4>📝 License</h4></summary>

[![FOSSA Status](https://app.fossa.com/api/projects/git/Bgithub.com/Floks666/Fget_jobs.svg?type=large)](https://app.fossa.com/projects/git/Bgithub.com/Floks666/Fget_jobs?ref=badge_large)
</details>

--- 

- 授人以渔: [自定义修改你的代码](https://github.com/AsterZephyr/get_jobs/wiki/授人以渔‐自定义修改你的代码)
- 本项目受此启发:https://github.com/BeammNotFound/get-jobs-51job , 感谢大佬，让我们将爱传递下去~
