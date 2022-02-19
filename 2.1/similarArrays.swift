func areSimilar(a:[Int], b:[Int]) -> Bool {
    if a == b{//If the arrays are equal
        return true// ...they are similar
    }else{//If they aren't, we can swap one pair of elements in one of the arrays
        //The elements will be the first two inequalitys between the two arrays
        var numDifferences=0
        var indexFirstDifference=0
        var indexSecondDifference=0
        for (index, elementA) in a.enumerated(){
            if elementA != b[index]{
                if numDifferences==0{
                    indexFirstDifference=index
                    numDifferences+=1
                }else{
                    indexSecondDifference=index
                    break
                }
            } 
        }
        //we swap the elements in one of the arrays
        var mutatedB = b
        let aux = mutatedB[indexFirstDifference]
        mutatedB[indexFirstDifference]=mutatedB[indexSecondDifference]
        mutatedB[indexSecondDifference]=aux
        //If after that a and b are equals, they are similar and return true, if they aren't, they aren't similar
        return a==mutatedB
    }
}
func areElementsFrom1to1000(array:[Int], arrayName:String)-> Bool {
    var aux=0
    for element in array{
        if (0 >= element || element > 1000) {
            print("All the elements in the array \(arrayName) a must be from 1 to 1000")
            break;
        }else{
            aux+=1
        }
    }
    if  aux == array.count {
        return true
    }else{
        return false
    }
}
//[input] array.integer a
var a:[Int]=[1, 2, 3]
//[input] array.integer b
var b:[Int]=[2, 1, 3]
if (a.count < 3 || a.count > 100000) {// Guaranteed constraints: 3 ≤ a.length ≤ 10^5
    print("The array a must have from 3 to 100000 element")
}else if(a.count != b.count){//Guaranteed constraints: b.length = a.length
    print("The array b must have the same lenght that the array a")
}else{
    if areElementsFrom1to1000(array: a, arrayName: "a"){// Guaranteed constraints: 1 ≤ a[i] ≤ 1000
        if areElementsFrom1to1000(array: b, arrayName: "b"){// Guaranteed constraints: 1 ≤ b[i] ≤ 1000
            print(areSimilar(a: a, b: b))
        }
    } 
}