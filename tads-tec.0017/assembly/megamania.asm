.text
main:	lui $9, 0x1000 #$9 <= 0x10000000
	lui $10, 0x0000 #preto
	addi $11, $0, 11264

fillpreto:  beq $11, $0, fimpreto
              
       	sw $10, 0($9)
       	addi $9, $9, 4

       	addi $11, $11, -1
       	j fillpreto
fimpreto: lui $10, 0x8080
	ori $10, $10, 0x8080 #cinza
	addi $11, $0, 4096
fillcinza: beq $11, $0, fimcinza
	sw $10, 0($9)
       	addi $9, $9, 4

       	addi $11, $11, -1
	j fillcinza
fimcinza: lui $10, 0x0000
	addi $11, $0, 1024
fillpretorestante: beq $11, $0, fimpretorestante
	sw $10, 0($9)
	addi $9, $9, 4
	
	addi $11, $11, -1
	j fillpretorestante
	
fimpretorestante: nop

