// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Funcionario.hpp"
#include <iostream>

using namespace std;

Funcionario::Funcionario()
{
	cout << "\nExecutando construtor da classe Funcionario";
}

float Funcionario::getSalario()
{
    return salario;
}

void Funcionario::setSalario(float s)
{
    salario = s;
}

string Funcionario::getCargo()
{
    return cargo;
}

void Funcionario::setCargo(string c)
{
    cargo = c;
}