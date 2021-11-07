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

int main() {
    int animal_input = 0, index = 0;

    Mammal *zoo[100];
    cout << "How many animals?" << endl;
    
    while (animal_input != 5) {
        cout << "Select the animal to send to Zoo : (1)  Dog  (2) Cat  (3) Lion  (4) Move all animals  (5) Quit" << endl;
        cout << "Please enter a number:" << endl;
        cin >> animal_input;

        switch (animal_input) {
            case 1:
                zoo[index] = new Dog();
                index++;
                break;
            case 2:
                zoo[index] = new Cat();
                index++;
                break;
            case 3:
                zoo[index] = new Lion();
                index++;
                break;
            case 4:
                for (int i = 0; i < index; i++) {
                    zoo[i]->move();
                    zoo[i]->speak();
                    zoo[i]->eat();
                }
                break;
            default:
                break;
            }
    }
    Mammal l("lyon", White); 
    l.speak() ;
    Dog dog("Hush puppy", Brown, "Harry"); 
    dog.speak() ;
    //dog.move();

    Animal *animalPtr  = new Dog("Lassie", White, "Andy");  
    animalPtr->speak(); // If there's no virtual in "Animal", there will be no overriding
    animalPtr->move();
        
    Dog dogi("Lassie", White, "Andy"); 
    Mammal *aniPtr = &dogi ; 
    Mammal &aniRef = dogi ; 
    Mammal aniVal = dogi ;  // this is a mammal object

    aniPtr->speak() ;
    aniRef.speak() ;
    aniVal.speak() ;
    

    // delete animalPtr; // Need to delete cos it's using the heap
    cout << "Program exiting …. "<< endl ;
    return 0;
}
