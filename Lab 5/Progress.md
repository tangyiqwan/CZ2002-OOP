### Questions

1. Is enum printing out numbers ok? yes

2. warning: delete called on 'Animal' that is abstract but has non-virtual destructor [-Wdelete-abstract-non-virtual-dtor]
    delete animalPtr; // Need to delete cos it's using the heap
    ^

(no warning on other ides)