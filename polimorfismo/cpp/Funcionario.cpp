// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Funcionario.hpp"
#include <iostream>

using namespace std;

Funcionario::Funcionario()
{

}

string Funcionario::getNome()
{
    return nome;
}

void Funcionario::setNome(string n)
{
    nome = n;
}

float Funcionario::calcularSalarioFinal()
{

}