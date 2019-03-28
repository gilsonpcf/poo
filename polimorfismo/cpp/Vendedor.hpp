// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#ifndef _Vendedor_H
#define _Vendedor_H

#include "Funcionario.hpp"
//#include <string>

using namespace std;

class Vendedor: public Funcionario
{
private:
    float salarioBase;
    float comissao;

public:
    Vendedor();
    float getSalarioBase();
    void setSalarioBase(float s);
    float getComissao();
    void setComissao(float c);
    float calcularSalarioFinal();
};

#endif