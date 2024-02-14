package top.liyanxing.encryptedpasswd.config;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.liyanxing.common.CommonResult;

@Slf4j
@ControllerAdvice
public class ExceptionController
{
    @ResponseBody
    @ExceptionHandler({Exception.class})
    public CommonResult<String> foo(Exception e)
    {
        log.info("全局捕获异常【{}】", ExceptionUtil.stacktraceToOneLineString(e));
        return CommonResult.errorMsg(e.getMessage());
    }
}
