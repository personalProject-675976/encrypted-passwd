package top.liyanxing.encryptedpasswd.process;

import top.liyanxing.encryptedpasswd.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.liyanxing.common.CommonResult;

@RestController
public class QuestionController
{
    @Autowired
    @Qualifier("questionService")
    private QuestionService service;

    @PostMapping("/getPasswd")
    public CommonResult<String> getPasswd(@RequestBody Question question)
    {
        return service.getPasswd(question);
    }
}