.text

main: 	lui $9, 0x1000 #$9 <= 0x10000000 //Início da memória reservada à escrita pra mostrar na tela
	add $18, $9, $0 #cópia do $9 pra usar no futuro
	
	lui $10, 0x0000 #preto
	
	addi $12, $0, 32768
	
	jal pintar
	
	jal desenharnave
	
	jal desenharbarraenergia
	j fim

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
	add $17, $0, $31
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
	
	
	jr $17

# Rotina para imprimir a nave na tela.
#======================================
# Parametros de entrada
# nada
#--------------------------------------
# Parametro de saida
# nada

desenharbarraenergia:
	lui $10, 0x8080
	ori $10, $10, 0x8080 #cinza
	add $17, $0, $31
	
	#inicio desenha parte cinza
	addi $9, $18, 21508
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 22020
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 22532
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 23044
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 23556
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 24068
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 24580
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 25092
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 25604
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 26116
	addi $12, $0, 508
	jal pintar
	
	addi $9, $18, 26628
	addi $12, $0, 508
	jal pintar
	#fim desenha parte cinza
	
	#inicio desenhar ENERGY
	lui $10, 0x0000 #preto

	#escrever E
	addi $9, $18, 22568
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 23080
	addi $12, $0, 4
	jal pintar

	addi $9, $18, 23592
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 24104
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24616
	addi $12, $0, 12
	jal pintar
	#fim escrever E
	#escrever N
	addi $9, $18, 22588
	addi $12, $0, 4
	jal pintar

	addi $9, $18, 22600
	addi $12, $0, 4
	jal pintar
		
	addi $9, $18, 23100
	addi $12, $0, 8
	jal pintar

	addi $9, $18, 23112
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23592
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 23612
	addi $12, $0, 16
	jal pintar
	
	addi $9, $18, 24124
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24132
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 24636
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24648
	addi $12, $0, 4
	jal pintar
	#fim escrever N
	#escrever E
	addi $9, $18, 22612
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 23124
	addi $12, $0, 4
	jal pintar

	addi $9, $18, 23636
	addi $12, $0, 12
	jal pintar
	
	addi $9, $18, 24148
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24660
	addi $12, $0, 12
	jal pintar
	#fim escrever E
	#escrever R
	addi $9, $18, 22636
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 23148
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23156
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23660
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23668
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24172
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 24684
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24692
	addi $12, $0, 4
	jal pintar
	#fim escrever R
	#escrever G
	addi $9, $18, 22660
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 23172
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23684
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23692
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24196
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24204
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24708
	addi $12, $0, 12
	jal pintar
	#fim escrever G
	#escrever Y
	addi $9, $18, 22672
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 22684
	addi $12, $0, 8
	jal pintar
	
	addi $9, $18, 23188
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23196
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 23704
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24216
	addi $12, $0, 4
	jal pintar
	
	addi $9, $18, 24728
	addi $12, $0, 4
	jal pintar
	#fim escrever Y

	#fim desenhar ENERGY
	
	#inicio desenhar vida
	
	#fim desenhar vida
	
	jr $17

fim:
	nop
