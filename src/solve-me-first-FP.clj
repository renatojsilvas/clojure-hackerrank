(ns solve-me-first-FP)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; Hacker Rank Challenges: Solve Me First FP
; https://www.hackerrank.com/challenges/fp-solve-me-first/problem
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn solveMeFirst [x y]
  (+ x y))


(def a (read-line))
(def b (read-line))

(prn (solveMeFirst (Integer/parseInt a) (Integer/parseInt b)))