package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class ParCoor2Chord extends WebTask
{
  public ParCoor2Chord()
  {
    super("Visualization: Dex Charts", "Par Coord -> Chord",
     "visualization/dex_charts/ParCoord2Chord.html",
     "web/dexcharts/ParCoor2Chord.gtmpl")
    setSaveDynamic(true)
  }
}
