(ns course.lesson01)
;That function just print a message in the screen
(defn   my-print-message
  "That function just print a message in the screen"
  []
  (println "Hellow World"))

;Is a good practice in clojure define declartives names in functions
(defn ten-percent-of
  "return 10% value of the paramenter"
  [value]
  (* value 0.10))

;That function apply 10% of decount in the parameter
(defn minus-ten-percent-of
  "subtract of the value 10% of itselt"
  [value]
  (- value (ten-percent-of value)))