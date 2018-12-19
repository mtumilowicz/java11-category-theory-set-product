# java11-category-theory-set-product

_Reference_: https://bartoszmilewski.com/2015/01/07/products-and-coproducts/  
_Reference_: https://en.wikiversity.org/wiki/Introduction_to_Category_Theory/Products_and_Coproducts#Examples

# definition
The **product** of objects `A` and `B` is an object `P` together with 
the morphisms (projections):
* `fst :: P -> A`
* `snd :: P -> B` 

that satisfy the following 
**universal property**:
* If `X` is any object in the category, and 
`f1 :: X -> A` and `f2 :: X -> B` are any morphisms, then 
there exists a unique morphism `g :: X -> P` such that:
    * `f1 = fst . g`
    * `f2 = snd . g`

So the **universal property** has two parts:
1. There exists a morphism `g`.
1. The morphism `g` is unique.

# cartesian product of sets is a product in the Sets category
We will check universal property (sketch of proof):

let `g(x) = (f1(x), f2(x))`

1. existence
    ```
    (fst . g)(x) = fst(g(x)) = fst((f1(x), f2(x))) = f1(x)
    (snd . g)(x) = snd(g(x)) = snd((f1(x), f2(x))) = f2(x) 
    ```
1. uniqueness

    suppose that `h` is another function that satisfies (1.)
    ```
    f1(x) = (fst . h)(x) = fst(h(x)) = fst((a,b)) = a
    f2(x) = (snd . h)(x) = snd(h(x)) = snd((a,b)) = b
    ```
    so
    ```
    h(x) = (a, b) = (f1(x), f2(x)) = g(x)
    ```
# project description
Basic implementation of product will be
```
final class Product<T1, T2> {

    final T1 fst;

    final T2 snd;

    Product(T1 fst, T2 snd) {
        this.fst = fst;
        this.snd = snd;
    }
}
```
note that in **vavr** we have more complex products:
* https://github.com/vavr-io/vavr/blob/master/vavr/src-gen/main/java/io/vavr/Tuple2.java
* tuples provided by vavr could have up to 7 projections