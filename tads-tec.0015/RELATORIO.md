
# Relatório técnico da implementação e funcionamento do *Array* Dinâmico

#### IFRN - CNAT  - DIATINF - TADS

#### Disciplina: Algoritmos

#### Professor: Jorgiano Vidal

#### Aluno: Daniel Souza Affonso Ferreira

##### Contextualização sobre a estrutura implementada

Para resolver o problema da necessidade crescente de aumento na capacidade de um array, foi implementado uma estrutura de dados conhecida como Array list.

O Array List implementado cresce de forma geométrica, sempre dobrando o seu tamanho ao atingir a sua capacidade máxima.

A maioria das inserções nesta estrutura de dados possuem tempo constante, menos aquelas que exigem que o array cresça para suporta a inserção. Isso pode ser melhor visualizado nesta imagem, onde as inserções que fazem com que o array dobre de tamanho possuem uma tartaruga ao lado, para mostrar que não seguem um tempo constante.

![Exemplo array dinâmico](https://upload.wikimedia.org/wikipedia/commons/3/31/Dynamic_array.svg)

##### Lista de funções implementadas:

- [Função *ali_realoc*](#ali_realoc)

- [Função *ali_find*](#ali_find)

- [Função *ali_insert_at*](#ali_insert_at)

- [Função *ali_remove_from*](#ali_remove_from)

- [Função *ali_capacity*](#ali_capacity)

- [Função *ali_percent_occupied*](#ali_percent_occupied)

  ---

##### Implementação das funções

###### *ali_realoc*

```c
/* Increase capacity size of the array_list_int internal storage */
int ali_realloc(array_list_int ali){
  ali->a = (int*) realloc(ali->a, sizeof(int)*ali->capacity*2);
  if (!ali->a) return 0; /* Realloc could not allocate new memory */

  ali->capacity*=2;

  return 1; /* Realloc could allocate new memory */
}
```

Tempo de execução da função: Θ(n)

###### *ali_find*

```c
/* Get the index of 'element'. */
int ali_find(array_list_int ali, int element){
  int i = 0;
  for (i = 0; i < ali->size; i++)
    if (ali->a[i] == element)
      return i;
  return -1;
}
```

Tempo de execução da função: Θ(n)

###### *ali_insert_at*

```c
/* Inserts int 'value' at int 'index'. */
int ali_insert_at(array_list_int ali, int index, int value){
  if(index >= ali->capacity) return 0;
  ali->a[index] = value;
  return 1;
}
```

Tempo de execução da função: Θ(1)

###### *ali_remove_from*

```c
/* Removes a value from int 'index'. */
int ali_remove_from(array_list_int ali, int index){
  if (index >= ali->capacity) return 0;

  int moves = ali->size - index - 1;
  int i = 0;
  if (moves > 0)
      do
      {
          ++i;
          ali_insert_at(ali, index+i-1, ali->a[i + index]);
      }
      while (i<moves);
  return --(ali->size);
}
```

Tempo de execução da função: Θ(n)

###### *ali_capacity*

```c
unsigned int ali_capacity(array_list_int ali){
  return ali->capacity;
}
```

Tempo de execução da função: Θ(1)

###### *ali_percent_occupied*

```c
/* Check the array_list_int 'ali' occupation, in percent. */
double ali_percent_occupied(array_list_int ali){
  double preenchidos = ali->size;
  return preenchidos / ali->capacity;
}
```

Tempo de execução da função: Θ(1)