(ns course.lesson05)

(def estoque-string {"Mochile"  10
                     "Camiseta" 5})

(def estoque {:Mochile  10
              :Camiseta 5})

(defn tira-um
  [valor]
  (println "subtraindo 1 de " valor)
  (- valor 1))

(println estoque-string)

;count the map numbers
(println "temos" (count estoque-string) "estoque")

;val returns just the values of the map
(println " only values" (vals estoque-string))

;assoc put a new elememt in the map
(println "New mao with another keyword" (assoc estoque :cadeira 3))

;original map
(println "orginal map" estoque)

;chnage the map value
(println (assoc estoque :Mochile 1))

;using upddate function in the map
(println "update sample" (update estoque :Mochile inc))

;using update with my function
(println " tira um" (update estoque :Mochile tira-um))

;usind update with lambda
(println "Lambda -3" (update estoque :Mochile #(- % 3)))

;usinf dissoc to remove item from map
(println "dissoc func" (dissoc estoque :Mochile ))
