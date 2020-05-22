#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <conio.h>
#include "ConsoleColor.h"

using namespace std;


bool comprobarTamanio(int filas){
	if (filas>33){
		return true;
	}
	return false;
}
	bool comprobarTamanioImpar(int filas){
		if(filas%2==0){
			return true;
		}
		return false;
	}
		
		void calculoDesviacion(int);
		void mostrarMatriz();
		
		int filas;
		int numeros;
		double matriz [33][33];
	
		
		int main(int argc, char *argv[]) {
			//Lectura Del TXT
			ifstream txt;
			
			txt.open("datos.txt");
			if (!txt) {
				cout << "No Se Logro Abrir El Archivo txt, Revise Que Exista o No Este Corrupto!";
				exit(1); 
			}
			
			
			
			txt >> filas;
			txt >> numeros;
			
			
			
			
			
			if(comprobarTamanio(filas)){
				cout<<green<<"El Tamaño De La Matriz Es Mayor A 33 x 33"<<endl;
				
				return 1;
			}
			if(comprobarTamanioImpar(filas)){
				cout<<"Las Filas Y Columnas Deben Ser Un Valor Entero Impar!"<<endl;
				return 1;
			}
			
			//CARGO LA MATRIZ CON LOS VALORES ALMACENADOS EN EL ARCHIVO TXT
			cout<<"--------------------------------------------------------------------------"<<endl;
			
			cout<<"Se Ha Cargado Una Matriz De "<<filas<<" Filas X  "<<filas<<" Columnas!"<<endl;
			cout<<"--------------------------------------------------------------------------"<<endl;
			
			for (int i=0; i < filas; i++){
				for (int j=0; j < filas; j++){
					
					
					txt>> matriz[i][j]; 
					
				}
				
			}	
		   

					
					
					
					
			
			
			//LLAMO A LAS FUNCIONES QUE MUESTRAN LA MATRIZ Y CALCULAN SU DESVIACION ESTANDAR
			mostrarMatriz();
			calculoDesviacion(filas);
			
			return 0;
		}
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		void mostrarMatriz(){
			//MUESTRO LA MATRIZ POR PANTALLA
			int mitad = filas/2;
			for(int i = 0; i <filas; i++){
				for(int j =0 ; j < filas; j++){
					
					if((i+j)>=(mitad*2) &&  (j-i)<= 0){
					cout<<red<<setw(5)<<matriz[i][j]<<"   ";
					}else{
					cout<<white<<setw(5)<<matriz[i][j]<<"   ";
					}
				}
				cout<<endl<<endl<<endl;
			}
			
			
		}
			
			void calculoDesviacion(int fila){
				//Variables
				double varianza = 0;
				double desviacionEstandarPoblacion = 0;
				double desviacionEstandarMuestral = 0;
				int mitad = filas/2;
				int cantidadElementos = 0;
				
				
				
				//CALCULO DE PROMEDIO/MEDIA ARITMETICA
				double suma = 0;
				for(int i = 0; i<filas; i++){//filas
					for(int j = 0; j<filas; j++){//columnas
						if((i+j)>=(mitad*2) &&  (j-i)<= 0){
							suma += matriz[i][j];
							cantidadElementos++;
							
						}
						
					}
					cout<<endl;
				}
				
				double promedio = suma/cantidadElementos;
				
				
				
				
				
				
				
				//CALCULO DE VARIANZA POBLACIONAL Y MUESTRAL
				for(int i = 0; i < filas; i ++){
					for(int j = 0; j < filas; j++){
						if((i+j)>=(mitad*2) &&  (j-i)<= 0){
							varianza += pow((matriz[i][j]- promedio), 2);
							
						}
						
					}
					
				}
				double varianzaPoblacion = varianza/cantidadElementos;
				double varianzaMuestral = varianza/(cantidadElementos-1);
				
				//CALCULO DE DESVIACION ESTANDAR POBLACIONAL Y MUESTRAL
				desviacionEstandarPoblacion = sqrt(varianza/cantidadElementos);
				desviacionEstandarMuestral = sqrt(varianza/(cantidadElementos-1));
				
				
				cout<<white<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Tamaño De La Muestra = >> "<<cantidadElementos<<" <<  Para La Poblacion Y >> "<<cantidadElementos-1<<" <<  Para La Muestra"<<endl;
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Media Aritmetica ( "<<suma<<" / "<<cantidadElementos<<" ) = "<<promedio<<endl;
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Varianza Poblacional = "<<varianzaPoblacion<<endl;
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Varianza Muestral = "<<varianzaMuestral<<endl;
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Desviacion Estandar Poblacional  = "<<desviacionEstandarPoblacion<<endl; 
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<"Desviacion Estandar Muestral = "<<desviacionEstandarMuestral<<endl;
				cout<<"------------------------------------------------------------------------------------------------------------"<<endl;
				
				
				
				
				
			}
				
				
				
