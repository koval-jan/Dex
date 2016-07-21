package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class ChordMultiples extends WebTask {
  public ChordMultiples() {
    super("Visualization: Dex Charts", "Chord Multiples",
      "visualization/dex_charts/ChordMultiples.html",
      "web/dexcharts/ChordMultiples.gtmpl")
    
    setSaveDynamic(true)
  }
}
