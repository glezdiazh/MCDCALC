# MCDCALC
MCDCalc: Calculation of Markov Singular Values Molecular Descriptors Online Tool

Contributors: 

Paula Carracedo-Reboredo (Online Tool Programing and Design), Carlos Fernandez-Lozano (Online Tool Programing and Design), 
Georgia Tsiliki (R-library Programing), Haralambos Sarimveis (R-library Programing), Sonia Arrasate (Online Tool Programing and Design), 
Cristian Robert Munteanu (R-library Programing), and Humbert González-Díaz (Online Tool Design and Paper Writing)

Background: Cheminformatics models are able to predict different outputs (activity, property, chemical reactivity) in single molecules or complex molecular systems (catalyzed organic synthesis, metabolic reactions, nanoparticles, etc.). Specifically, Cheminformaticsprediction of complex catalytic enantioselective reactions is a major goal in organic synthesis research and chemical industry. Markov Chain Molecular Descriptors (MCDs) have been largely used to solve Cheminformatics problems. There are different types of Markov chain descriptors such as Markov-Shannon entropies (Shk), Markov Means (Mk), Markov Moments (πk), etc. However, there are other possible MCDs that have not been used before. In addition, the calculation of MCDs is done very often using specific software not ever available for general users and there is not an R library public available for the calculation of MCDs. This fact, limits the availability of MCMD-based Cheminformatics procedures. 

Repository: 

In this repository we release the code and other files related to the MCDCalc online tool we developed the first library in R for calculation of MCDs. We also report here the first public web server for the calculation of MCDs online. This online tool called MCDCalc includes the calculation of a new class of MCDs called Markov Singular values SVmax. 

Availability and Implementation: 

The online tools is freely available online (upon password request) at: http://oms.ehu.eus:8080/CPTMLTool/mcdCalc. Command-line tool/Library is available online at:https://www.github.com/muntisa/RMarkov.mol.The data used to train the model, T(K), t(h), Load(%)),SMILE codes (chemical structure) of substrate, product, catalyst, nucleophile, and observed vs. predicted values is available at: https://doi.org/10.6084/m9.figshare.6260549.v3.

Funding:

Spanish Ministry of Economy and Competitiveness (FEDER CTQ2016-74881-P) and (CTQ2013-41229-P) and Basque Government (IT1045-16) are gratefully acknowledged for their financial support. This work is supported by “Collaborative Project in Genomic Data Integration (CICLOGEN)” PI17/01826 funded by the Carlos III Health Institute from the Spanish National plan for Scientific and Technical Research and Innovation 2013–2016 and the European Regional Development Funds (FEDER). This project was also supported by the General Directorate of Culture, Education and University Management of Xunta de Galicia ED431D 2017/16 and "Drug Discovery Galician Network" Ref. ED431G/01 and the “Galician Network for Colorectal Cancer Research” (Ref. ED431D 2017/23) and finally by the Spanish Ministry of Economy and Competitiveness for its support with the funding of the unique installation BIOCAI (UNLC08-1E-002, UNLC13-13-3503) and the European Regional Development Funds (FEDER) by the European Union.

Reference: 

MCDCalc: Markov Chain Molecular Descriptors Calculator for Medicinal Chemistry. Carracedo-Reboredo P, Corona R, Martinez-Nunes M, Fernandez-Lozano C, Tsiliki G, Sarimveis H, Aranzamendi E, Arrasate S, Sotomayor N, Lete E, Munteanu CR, González-Díaz H. Curr Top Med Chem. 2020;20(4):305-317. doi: 10.2174/1568026620666191226092431. http://www.eurekaselect.com/article/103216
