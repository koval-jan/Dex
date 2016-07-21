package com.dexvis.dex.task.vis.vis

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Network extends WebTask {
  public Network() {
    super("Visualization: Vis", "Network",
      "visualization/vis/Network.html",
      "web/vis/Network.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    setSaveDynamic(true)
  }
}
