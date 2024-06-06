
function shuffleArray(array) {
  let shuffledArray = [];

  while (array.length) {
    let randomIndex = Math.floor(Math.random() * array.length);
    shuffledArray.push(array[randomIndex]);
    array.splice(randomIndex, 1);
  }

  return shuffledArray;
}

let shuffledArray = shuffleArray(['a', 'b', 'c', 'd', 'e', 'f']);
console.log(shuffledArray); // Output: ['c', 'e', 'f', 'a', 'b', 'd']