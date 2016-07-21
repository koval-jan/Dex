package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class SankeyParticles extends WebTask {
  public SankeyParticles() {
    super("Visualization: Dex Charts", "Sankey Particles",
      "visualization/dex_charts/SankeyParticles.html",
      "web/dexcharts/SankeyParticles.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    
    setSaveDynamic(true)
  }
}
