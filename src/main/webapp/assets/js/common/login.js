/**
 * Created by Administrator on 2017/4/7.
 */
$(function(){
    $("#loginBtn").click(function(){
        var params={};
        $("#loginData :input").each(function () {
            var name = $(this).attr("name");
            var value = $(this).val() || $(this).text();
            if (value != null) {
                var val = value.trim();
                if (val != "") {
                    params[name] = val;
                }
            }
        });
        console.log("params---",params);

        $.dataAjax("/user/login",params,function(result){

        });
    });
})