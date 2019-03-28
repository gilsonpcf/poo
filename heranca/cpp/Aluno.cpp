// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Aluno.hpp"
#include <iostream>

using namespace std;

Aluno::Aluno()
{
	cout << "\nExecutando construtor da classe Aluno";
}

string Aluno::getCurso()
{
    return curso;
}

void Aluno::setCurso(string c)
{
    curso = c;
}

string Aluno::getSemestre()
{
    return semestre;
}

void Aluno::setSemestre(string s)
{
    semestre = s;
}