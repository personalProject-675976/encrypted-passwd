package top.liyanxing.encryptedpasswd.process;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionServiceTest
{
    @Autowired
    @Qualifier("questionService")
    private QuestionService questionService;

    @Test
    public void generateEncryptContentTest()
    {
        questionService.generateEncryptContent();
    }
}
