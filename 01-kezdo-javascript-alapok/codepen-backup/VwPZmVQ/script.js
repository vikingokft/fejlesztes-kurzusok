function printSandwichRecipe(condiment, meat, cheese, vegetable) {
    console.log('1. Fogj két szelet kenyeret.');
    console.log('2. Az egyik szeletre nyomj ' + condiment + '-t.');
    console.log('3. Helyezz a kenyérre két szelet ' + meat + '-t.');
    console.log('4. Rakj rá egy szelet ' + cheese + '-t.');
    console.log('5. Koronázd meg pár szelet/karika/csipet ilyen zöldséggel: ' + vegetable + '.');
    console.log('6. Borítsd be a szendvicset a másik szelet kenyérrel.');
    console.log('7. Jó étvágyat!');
}

printSandwichRecipe('majonéz', 'sonka', 'cheddar', 'paradicsom');