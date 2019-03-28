// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#ifndef _FreeLancer_H
#define _FreeLancer_H

#include "Funcionario.hpp"
//#include <string>

using namespace std;

class FreeLancer: public Funcionario
{
private:
    int diasTrabalhados;
    float valorDia;

public:
    FreeLancer();
    int getDiasTrabalhados();
    void setDiasTrabalhados(int d);
    float getValorDia();
    void setValorDia(float v);
    float calcularSalarioFinal();
};

#endif