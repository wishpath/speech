package service.input;

public class Input {
  public String getText() {
    String text = "Artificial intelligence (AI) is the intelligence of machines or software, as opposed to the intelligence of humans or animals. It is a field of study in computer science which develops and studies intelligent machines. Such machines may be called AIs.\n" +
        "\n" +
        "AI technology is widely used throughout industry, government, and science. Some high-profile applications are: advanced web search engines (e.g., Google Search), recommendation systems (used by YouTube, Amazon, and Netflix), understanding human speech (such as Google Assistant, Siri, and Alexa), self-driving cars (e.g., Waymo), generative and creative tools (ChatGPT and AI art), and superhuman play and analysis in strategy games (such as chess and Go).[1]\n" +
        "\n" +
        "Alan Turing was the first person to carry out substantial research in the field that he called Machine Intelligence.[2] Artificial intelligence was founded as an academic discipline in 1956.[3] The field went through multiple cycles of optimism[4][5] followed by disappointment and loss of funding.[6][7] Funding and interest vastly increased after 2012 when deep learning surpassed all previous AI techniques,[8] and after 2017 with the transformer architecture.[9] This led to the AI spring of the 2020s, with companies, universities, and laboratories overwhelmingly based in the United States pioneering significant advances in artificial intelligence.[10]\n" +
        "\n" +
        "The various sub-fields of AI research are centered around particular goals and the use of particular tools. The traditional goals of AI research include reasoning, knowledge representation, planning, learning, natural language processing, perception, and support for robotics.[a] General intelligence (the ability to complete any task performable by a human) is among the field's long-term goals.[11] To solve these problems, AI researchers have adapted and integrated a wide range of problem-solving techniques, including search and mathematical optimization, formal logic, artificial neural networks, and methods based on statistics, operations research, and economics.[b] AI also draws upon psychology, linguistics, philosophy, neuroscience and many other fields.[12]";
    return text.toLowerCase();
  }

  public String getStartingWordString() {
    return "ai";
  }
}
