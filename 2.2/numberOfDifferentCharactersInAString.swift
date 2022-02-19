func differentSymbolsNaive(s:String) -> Int {
    var repeatedCharacters:[Character]=[];
    for character in s{
        let numberCharacter=repeatedCharacters.filter{
            repeatedCharacter in 
            return repeatedCharacter == character
        }
        if numberCharacter.count==0{
            repeatedCharacters.append(character)
        }
    }
    return repeatedCharacters.count
}
//[input] string s
var s = "cabca"
//Guaranteed constraints: 3 ≤ s.length ≤ 1000
if(3>s.count || s.count>1000){
    print("the string must have from 3 to 1000 characters")
}else{  
    print(differentSymbolsNaive(s:s))
}