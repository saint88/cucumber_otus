package com.otus.pages;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.otus.annotations.Path;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.WebDriver;

@Path("/")
public class MainPage extends AbsBasePage<MainPage> {

  @Inject
  public MainPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }



}
