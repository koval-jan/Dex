package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class CrossFilter extends WebTask
{
  public CrossFilter()
  {
    super("Visualization: NVD3", "CrossFilter",
      "visualization/nvd3/CrossFilter.html",
      "web/nvd3/CrossFilter.gtmpl")
    setSaveDynamic(true)
  }
}