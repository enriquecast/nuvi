
$ (document).ready(function(){
	
	// mostrar menu

	$('#menu').click(function(){
		if($('#menu').attr('class')=='icon-bars') {
			$('#menu').removeClass('icon-bars').addClass('icon-close');
			$('.navegacion .menu').css({'left':'0px'});
			$('.navegacion').css({'width':'auto','background':'rgba(0,0,0,.3)'});

		}else{
			$('#menu').removeClass('icon-close').addClass('icon-bars');
			$('.navegacion .menu').css({'left':'-320px'});
			$('.navegacion .submenu').css({'left':'-320px'});
			$('.navegacion').css({'width':'0%','background':'rgba(0,0,0,.0)'});
		}

	});

	// mostrar submenu

	$('.navegacion .menu > .item-submenu a').click(function(){
		var posicionMenu = $(this).parent().attr('menu');
		console.log(posicionMenu);
		$('.item-submenu[menu='+posicionMenu+'] .submenu').css({'left':'0px'});

	});

		// ocultandosubmenu

		$('.navegacion .submenu li.go-back').click(function(){
			$(this).parent().css({'left':'-320px'})
		});


	


    // tabla de  funciones1

    $(document).on('click','.delete', function(){
    var row = $(this);

    swal({
      title: "Eliminar?",
      text: "Esta seguro que desea eliminar el registro!",
      type: "warning",
      showCancelButton: true,
      confirmButtonColor: "#DD6B55",
      confirmButtonText: "Si, Eliminar!",
      cancelButtonText: "No, Cancelar!",
      closeOnConfirm: false,
      closeOnCancel: false
    },
    function(isConfirm){
      if (isConfirm) {
        row.parent().parent().remove();
        swal("Eliminado!", "Su registro ha sido eliminado :)", "success");
      } else {
        swal("Cancelar", "Su eliminacio ha sido cancelada :(", "error");
      }
    });
  });

  $(document).on('click', '.clone', function(){

    var tbody = $('#tbody');
    var row = $(this);

    swal({
      title: "Duplicar?",
      text: "Esta opcion le permite duplicar un registro!",
      type: "warning",
      showCancelButton: true,
      confirmButtonColor: "#DD6B55",
      confirmButtonText: "Si, Duplicar!",
      cancelButtonText: "No, Duplicar!",
      closeOnConfirm: false,
      closeOnCancel: false
    },
    function(isConfirm){
      if (isConfirm) {
        row.parent().parent().clone().appendTo(tbody);
        swal("Duplicar!", "Su Registro a sido Duplicado. :)", "success");

      } else {
        swal("Cancelar", " El registro no fue Duplicado :(", "error");
      }
    });
  });

  $(document).on('click', '.add', function(){
    var tbody = $('#tbody');

    tbody.append(
      "<tr>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+
      "<td><button class=\"btn btn-xs btn-success save\"><i class=\"icon-save\"></i></button></td>"+
      "</tr>");

    });

    $(document).on('click', '.save', function(){
      var parent = $(this).parent().parent();
      var tdName = parent.children("td:nth-child(1)");
      var tdPhone = parent.children("td:nth-child(2)");
      var tdEmail = parent.children("td:nth-child(3)");
      var tdButtons = parent.children("td:nth-child(4)");
      tdName.html(tdName.children("input[type=text]").val());
      tdPhone.html(tdPhone.children("input[type=text]").val());
      tdEmail.html(tdEmail.children("input[type=text]").val());
      tdButtons.html(
        "<button class=\"btn btn-xs btn-danger delete\"><i style='font-size: 20px' class=\"icon-trash-o\"></i></button>" + " " +
        "<button class=\"btn btn-xs btn-info edit\"><i class=\"icon-pencil\"></i></button>"+ " " +
        "<button class=\"btn btn-xs btn-warning clone\"><i class=\"icon-copy\"></i></button>" + " " +
        "<button class=\"btn btn-xs btn-success add\"><i class=\"icon-plus-circle\"></i></button>"
      );
    });

    $(document).on('click', '.edit', function(){
      var par = $(this).parent().parent(); //trAKDAKLDJ
      var tdName = par.children("td:nth-child(1)");
      var tdPhone = par.children("td:nth-child(2)");
      var tdEmail = par.children("td:nth-child(3)");
      var tdButtons = par.children("td:nth-child(4)");

      tdName.html("<input type='text' id='txtName' value='"+tdName.html()+"'/>");
      tdPhone.html("<input type='text' id='txtPhone' value='"+tdPhone.html()+"'/>");
      tdEmail.html("<input type='text' id='txtEmail' value='"+tdEmail.html()+"'/>");
      tdButtons.html("<button class=\"btn btn-xs btn-success save\"><i class=\"icon-save\"></i></button></td>");
    })



    // tabla 2 de funciones 


    

    $(document).on('click','.eliminar', function(){
    var row = $(this);

    swal({
      title: "Eliminar?",
      text: "Esta seguro que desea eliminar el registro!",
      type: "warning",
      showCancelButton: true,
      confirmButtonColor: "#DD6B55",
      confirmButtonText: "Si, Eliminar!",
      cancelButtonText: "No, Cancelar!",
      closeOnConfirm: false,
      closeOnCancel: false
    },
    function(isConfirm){
      if (isConfirm) {
        row.parent().parent().remove();
        swal("Eliminado!", "Su registro ha sido eliminado :)", "success");
      } else {
        swal("Cancelar", "Su eliminacio ha sido cancelada :(", "error");
      }
    });
  });

  $(document).on('click', '.duplicar', function(){

    var tbody = $('#tbody1');
    var row = $(this);

    swal({
      title: "Duplicar?",
      text: "Esta opcion le permite duplicar un registro!",
      type: "warning",
      showCancelButton: true,
      confirmButtonColor: "#DD6B55",
      confirmButtonText: "Si, Duplicar!",
      cancelButtonText: "No, Duplicar!",
      closeOnConfirm: false,
      closeOnCancel: false
    },
    function(isConfirm){
      if (isConfirm) {
        row.parent().parent().clone().appendTo(tbody1);
        swal("Duplicar!", "Su Registro a sido Duplicado. :)", "success");

      } else {
        swal("Cancelar", " El registro no fue Duplicado :(", "error");
      }
    });
  });

  $(document).on('click', '.adicionar', function(){
    var tbody1 = $('#tbody1');

    tbody1.append(
      "<tr>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+
      "<td><button class=\"btn btn-xs btn-success save\"><i class=\"icon-save\"></i></button></td>"+
      "</tr>");

    });

    $(document).on('click', '.guardar', function(){
      var parent = $(this).parent();
      var tdName = parent.children("td:nth-child(1)");
      var tdPhone = parent.children("td:nth-child(2)");
      var tdEmail = parent.children("td:nth-child(3)");
      var tdButtons = parent.children("td:nth-child(4)");

      tdName.html(tdName.children("input[type=text]").val());
      tdPhone.html(tdPhone.children("input[type=text]").val());
      tdEmail.html(tdEmail.children("input[type=text]").val());
      tdButtons.html(
        "<button class=\"btn btn-xs btn-danger eliminar\"><i style='font-size: 20px' class=\"icon-trash-o\"></i></button>" + " " +
        "<button class=\"btn btn-xs btn-info editar\"><i class=\"icon-pencil\"></i></button>"+ " " +
        "<button class=\"btn btn-xs btn-warning duplicar\"><i class=\"icon-copy\"></i></button>" + " " +
        "<button class=\"btn btn-xs btn-success adicionar\"><i class=\"icon-plus-circle\"></i></button>"
      );
    });

    $(document).on('click', '.editar', function(){
      var par = $(this).parent().parent(); //trAKDAKLDJ
      var tdName = par.children("td:nth-child(1)");
      var tdPhone = par.children("td:nth-child(2)");
      var tdEmail = par.children("td:nth-child(3)");
      var tdButtons = par.children("td:nth-child(4)");

      tdName.html("<input type='text' id='txtName' value='"+tdName.html()+"'/>");
      tdPhone.html("<input type='text' id='txtPhone' value='"+tdPhone.html()+"'/>");
      tdEmail.html("<input type='text' id='txtEmail' value='"+tdEmail.html()+"'/>");
      tdButtons.html("<button class=\"btn btn-xs btn-success guardar\"><i class=\"icon-save\"></i></button></td>");
    })



    







});


