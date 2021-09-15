package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author coolme
 *
 * 这个是输出"Hello,XXX"的内容
 */

@ConfigurationProperties(prefix = "hello")
public class HelloEntity {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HelloEntity{" +
                "content='" + content + '\'' +
                '}';
    }
}
