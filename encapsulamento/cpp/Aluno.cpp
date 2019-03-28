// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Aluno.hpp"
#include <string>

Aluno::Aluno()
{
    dataMatricula = __DATE__;
}

void Aluno::setNome(string n)
{
    nome = n;
}

string Aluno::getNome()
{
    return nome;
}

void Aluno::setIdade(int i)
{
    idade = i;
    defineTurma();
}

int Aluno::getIdade()
{
    return idade;
}

string Aluno::getTurma()
{
    return turma;
}

string Aluno::getDataMatricula()
{
    return dataMatricula;
}

void Aluno::defineTurma()
{
    if (idade < 18)
        turma = "Adolescente";
    else if (idade < 40)
        turma = "Jovem";
    else if (idade < 60)
        turma = "Adulto";
    else
        turma = "Idoso";
}