(ns my-cool-function.core)

(defn crunch-my-data-function
  [req]
  (let [string-of-commands (req :query-string)]

  {:status 200,
   :headers {"Content-Type" "application/json"},
   :body {:commands string-of-commands, greeting "Hi?"}}))
