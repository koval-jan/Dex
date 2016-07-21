package com.dexvis.dex.task.vis.dexcharts.google

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class WordTree extends WebTask
{
  public WordTree()
  {
    super("Visualization: Google", "Word Tree",
      "visualization/google/WordTree.html",
      "web/dexcharts/google/WordTree.gtmpl")
    setSaveDynamic(true)
  }
}
