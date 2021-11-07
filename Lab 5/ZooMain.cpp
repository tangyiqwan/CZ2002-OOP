#include <iostream>
#include <string>
#include "animal.h"
#include "childAnimal.h"
using namespace std ;


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
