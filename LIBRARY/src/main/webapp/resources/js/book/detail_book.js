//책 조회하는 기능
//is_delete='Y'이면 모달창으로
//현재 조회할 수 없는 도서입니다.(사유:비치 중지)
//텍스트에 p태그 넣고 onclick() 넣기

function getBkDetail(selected){
	var OBookCode = $(selected).closest('tr').children().eq(6).val();
	var memId = $('#memId').val();
	
	const bookCode = OBookCode;
	
	alert(bookCode+memId);
	
	$.ajax({
		url: '/book/selectIsDelete',
		type: 'post',
		data: {'bookCode':bookCode},
		success:function(result){
			if(result=='Y'){
				alert('현재 조회할 수 없는 도서입니다.(사유:비치 중지)');
				location.href='/member/borrowListU?memId='+memId;
			}
			else{
				location.href='/book/bookDetail?memId='+memId+'&bookCode='+bookCode;
			}
		}
	});
	
}