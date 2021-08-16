function showTime(){  
	//创建日期对象，使用new操作符和Date构造函数创建
	var today=new Date();
	//获取年
	var year=today.getFullYear();
	//获取月
	var moth=today.getMonth()+1;
	//获得一月中某一天
	var day=today.getDate();
	//星期几
	var dayToday=today.getDay();
	//利用if判断星期对应的中文
	if(dayToday==0){
		dayToday="星期天"
	}else if(dayToday==1){
		dayToday="星期一"
	}else if(dayToday==2){
		dayToday="星期二"
	}else if(dayToday==3){
		dayToday="星期三"
	}else if(dayToday==4){
		dayToday="星期四"
	}else if(dayToday==5){
		dayToday="星期五"
	}else if(dayToday==6){
		dayToday="星期六"
	}
	//获取时间
	var minute=today.getMinutes();
	//获取秒
	var second=today.getSeconds();
	//获取24小时时间
	var hour=today.getHours();
	//利用if判断转换12小时
	if(hour<12){
		time=number(hour)+":"+minute+":"+second+" "+"am"
	}else if(hour>=12){
		hour=hour-12
		time=hour+":"+minute+":"+second+" "+"pm";
	}
	//声明变量nowtime得到年月日等
            var nowTime = year+"年"+moth+"月"+day+"日"+" "+time+" "+dayToday; 
        //先获取demo所在框架再修改
            document.getElementById("getTime").innerHTML=nowTime;  
	}  
        //加入定时器
        setInterval(function() {showTime()},1000);