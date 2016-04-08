(ns reagent-learner.cards
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.session :as session]
            [reagent-learner.core :as core])
  (:require-macros
   [devcards.core
    :as dc
    :refer [defcard defcard-doc defcard-rg deftest]]))

(defcard-rg first-card
  [:div>h1 "This is your first devcard!"])

(defcard-rg home-page-card
  [core/home-page])

(defcard-rg simple-component
  [core/simple-component])

(defcard-rg simple-parent
  [core/simple-parent])

(defcard-rg say-hello
  [core/say-hello])

(defcard-rg say-foo
  [core/hello-component "foo"])

(defcard-rg lister
  [core/lister-user])

(defcard-rg counter
  [core/counting-component])

(defcard-rg timer
  [core/timer-component])

(defcard-rg shared-state
  [core/shared-state])

(defcard-rg bmi-component
  [core/bmi-component])

(reagent/render [:div] (.getElementById js/document "app"))

;; remember to run 'lein figwheel devcards' and then browse to
;; http://localhost:3449/cards
