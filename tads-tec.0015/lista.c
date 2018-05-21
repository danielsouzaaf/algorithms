#include <stdio.h>
#include <stdlib.h>

#define FIRSTNUMBER 7

typedef struct LL_Int{ 
  int valor; 
  struct LL_Int *proximo; 
}LLI;
 
typedef struct ListaDuplaInt{ 
  LLI *primeiro; 
  LLI *ultimo; 
}LDI;

LLI * inserir_inicio(LLI *inicio, int valor){ /* O(1) */

	LLI *lli = (LLI *)malloc(sizeof(LLI));
	lli->proximo = inicio;
	lli->valor = valor;
	return lli;
}

int buscar(LLI *inicio, int v){ /* O(n) */
	LLI *current = inicio;
	while(current)
	{
		if (current->valor == v)
			return 1;

		current = current->proximo;
	}

	return 0;
}

LLI * mover_maior_fim(LLI *inicio) /* O(n) */
{
	LLI * candidato = inicio;
	LLI * auxiliar = inicio;
	int maior = inicio->valor;
	int indice = 0, parouem;
	while(candidato->proximo) {
		if (maior < candidato->valor) {
			maior = candidato->valor;
			auxiliar = candidato;
			parouem = indice;
		}
		candidato = candidato->proximo;
		++indice;
	}
	
	if (auxiliar == inicio) {
		LLI *lli = (LLI *)malloc(sizeof(LLI));
		lli->proximo = inicio->proximo;
		lli->valor = inicio->valor;
		candidato->proximo = inicio;
		inicio->proximo = NULL;
		return lli;
	}
	
	LLI *savePrevious = inicio;
	
	while(--parouem > 0)
		savePrevious = savePrevious->proximo;

	savePrevious->proximo = auxiliar->proximo;
	candidato->proximo = auxiliar;
	auxiliar->proximo = NULL;
	
	return inicio;
}

int quantidade (LLI *inicio) /* O(n) */
{
	int quantity = 1;
	LLI * atual = inicio;
	while(atual->proximo){
		++quantity;
		atual = atual->proximo;
	}
	
	return quantity;
}

int remover_ultimo(LDI *lista) /* O(n) */
{
		LLI *candidato = lista->primeiro;
		while (candidato->proximo != lista->ultimo)
			candidato = candidato->proximo;
		if(candidato->proximo->proximo == NULL){
			candidato->proximo = NULL;
			lista->ultimo = candidato;
			return 1; /* The last element was successfully removed. */
		}
		
		return 0; /* `remover_ultimo` could not remove the last element. */
}

int ocorrencias(LDI *lista, int v) /* O(n) */
{
	int quantity = 0;
	LLI * atual = lista->inicio;
	
	while(atual->proximo){
		if(atual->valor == v)
			quantity++;
		atual = atual->proximo;
	}
	
	return quantity;
}

void imprimir_lista(LLI *inicio){
	int posicao = 0;
	while(inicio)
		{
			printf("[%d] => %d\n", posicao++,inicio->valor);
			inicio = inicio->proximo;
		}
}

int main(){
	LLI *inicio = (LLI *)malloc(sizeof(LLI));
	int i;
	inicio = inserir_inicio(NULL, FIRSTNUMBER);
	for (i = 2; i <= 20; i++) /* Inserts 20 multiples of seven to start working with.*/
	{
		inicio = inserir_inicio(inicio, FIRSTNUMBER*i);
	}

	inicio = inserir_inicio(inicio, 9878);
	inicio = inserir_inicio(inicio, 5875);

	imprimir_lista(inicio);
	

	printf("CHECAR se 49 está na lista: %d\n", buscar(inicio, 49));

	printf("MOVER O MAIOR PARA O FIM DA LISTA. AQUI VAI COMO FICOU A LISTA DEPOIS DA OPERAÇÃO\n");
	
	printf("quantidade itens na lista: %d\n", quantidade(inicio));

	inicio = mover_maior_fim(inicio);
	imprimir_lista(inicio);

	return 0;
}
