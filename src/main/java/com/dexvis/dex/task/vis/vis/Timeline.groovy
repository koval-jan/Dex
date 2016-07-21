package com.dexvis.dex.task.vis.vis

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Timeline extends WebTask {
  public Timeline() {
    super("Visualization: Vis", "Timeline",
      "visualization/vis/Timeline.html",
      "web/vis/Timeline.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    setSaveDynamic(true)
  }
}
