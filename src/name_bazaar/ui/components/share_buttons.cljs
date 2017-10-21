(ns name-bazaar.ui.components.share-buttons
  (:require [re-frame.core :refer [reg-sub subscribe]]
            [reagent.ratom :refer-macros [reaction]]))

(defn share-buttons [{:keys [url title]}]
  [:div.share-buttons
   [:div.title "Share On:"]
   [:a {:on-click (fn []
                    (js/FB.ui (clj->js {:method "feed"
                                        :link (print.foo/look url)
                                        :caption (print.foo/look title)})))}
    [:i.icon.fb]]
   [:a {:target "_blank"
        :href (str "https://twitter.com/intent/tweet?text=" title "&url=" url)}
    [:i.icon.twitter]]])

