//그래프?
var buyDates = document.getElementsByClassName('buyDates'); //일자 lable
var totalPrices = document.getElementsByClassName('totalPrices'); //일자별 매출금액 data 

var buyDate = new Array();
var totalPrice = new Array();

for(var i = 0; i<buyDates.length; i++){
	buyDate.push(buyDates[i].value);
	totalPrice.push(totalPrices[i].value);
}
	
new Chart(document.getElementById("bar-chart"), {
    type: 'bar',
    data: {
      labels: buyDate,
      datasets: [
        {
          label: '',
          backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"],
          data: totalPrice
        }
      ]
    },
    options: { }
});


 /* var ctx = document.getElementById('myChart').getContext('2d');

	

 /*var chart = new Chart(ctx, {
	 // type : 'bar' = 막대차트를 의미합니다. 
	 type: 'bar', // 
	 data: { 
		labels: ['감','오렌지','사과'], 
		datasets: [{ 
			label: '과일 판매량', 
			backgroundColor: 'rgb(255, 99, 132)', 
			borderColor: 'rgb(255, 99, 132)', 
			data: [2 ,10, 5,] 
		}] 
	}, 
});*/









