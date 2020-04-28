#language: pt
Funcionalidade: Validar API BrasilPrev 

	Esquema do Cenario: Consulta de usuario com sucesso 
	
    Dado que eu adiciono o endpoint "<endPoint>"
    E adiciono o ddd com o valor
    Quando adiciono o telefone com o valor
    Entao eu visualizo a mensagem sucesso
    
    Exemplos:
	|endPoint             |
	|http://localhost:8080|
	
	Esquema do Cenario: Consulta de usuario com falha endpoint 
	
	Dado que eu adiciono o endpoint "<endPoint>" na porta invalida 
	E adiciono ddd com "<ddd>" o valor que nao exista e "<numero>" celular valido 
	Quando adiciono o telefone com o valor "<numero>" 
	Entao eu visualizo a mensagem sucesso 
	
	Exemplos: 
	|endPoint             | ddd  | numero  |
	|http://localhost:8070| 11/  |948801405|
	
	Esquema do Cenario: Consulta de usuario com sucesso
	
	Dado que eu adiciono o endpoint "<endPoint>" na porta invalida 
	E adiciono ddd com "<ddd>" o valor que exista e o celular "<numero>" valido 
	Entao eu visualizo a mensagem sucesso 
	
	Exemplos: 
	|endPoint             | ddd  | numero  |
	|http://localhost:8070| 11/  |948801405|
	
	Esquema do Cenario: Cadastro de usuario 
	
	Dado o endpoint "<endPoint>"
	E adiciono um telefone e um cpf 
	Quando eu enviar um post para a API 
	Entao eu recebo um status code de sucesso
	
	Exemplos: 
	|endPoint                     |
	|http://localhost:8080/pessoas|
	
	Esquema do Cenario: Cadastro de usuario 
	
	Dado uum cadastro endpoint "<endPoint>"
	E adiciono um telefone "<telefone>" e um cpf "<cpf>"
	Quando eu enviar um post para a API 
	Entao eu recebo um status code de sucesso
	
	Exemplos: 
	|endPoint           		  | telefone | cpf      |
	|http://localhost:8080/pessoas|948801405 |06598677459|
	