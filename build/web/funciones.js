$(function () {
    $("#frmCliente").bind("submit", function () {
        return Create();
    });

    function Create() {
        $.ajax({
            url: 'cliente.do',
            type: 'POST',
            data: {
                nomPais: $("#txtNomPais").val()
            },
            success: function (responseText) {

            }
        });
    }
    
    //esto permite llamar la función en cada llamada de la página
    List();

    function List() {
        $.ajax({url: 'cliente.do',
            data: {},
            type: 'GET',
            dataType: 'json',
            success: function (respJson) {
                $("#tableList").html("");
                $("#tableList").html(
                        "<thead>" +
                        "<tr>" +
                        "<th>ID</th>" +
                        "<th>NOMBRE</th>" +
                        "</tr>" +
                        "</thead>"+
                        "<tbody>"+
                        "</tbody>"
                        );
                for (var i in respJson) {
                    var pais = respJson[i];
                    $("#tableList tbody").append(
                            "<tr>" +
                            "<td>" + pais.idPais + "</td>" +
                            "<td>" + pais.nombrePais + "</td>" +
                            "</tr>"
                            );
                }
            }
        });
    }
});