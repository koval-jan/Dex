package com.dexvis.dex.task.vis.dexcharts.google

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Timeline extends WebTask
{
  public Timeline()
  {
    super("Visualization: Google", "Timeline",
      "visualization/google/Timeline.html",
      "web/dexcharts/google/Timeline.gtmpl")
    setSaveDynamic(true)
  }
}
