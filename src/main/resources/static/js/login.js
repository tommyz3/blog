layui.use('form', function(){
    var form = layui.form;

    // 监听登录提交
    form.on('submit(loginForm)', function(data){
        var email = $("input[name='email']").val();
        var password =$("input[name='password']").val();
        layer.msg(email + password);
        $.ajax({
            url: '/login',
            type: 'post',
            data: {
                'email': email,
                'password': password
            },
            success: function (data) {
                layer.msg(data);
            },
            // error: function (e) {
            //     layer.msg(e);
            // }
        })
        return false;
    });
});