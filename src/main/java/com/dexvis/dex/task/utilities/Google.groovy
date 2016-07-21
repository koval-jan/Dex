package com.dexvis.dex.task.utilities

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Google extends WebTask
{
  public Google()
  {
    super("Web View", "Google", "web_view/Google.html",
      "http://www.google.com")
  }
}
