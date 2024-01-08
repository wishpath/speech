import data.WordDTO;
import service.GraphMaker;
import service.TextSplitter;
import service.input.Input;
import service.output.OutputSpeechMaker;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    String text = new Input().getText();
    String[] words = new TextSplitter(text).getWords();
    Set<WordDTO> set = new GraphMaker(words).makeGraph();
    //Printer.printSpecificWord(set, "of");
    //Printer.printGraph(set);
    new OutputSpeechMaker(set).speak();
  }
}