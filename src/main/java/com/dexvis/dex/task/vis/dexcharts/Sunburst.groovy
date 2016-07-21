package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Sunburst extends WebTask {
  public Sunburst() {
    super("Visualization: Dex Charts", "Sunburst",
    "visualization/dex_charts/Sunburst.html",
    "web/dexcharts/Sunburst.gtmpl")
    
    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    setSaveDynamic(true)
  }
}
