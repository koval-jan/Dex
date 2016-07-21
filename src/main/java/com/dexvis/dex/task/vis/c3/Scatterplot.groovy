package com.dexvis.dex.task.vis.c3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Scatterplot extends WebTask
{
  public Scatterplot()
  {
    super("Visualization: C3", "Scatterplot", "visualization/c3/Scatterplot.html",
    "web/c3/Scatterplot.gtmpl")
    setSaveDynamic(true)
  }
}
