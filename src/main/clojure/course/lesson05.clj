(ns course.lesson05)

(def estoque-string {"Mochile"  10
                     "Camiseta" 5})

(def estoque {:mochila  10
              :Camiseta 5})

(def pedido {:mochila  {:quantidade 2 :preco 80}
             :Camiseta {:quantidade 3 :preco 40}})

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
(println (assoc estoque :mochila 1))

;using upddate function in the map
(println "update sample" (update estoque :mochila inc))

;using update with my function
(println " tira um" (update estoque :mochila tira-um))

;usind update with lambda
(println "Lambda -3" (update estoque :mochila #(- % 3)))

;usinf dissoc to remove item from map
(println "dissoc func" (dissoc estoque :mochila))

;println enhanced maps
(println "maps" pedido)

;redefing map with a new item
(def pedido (assoc pedido :chaveiro {:quantidade 1 :preco 10}))
(println pedido)

;accees maping as function
(println "map intem value" (pedido :mochila))

;access map item with get function
(println "using get" (get pedido :mochila))

;testing default value of get
(println (get pedido :cadeira))
(println (get pedido :cadeira 0))
(println (get pedido :cadeira {}))

;acessing a map value with keyword
(println (:mochila pedido))

;keyword function with default value
(println (:cadeira pedido))
(println (:cadeira pedido {}))

;accesing a mapa inside another with keywords
(println (:quantidade (:mochila pedido)))

;icrement value item with update-in
(println (update-in pedido [:mochila :quantidade ]  inc))

;sample threading
(-> pedido
    :mochila
    :quantidade
    println)