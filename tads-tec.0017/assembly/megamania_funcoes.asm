.text

main: 	lui $9, 0x1000 #$9 <= 0x10000000 //Início da memória reservada à escrita pra mostrar na tela
	add $18, $9, $0 #cópia do $9 pra usar no futuro
	
	















# Rotina para imprimir uma sequencia de bits na tela
#======================================
# Parametros de entrada
# $10 contem a cor
# $11 contem a posicao da memoria de inicio
# $12 contem a quantidade inteira de bits que devo preencher na escrita, partindo do início
#--------------------------------------
# Parametro de saida
# nada

pintar:	beq $12, $0, fimpintar
	sw $10, 0($9)
	
	addi $9, $9, 4
	
	addi $12, $12, -4
	
fimpintar:	jr $31