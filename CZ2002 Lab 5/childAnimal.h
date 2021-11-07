#include <iostream>
#include <string>
using namespace std ;

class Dog : public Mammal {
    public:
        // Animal(string n, COLOR c) {}
        Dog() : Mammal() {}
        Dog(string n, COLOR c, string o) : Mammal(n, c) {  // Call the base-class constructor to initialise 
            owner = o;
            cout << "dog constructor" << endl;
        }
        ~Dog() {
            cout << "destructing Dog object " << endl ; // Animal::_name
        }  
        void speak() const {    // override the speak function
            cout << "Woof" << endl ;
        }  
        virtual void move() const {
            cout << "Dog run" << endl;
        }
    private:
        string owner;

};

class Cat : public Mammal {
    public:
        // Animal(string n, COLOR c) {}
        Cat() : Mammal() {}
        Cat(string n, COLOR c, string o) : Mammal(n, c) {  // Call the base-class constructor to initialise 
            owner = o;
            cout << "Cat constructor" << endl;
        }
        ~Cat() {
            cout << "destructing cat object " << endl ; // Animal::_name
        }  
        void speak() const {    // override the speak function
            cout << "Meow" << endl ;
        }  
        void move() const {
            cout << "Cat walk" << endl;
        }
    private:
        string owner;

};

class Lion : public Mammal {
    public:
        // Animal(string n, COLOR c) {}
        Lion() : Mammal() {}
        Lion(string n, COLOR c, string o) : Mammal(n, c) {  // Call the base-class constructor to initialise 
            owner = o;
            cout << "lion constructor" << endl;
        }
        ~Lion() {
            cout << "destructing lion object " << endl ; // Animal::_name
        }  
        void speak() const {    // override the speak function
            cout << "Roar" << endl ;
        }
        void move() const{
            cout << "Lion jump" << endl;
        }
          
    private:
        string owner;

};
