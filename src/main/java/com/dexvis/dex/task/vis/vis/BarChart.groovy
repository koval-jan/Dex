package com.dexvis.dex.task.vis.vis

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class BarChart extends WebTask {
  public BarChart() {
    super("Visualization: Vis", "Bar Chart",
      "visualization/vis/BarChart.html",
      "web/vis/BarChart.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    setSaveDynamic(true)
  }
}
