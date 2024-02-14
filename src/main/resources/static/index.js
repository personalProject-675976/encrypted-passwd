/**
 * 显示提示
 * @param content 提示内容
 */
function commonAlter(content)
{
    var layer = layui.layer;
    layer.alert
    (
        content,
        {title: '提示'}
    );
}

layui.use
(
    function()
    {
        var $ = layui.$;
        var form = layui.form;

        form.on
        (
            'submit(demo-reg)',
            function(data)
            {
                $.ajax
                (
                    {
                        url : '/getPasswd',
                        type : 'POST',
                        dataType : 'json',
                        headers: {'Content-Type': 'application/json;charset=utf-8'},
                        data:JSON.stringify(data.field),
                        success : function (respData)
                        {
                            if (respData.success)
                            {
                                $('#result').text(respData.data);
                                $('#result-wrapper').attr('hidden', false);
                            }
                            else
                            {
                                commonAlter(respData.msg);
                            }
                        },
                        error : function ()
                        {
                            commonAlter('请求失败');
                        }
                    }
                );
                return false;
            }
        );
    }
);