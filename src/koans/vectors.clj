(meditations
  "You can use vectors in clojure to create an 'Array' like structure"
  (= 1 (count [42]))

  "You can create a vector in several ways"
  (= [] (vec nil))

  "And populate it in either of these ways"
  (= [1] (vec '(1)))

  "There is another way as well"
  (= [nil] (vector nil))

  "But you can populate it with any number of elements at once"
  (= [1 2] (vec '(1 2)))

  "And add to it as well"
  (= (conj [] 333) (conj (vec nil) 333))

  "You can get the first element of a vector like so"
  (= ([:peanut :butter :and :jelly] 0) (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  (= ([:peanut :butter :and :jelly] 3) (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  (= ([:peanut :butter :and :jelly] 3) (nth [:peanut :butter :and :jelly] 3))

  "You can also slice a vector"
  (= (subvec [:peanut :butter :and :jelly] 1 3) (subvec [:peanut :butter :and :jelly] 1 3)) 

  "Equality with collections is in terms of values"
  (= (list 1 2 3) (vector 1 2 3)))
