package com.webforj.interfaceimpl;

import com.webforj.App;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

public class Main extends App {

  @Override
  public void run() throws WebforjException {
    final var window = new Frame();

    final var input = new Input();
    input.setPlaceholder("Name");

    window.add(input);
  }
}