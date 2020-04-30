JDK Version Range

Spring Framework 5.3.x: JDK 8-17 (expected)
Spring Framework 5.2.x: JDK 8-15 (expected)
Spring Framework 5.1.x: JDK 8-12
Spring Framework 5.0.x: JDK 8-10
Spring Framework 4.3.x: JDK 6-8


Spring Framework 5.x  基于JDK8设计，在JDK8-11做全面测试，希望能支持到预计2021年发布的JDK17 ,Sping团队后续接受Bug报告以便能快速支持
官方建议升级到Spring Framework 5.1+（以及相应的Spring Boot 2.1+）以获得JDK 11+支持，这是从JDK 8迁移的常见长期支持路径。
JDK 11没有正式支持早期的Spring版本，特别是jdk11字节码级别的版本。注意，第三方组件可能还没有完全支持JDK 11


What is Spring Framework 5?

Spring Framework 5是Spring Framework的一个主要版本升级，它引入了一个新的非阻塞web框架Spring WebFlux，
它使用Reactor来支持Reactive Streams API。它还提供了一个功能性编程替代带注释的控制器、一流的Kotlin语言支
持以及与JUnit 5的一流集成。它基于Java 8语言特性
