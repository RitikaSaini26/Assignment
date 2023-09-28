//B. Perform sorting of an array in descending order.
var numbers = [5, 2, 9, 1, 5, 6];

function sortDescending(a, b) {
  return b - a;
}

numbers.sort(sortDescending);

console.log("Sorted Array (Descending): " + numbers);
