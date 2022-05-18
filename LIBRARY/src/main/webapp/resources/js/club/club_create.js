function clubCreate(tag){
	if ($("#clubName").val() == "") {
	alert("클럽명을 정확히 입력해주세요");
	return;
}
if ($("#clubName").val().length <= 1) {
	alert("이름을 정확히 입력해주세요");
	return;
}

	else{
		var result = confirm('모임을 생성하시겠습니까?');
		var formTag = document.getElementById('regClub');
		if(result){
			formTag.submit();
		}
		else{
			return;
		}
	}
	
}

function byteCheck(obj, maxByte){
	
	var str = obj.value;
    var str_len = str.length;


    var rbyte = 0;
    var rlen = 0;
    var one_char = "";
    var str2 = "";


    for(var i=0; i<str_len; i++)
    {
        one_char = str.charAt(i);
        if(escape(one_char).length > 4) {
            rbyte += 2;                                         //한글2Byte
        }else{
            rbyte++;                                            //영문 등 나머지 1Byte
        }
        if(rbyte <= maxByte){
            rlen = i+1;                                          //return할 문자열 갯수
        }
     }
     if(rbyte > maxByte)
     {
        // alert("한글 "+(maxByte/2)+"자 / 영문 "+maxByte+"자를 초과 입력할 수 없습니다.");
        alert("메세지는 최대 " + maxByte + "byte를 초과할 수 없습니다.")
        str2 = str.substr(0,rlen);                                  //문자열 자르기
        obj.value = str2;
        fnChkByte(obj, maxByte);
     }
     else
     {
        document.getElementById('byteInfo').innerText = rbyte;
     }	
}



































