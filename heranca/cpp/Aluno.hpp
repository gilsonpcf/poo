// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#ifndef _Aluno_H
#define _Aluno_H

#include "Pessoa.hpp"
#include <string>

using namespace std;

class Aluno: public Pessoa
{
private:
    string curso;
    string semestre;

public:
    Aluno();
    string getCurso();
    void setCurso(string c);
    string getSemestre();
    void setSemestre(string s);
};

#endif