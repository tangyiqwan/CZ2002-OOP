#include <iostream>
#include <string>
using namespace std ;
enum COLOR { Green, Blue, White, Black, Brown } ;
class Animal {     // This becomes an abstract class when there is at least one abstract method
    public :
        Animal() : _name("unknown") {   // this initialises _name = "unknown"
            //cout << "constructing Animal object "<< _name << endl ;
        }  
        Animal(string n, COLOR c) : _name(n), _color(c) {
            cout << "Name is " << _name << ", color is " << _color << endl;
        }
        ~Animal() {
            cout << "destructing Animal object "<< _name << endl ;
        }  
        virtual void speak() const {    // method promises not to alter any members of the class
            cout << "Animal speaks "<< endl ;
        }  
        virtual void move() const = 0;  // abstract method

    private :
        string _name;  
        COLOR _color;   // the properties are here
};

class Mammal : public Animal {
    public:
        // Animal(string n, COLOR c) {}
        Mammal() : Animal() {}
        Mammal(string n, COLOR c) : Animal(n, c) {  // Call the base-class constructor to initialise 
            cout << "MAMMAL constructor" << endl;
        }
        ~Mammal() {
            cout << "destructing Mammal object " << endl ; // Animal::_name
        }  
        void eat() const {
            cout << "Mammal eat " << endl ;
        } 
        void move() const { // must implement this abstract method to prevent Mammal becoming abstract
            cout << "Mammal move" << endl;
        }

};




