/**
 * Created by ganeshramiyer on 11/2/16.
 */
var name = "John Smith";
$("#userName").text(name);


$('#filer-change').click(function(){
    drawBackgroundColor();
});


var drawBackgroundColor =function () {
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'X');
    data.addColumn('number', 'Connections');

    // Call to backend for data
    // Dummy data

    if ($('#year').val()=='2015') {
        rows = [
            ['Jan', 10],  ['Feb', 23],  ['Mar', 17],  ['April', 18],  ['May', 9],
            ['June', 11],  ['July', 27],  ['Aug', 33],  ['Sep', 40],  ['Oct', 32], ['Nov', 35],
            ['Dec', 30]
        ]
    } else {
        rows = [
            ['Jan', 5],  ['Feb', 15],  ['Mar', 17],  ['April', 12],  ['May', 9],
            ['June', 15],  ['July', 20],  ['Aug', 13],  ['Sep', 30],  ['Oct', 35], ['Nov', 28],
            ['Dec', 20]
        ]
    }

    data.addRows(rows);

    var options = {
        title:"Mentor Student Count",
        titleFontSize:20,
        hAxis: {
            title: 'Month'
        },
        vAxis: {
            title: 'Mentor Count'
        },
        width : 900,
        height : 600,
        backgroundColor: {
            stroke: '#42b9f4',
            strokeWidth: 3
        },
        colors : ['#111111']
    };

    var chart = new google.visualization.LineChart(document.getElementById('mentorstudent-count'));
    chart.draw(data, options);
}

google.charts.load('current', {packages: ['corechart', 'line']});
google.charts.setOnLoadCallback(drawBackgroundColor);
