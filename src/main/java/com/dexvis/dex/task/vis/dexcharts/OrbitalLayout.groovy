package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import com.dexvis.util.TaskPropertyFactory
import org.simpleframework.xml.Root

@Root
class OrbitalLayout extends WebTask {
  public OrbitalLayout() {
    super("Visualization: Dex Charts", "Orbital Layout",
      "visualization/dex_charts/OrbitalLayout.html",
      "web/dexcharts/OrbitalLayout.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    addProperties(TaskPropertyFactory.createCircleProperties('Circles', 'circles'))
    addProperties(TaskPropertyFactory.createCircleProperties('Orbits', 'orbits'))
    
    setSaveDynamic(true)
  }
}
