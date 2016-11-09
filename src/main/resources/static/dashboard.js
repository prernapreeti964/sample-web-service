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
    data.addColumn('number', 'X');
    data.addColumn('number', 'Mentors');

    // Call to backend for data
    // Dummy data

    if ($('#year').val()=='2015') {
        rows = [
            [0, 0],   [1, 10],  [2, 23],  [3, 17],  [4, 18],  [5, 9],
            [6, 11],  [7, 27],  [8, 33],  [9, 40],  [10, 32], [11, 35],
            [12, 30]
        ]
    } else {
        rows = [
            [0, 0],   [1, 10],  [2, 23],  [3, 17],  [4, 18],  [5, 9],
            [6, 11],  [7, 23],  [8, 31],  [9, 30],  [10, 34], [11, 35],
            [12, 30]
        ]
    }

    data.addRows(rows);

    var options = {
        title:"Mentor Student Count",
        titleFontSize:10,
        hAxis: {
            title: 'Time'
        },
        vAxis: {
            title: 'Mentor Count'
        },
        width : 800,
        height : 600
    };

    var chart = new google.visualization.LineChart(document.getElementById('mentorstudent-count'));
    chart.draw(data, options);
}

google.charts.load('current', {packages: ['corechart', 'line']});
google.charts.setOnLoadCallback(drawBackgroundColor);
