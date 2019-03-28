// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#ifndef _Funcionario_H
#define _Funcionario_H

#include <string>

using namespace std;

class Funcionario
{
private:
    string nome;

public:
    Funcionario();
    string getNome();
    void setNome(string n);
    virtual float calcularSalarioFinal();
};

#endif