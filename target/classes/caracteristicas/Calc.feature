# language: pt
@CalcRunner
Funcionalidade: Calc
	Como usuario entrar com dois valores
	com o objetivo de obter um resultado
	
	Cenario: Somar
	Dado que eu escolha somar
	Quando eu preencho o primeiro número com o valor '1'
	E eu preencho o segundo número com '1'
	Então eu devo ver o resultado como '2'
