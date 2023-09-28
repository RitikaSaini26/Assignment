//Take a sentence as an input and reverse every word in that sentence. a. Example - This is a sunny day > shiT si a ynnus yad.

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); 
function reverseWordsInSentence(sentence) {

   const words = sentence.split(' ');


   const reversedWords = words.map(word => {
       
       return word.split('').reverse().join('');
   });


   const reversedSentence = reversedWords.join(' ');

   return reversedSentence;
}



