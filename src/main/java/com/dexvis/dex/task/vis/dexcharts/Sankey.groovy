package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Sankey extends WebTask {
  public Sankey() {
    super("Visualization: Dex Charts", "Sankey Diagram",
      "visualization/dex_charts/SankeyDiagram.html",
      "web/dexcharts/Sankey.gtmpl")

    setSaveDynamic(true)
  }
}
