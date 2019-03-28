// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Pessoa.hpp"
#include <iostream>

using namespace std;

Pessoa::Pessoa()
{
	cout << "\nExecutando construtor da classe Pessoa";
}

string Pessoa::getNome()
{
    return nome;
}

void Pessoa::setNome(string n)
{
    nome = n;
}

string Pessoa::getEndereco()
{
    return endereco;
}

void Pessoa::setEndereco(string e)
{
    endereco = e;
}

string Pessoa::getDataNascimento()
{
    return dataNascimento;
}

void Pessoa::setDataNascimento(string d)
{
    dataNascimento = d;
}