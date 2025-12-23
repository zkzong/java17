# designpattern

**demo1** 策略模式

**price** 策略模式

**pay** 策略工厂模式

https://github.com/initchu/design-patterns

**login** 策略工厂模式

https://juejin.cn/post/7509408640438059008

├── config
│   └── StrategyConfig.java  // 策略Bean配置
├── controller
│   └── LoginController.java // 登录控制器
├── factory
│   └── LoginStrategyFactory.java // 登录策略工厂
├── model
│   └── LoginRequest.java    // 登录请求参数
├── service
│   ├── impl
│   │   ├── PasswordLoginStrategy.java  // 用户名密码策略
│   │   ├── WechatLoginStrategy.java    // 微信策略
│   │   └── SmsLoginStrategy.java       // 手机号策略
│   └── LoginStrategy.java   // 登录策略接口
└── DesignPatternApplication.java

策略模式：将每种登录方式封装成独立策略类，实现统一接口，调用者无需关心具体实现 
工厂模式：通过工厂类根据登录类型创建对应的策略实例，避免调用者直接 new 对象

这里利用 Spring 的自动装配，将所有@Service标记的LoginStrategy实现类注入到strategyMap中，键为 Bean 名称（默认是类名首字母小写，如passwordLoginStrategy），但我们在策略类中通过getLoginType()返回自定义的类型标识，所以需要在配置类中调整 Bean 名称：

然后在策略类中重写getLoginType()返回和前端约定的类型标识（如 "password"），并在工厂类中建立类型标识到 Bean 的映射：

## 大话设计模式



## 设计模式之禅

