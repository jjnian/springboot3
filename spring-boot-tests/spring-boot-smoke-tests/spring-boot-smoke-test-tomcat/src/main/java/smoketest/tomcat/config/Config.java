package smoketest.tomcat.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@ServletComponentScan(basePackages = "smoketest.tomcat")
@Configuration
public class Config {
}
