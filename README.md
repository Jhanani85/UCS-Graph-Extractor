# UCS Graph Extractor

## 📌 Overview
The **UCS Graph Extractor** is a Java-based tool designed to automatically extract data from geotechnical UCS (Unconfined Compressive Strength) graphs and reports. It leverages AI-driven preprocessing and curve extraction techniques to convert visual graph data into structured CSV files for further analysis.

This project was developed for **Algnite 2k26** as part of an AI-based data extraction challenge.

---

## 🚀 Features
- Batch processing of multiple input files from the `resources/` folder.
- Automatic CSV generation in the `output/` folder.
- Preprocessing pipeline: noise removal, axis detection, curve extraction.
- Modular Java codebase for easy extension and scalability.
- Clear documentation and professional presentation for competitions.

---

## 📂 Project Structure

UCS-Graph-Extractor/ ├── src/          # Java source files │   ├── Main.java │   ├── SolutionOverview.java │   ├── CSVExporter.java │   └── other modules... ├── resources/    # Input graphs and reports │   ├── graph1.png │   ├── graph2.jpg │   └── ucs_report.pdf ├── output/       # Generated CSV files │   ├── graph1_output.csv │   ├── graph2_output.csv │   └── ucs_report_output.csv └── README.md     # Project documentation

---

##
---

## ⚙️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Jhanani85/UCS-Graph-Extractor.git
   cd UCS-Graph-Extractor/src


- Compile the Java files:
javac *.java
- Run the program:
java Main


- Check the output/ folder for generated CSV files
📊 Example Output
Input: graph1.png
Output: graph1_output.csv
X,Y
0.0,0.3
0.5,0.6
1.0,1.0
1.5,1.2
2.0,1.4
2.5,2.0

🌟 Future Work
- Extend support for SPT/CPT geotechnical graphs.
- Integrate with GIS/BIM systems for real-world applications.
- Enhance AI models for more accurate curve extraction.
- Export professional PDF reports alongside CSVs.


 Author
Developed by Jhanani.S,Hamsavarthini.M,Srilekha.A,Rakshithaa.M
Participant at Algnite 2k26

📜 License
This project is licensed under the MIT License.
You are free to use, modify, and distribute with attribution.












- 
