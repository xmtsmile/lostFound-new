/**
 * Created by Administrator on 2017/4/7.
 */
;(function($) {
    $.extend({
        //ajax数据请求
        dataAjax: function(url, params, successfn){
            $.ajax({
                type: "POST",
                url: url,
                cache: false,
                data: params,
                dataType: "json",
                traditional: true
            }).done(function (result) {
                if(result.success){
                    successfn(result);
                }else{

                }
            }).fail(function(){
                setTimeout(function(){

                },1500);
            });
        }
    });
}(jQuery));
