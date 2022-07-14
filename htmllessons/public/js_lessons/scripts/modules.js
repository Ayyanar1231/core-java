class Pizza {
    // constructor
  constructor (toppings = [], customer) {
    // computer instance property
    this.toppings = toppings;
    this.customer = customer;
  }
  // static property
  static extraToppings = ['pepperoni', 'cheese'];
   //  static method
   static sayThanyou () {
    console.log('ThankYou!!!');
  }
  //nonstatic method
  eat () {
    console.log(this.toppings)
    console.log(this.slices)
  }

  // instance property
  slices = 10   // Private field
  // Getter Property
  get length () {
    return this.slices
  }

  set length (value) {
    this.slices = value
  }
}

const myPizza = new Pizza(['onions'], 'Venkat');
console.log(myPizza.toppings);
console.log(myPizza.customer);
console.log(Pizza.extraToppings);
Pizza.sayThanyou();

myPizza.eat()
myPizza.toppings = ['Carrot', 'Almonds', 'Lobster']
console.log(myPizza.toppings);
console.log(myPizza.length)
myPizza.length = 8;
console.log(myPizza.length)
myPizza.slices = 240; // Adding dynamic field slices to my pizza
console.log(myPizza.length)
