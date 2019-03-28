// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#ifndef _Funcionario_H
#define _Funcionario_H

#include "Pessoa.hpp"
#include <string>

using namespace std;

class Funcionario: public Pessoa
{
private:
    float salario;
    string cargo;

public:
    Funcionario();
    float getSalario();
    void setSalario(float s);
    string getCargo();
    void setCargo(string c);
};

#endif