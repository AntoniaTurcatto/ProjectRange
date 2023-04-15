fun main() {
    //1 - Crie um range de números de 1 a 10 e imprima cada número:
    for(i in 1 .. 10){
        if(i<10) {
            print("$i,")
        } else {
            print("$i \n")
        }
    }

    //2 - Crie um range de letras de 'a' a 'z' e imprima cada letra:
    for(letra:Char in 'a'..'z'){
        if(letra<'z'){
        print("$letra-")
        } else {
            print("$letra\n")
        }
    }

    //3-Crie um range de números de 1 a 100 e imprima apenas os números pares:
    for(i in 1..100){
        if(i%2==0){
            if(i<100){
                print("$i,")
            }else{
                print(i)
            }
        }
    }
}