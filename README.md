# MCDCALC
MCDCalc: Calculation of Markov Singular Values Molecular Descriptors Online Tool

Authors/Contribution: 

Paula Carracedo-Reboredo (Online Tool Programing and Design), Ramiro Corona (Paper Regression Analysis), 
Carlos Fernandez-Lozano (Online Tool Programing and Design), 
Georgia Tsiliki (RMARKOVTI Programing), 
Haralambos Sarimveis (RMARKOVTI Programing), 
Eider Aranzamendi (Paper Reactions Data Compilation and Curation, Organic Synthesis Experiments), 
Sonia Arrasate (Paper Reactions Data Compilation and Curation, Organic Synthesis Experiments) 
Nuria Sotomayor (Paper Reactions Data Compilation and Curation, Organic Synthesis Experiments) 
Esther Lete (Paper Reactions Data Compilation and Curation, Organic Synthesis Experiments) 
Cristian Robert Munteanu (RMARKOVTI Programing Programing), 
Humbert González-Díaz (Overall Project Design and Supervision, Online Tool Design, Paper Writing)

Background: 

Cheminformatics models are able to predict different outputs (activity, property, chemical reactivity) in single molecules or complex molecular systems (catalyzed organic synthesis, metabolic reactions, nanoparticles, etc.). Specifically, Cheminformaticsprediction of complex catalytic enantioselective reactions is a major goal in organic synthesis research and chemical industry. Markov Chain Molecular Descriptors (MCDs) have been largely used to solve Cheminformatics problems. There are different types of Markov chain descriptors such as Markov-Shannon entropies (Shk), Markov Means (Mk), Markov Moments (πk), etc. However, there are other possible MCDs that have not been used before. In addition, the calculation of MCDs is done very often using specific software not ever available for general users and there is not an R library public available for the calculation of MCDs. This fact, limits the availability of MCMD-based Cheminformatics procedures. 

Eample of Application. Study of α-amidoalkylation reactions
The α-amidoalkylation reaction is one of the most attractive methods for the stereoselective C−C bond formation and it has been widely utilized in the synthesis of a variety of complex organic molecules, including natural products and pharmaceuticals. This method possesses several distinct advantages. The reaction is reported to have a wide nucleophile and substrate scope. In addition, the reaction is highly diastereoselective when cyclic and bicyclic N-acyliminium ion intermediates are involved, which can be generated in situ from the corresponding hydroxylactams, using both protic and Lewis acids. This strategy is applicable to the construction of tertiary and quaternary stereocenters in an asymmetric fashion.These enantioselective variants have been developed using mainly chiral Brønsted acids (CBAs) as BINOL derived phosphoric acids and phosphoramides, as well as ureas and thioureas, as catalysts. In addition, the procedure works well with aromatics and heteroaromatics (Friedel-Crafts reactions), enamides, silylenol ethers, etc.Computational chemistry has helped to understand the mechanism of these α-amidoalkylation reactions. 
However, there are not Cheminformatics models for this reaction using MCDs. The understanding of how the different parameters affect its stereochemical outcome is still difficult to rationalize. Therefore, we sought to develop computational chemistry methods for the prediction of the enantioselectivity of this type of intermolecular α-amidoalkylation reactions. We used the previous indices calculated with RMarkov.mol as input for a Multivariate Linear Regression (MLR) model. Therefore, the resulted dataset contains 156 features and 324 examples/cases. The output of the model is the parameter ee(%)[Rcat]. This parameter is equal to the enantiomeric excess of the reaction using a catalyst of configuration R. Consequently, in the cases of reactions reported in the literature with R-catalysts ee(%)[Rcat] = ee(%) enantiomeric excess. Conversely, in the cases of reactions enantiomeric excess ee(%) reported for an S-catalyst ee(%)[Rcat] = - ee(%)[Scat] = - ee(%). Therefore, all the values of enantiomeric excess predicted with this model are for reactions using an R-catalyst. In order to predict the value for S-catalyst we only have to multiply the output of the equation by -1. The best linear model found have a R2 = 0.828 with Fisher ratio F = 92.07 and p < 0.05. Theseare promising values because the model is statistically significant (p < 0.05) and explains more than 80% of the variance. 

Repository: 

In this repository we release the code and other files related to the MCDCalc online tool we developed the first library in R for calculation of MCDs. We also report here the first public web server for the calculation of MCDs online. This online tool called MCDCalc includes the calculation of a new class of MCDs called Markov Singular values SVmax. 

Reference: 

MCDCalc: Markov Chain Molecular Descriptors Calculator for Medicinal Chemistry. Carracedo-Reboredo P, Corona R, Martinez-Nunes M, Fernandez-Lozano C, Tsiliki G, Sarimveis H, Aranzamendi E, Arrasate S, Sotomayor N, Lete E, Munteanu CR, González-Díaz H. Curr Top Med Chem. 2020;20(4):305-317. doi: 10.2174/1568026620666191226092431. http://www.eurekaselect.com/article/103216

Availability and Implementation: 

The online tools is freely available online (upon password request) at: https://cptmltool.rnasa-imedir.com/CPTMLTools-Web/mmd. 
Command-line tool/Library is available online at: https://github.com/muntisa/RMarkovti.

Application in Organic Chemistry:
The data used to train and validate the model, T(K), t(h), Load(%)),SMILE codes (chemical structure) of substrate, product, catalyst, nucleophile, and observed vs. predicted values is available at: https://doi.org/10.6084/m9.figshare.6260549.v3.

Funding:

Spanish Ministry of Economy and Competitiveness (FEDER CTQ2016-74881-P) and (CTQ2013-41229-P) and Basque Government (IT1045-16) are gratefully acknowledged for their financial support. This work is supported by “Collaborative Project in Genomic Data Integration (CICLOGEN)” PI17/01826 funded by the Carlos III Health Institute from the Spanish National plan for Scientific and Technical Research and Innovation 2013–2016 and the European Regional Development Funds (FEDER). This project was also supported by the General Directorate of Culture, Education and University Management of Xunta de Galicia ED431D 2017/16 and "Drug Discovery Galician Network" Ref. ED431G/01 and the “Galician Network for Colorectal Cancer Research” (Ref. ED431D 2017/23) and finally by the Spanish Ministry of Economy and Competitiveness for its support with the funding of the unique installation BIOCAI (UNLC08-1E-002, UNLC13-13-3503) and the European Regional Development Funds (FEDER) by the European Union.


