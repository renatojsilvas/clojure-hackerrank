(ns hello-world-n-times)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; Hacker Rank Challenges: Hello World N times
; https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; dotimes is a function that has no return. That is perfect for side effecting functions.
(defn hello_word_n_times [n] (dotimes [_ n] (println "Hello World")))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
