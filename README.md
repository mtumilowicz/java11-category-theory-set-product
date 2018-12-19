# java11-category-theory-set-product

_Reference_: https://bartoszmilewski.com/2015/01/07/products-and-coproducts/  
_Reference_: https://en.wikiversity.org/wiki/Introduction_to_Category_Theory/Products_and_Coproducts#Examples

# preface
## definition
The product of objects `A` and `B` is an object `P` together with 
the morphisms:
* `fst :: P -> A`, 
* `snd :: P -> B` 

that satisfy the following 
universal property:
* If `X` is any object in the category, and 
`f1 :: X -> A` and `f2 :: X -> B` are any morphisms, then 
there exists a unique morphism `g :: X -> P` such that:
    * `f1 = fst . g`
    * `f2 = snd . g`

The universal property has two parts:
1. There exists a morphism g.
1. The morphism g is unique.

## summary
A product of two objects `a` and `b` is the object `c` equipped 
with two projections such that for any other object `c’` equipped 
with two projections there is a unique morphism `m` from `c’` to 
`c` that factorizes those projections.

* `m` factorizes `p’` and `q’` means that there exists
morphisms `p` and `q` that:
    ```
    p’ = p . m
    q’ = q . m
    ```