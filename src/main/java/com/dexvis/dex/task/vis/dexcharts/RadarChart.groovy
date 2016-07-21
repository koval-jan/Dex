package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import com.dexvis.util.TaskPropertyFactory
import org.simpleframework.xml.Root

@Root
class RadarChart extends WebTask {
  public RadarChart() {
    super("Visualization: Dex Charts", "Radar Chart",
      "visualization/dex_charts/RadarChart.html",
      "web/dexcharts/RadarChart.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)

    addProperties(TaskPropertyFactory.createCircleProperties('Radar Circles', 'radar.circle'))
    
    setSaveDynamic(true)
  }
}
