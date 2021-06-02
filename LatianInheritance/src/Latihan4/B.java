/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Lenovo
 */
class B extends A
{
private int b;
public void SetB (int nilai)
{
    b = nilai;
}
public int getB()
{
    return b;
}

public void tampilkanNilai()
{
    super.tampilkanNilai();
    System.out.println("Nilai b : "+getB());
}
}
