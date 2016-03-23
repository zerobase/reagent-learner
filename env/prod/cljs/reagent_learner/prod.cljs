(ns reagent-learner.prod
  (:require [reagent-learner.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
