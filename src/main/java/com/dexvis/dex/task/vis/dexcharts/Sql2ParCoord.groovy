package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Sql2ParCoord extends WebTask {
  public Sql2ParCoord() {
    super("Visualization: Dex Charts", "Sql -> ParCoor",
    "visualization/dex_charts/Sql2ParCoord.html",
    "web/dexcharts/Sql2ParCoor.gtmpl")
    setSaveDynamic(true)
  }
}
