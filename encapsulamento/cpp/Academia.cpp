// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Aluno.hpp"
#include <iostream>

using namespace std;

int main()
{
    Aluno a;
    string strAux;
    int intAux;

    cout << "Digite o nome do novo aluno: ";
    cin >> strAux;

    a.setNome(strAux);

    cout << "Digite a idade do novo aluno: ";
    cin >> intAux;

    a.setIdade(intAux);

    cout << "Ficha cadastral do novo aluno";
    cout << "\nNome: " << a.getNome();
    cout << "\nIdade: " << a.getIdade();
    cout << "\nData da matricula: " << a.getDataMatricula();
    cout << "\nTurma: " << a.getTurma();

    return 0;
}