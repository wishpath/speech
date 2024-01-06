import data.WordDTO;
import helpers.GraphMaker;
import helpers.TextSplitter;
import helpers.input.Input;
import helpers.output.OutputSpeechMaker;
import helpers.output.Printer;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    String text = new Input().getText();
    String[] words = new TextSplitter(text).getWords();
    Set<WordDTO> set = new GraphMaker(words).makeGraph();
    //Printer.printSpecificWord(set, "of");
    Printer.printGraph(set);
    new OutputSpeechMaker(set).speak();
  }
}