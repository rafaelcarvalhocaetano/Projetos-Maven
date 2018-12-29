$('.js-atualizar-status').on('click', (event) => {
	event.preventDefault();
	//console.log('clicou');
	
	let botaoReceber = $(event.currentTarget);
	let urlLink = botaoReceber.attr('href');
	
	let response = $.ajax({
		url: urlLink,
		type:'PUT'
	});
	
	response.done(function(e) {
		var codigoTitulo = botaoReceber.data('codigo');
		$('[data-role=' + codigoTitulo + ']').html('<span class="label label-success">' + e + '</span>');
		botaoReceber.hide();
	});
	
	response.fail(function(e) {
		console.log(e);
		alert('Erro recebendo cobrança');
	});
});

