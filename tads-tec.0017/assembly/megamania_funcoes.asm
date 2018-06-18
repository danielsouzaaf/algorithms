.text

main: 	lui $9, 0x1000 #$9 <= 0x10000000 //Início da memória reservada à escrita pra mostrar na tela
	add $18, $9, $0 #cópia do $9 pra usar no futuro
	
	lui $10, 0x0000 #preto
	
	addi $12, $0, 32768
	
	jal pintar
	nop
	
	jal desenharnave
	nop

# Rotina para imprimir uma sequencia de bits na tela
#======================================
# Parametros de entrada
# $10 contem a cor
# $9 contem a posicao da memoria de inicio
# $12 contem a quantidade inteira de bits que devo preencher na escrita, partindo do início
#--------------------------------------
# Parametro de saida
# nada

pintar:	beq $12, $0, fimpintar
	sw $10, 0($9)
	
	addi $9, $9, 4
	
	addi $12, $12, -4
	j pintar
fimpintar:	jr $31

# Rotina para imprimir a nave na tela.
#======================================
# Parametros de entrada
# nada
#--------------------------------------
# Parametro de saida
# nada

desenharnave: 
	lui $10, 0x8000
	ori $10, $10, 0x0080
	addi $9, $18, 13476
	addi $12, $0, 4
	jal pintar

	addi $9, $18, 13980
	addi $12, $0, 20
	jal pintar
	
	addi $9, $18, 14496
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 15012
	addi $12, $0, 4
	jal pintar

	addi $9, $18, 15524
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 16024
	addi $12, $0, 28
	jal pintar
	
	addi $9, $18, 16536
	addi $12, $0, 28
	jal pintar
	
	addi $9, $18, 17048
	addi $12, $0, 28
	jal pintar
	
	addi $9, $18, 17560
	addi $12, $0, 28
	jal pintar
	
	addi $9, $18, 18072
	addi $12, $0, 28
	jal pintar
	
	addi $9, $18, 18584
	addi $12, $0, 28
	jal pintar
	
	lui $10, 0x0000 #preto
	
	addi $9, $18, 16028
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 16044
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 16540
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 16556
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 17056
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 17064
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 17564
	addi $12, $0, 20
	jal pintar
	
	addi $9, $18, 18076
	addi $12, $0, 20
	jal pintar
	
	addi $9, $18, 18588
	addi $12, $0, 20
	jal pintar
	
	
	jr $31