package com.ea.SpringBasic.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverFactory {

    @Value("${grid.url}")
    private URL gridUrl;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForChrome() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        return new RemoteWebDriver(gridUrl, caps);
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForFirefox() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        return new RemoteWebDriver(gridUrl, caps);
    }

}
