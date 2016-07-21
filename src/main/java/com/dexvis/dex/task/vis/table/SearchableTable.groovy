package com.dexvis.dex.task.vis.table

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class SearchableTable extends WebTask
{
  public SearchableTable()
  {
    super("Visualization: Table", "Searchable Table",
      "visualization/table/SearchableTable.html",
      "web/table/SearchableTable.gtmpl")
  }
}
