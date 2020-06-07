Voici les principales sources pour créer l'ensemble des projets générés pour le DSL

1. Créer un EMP (Ecore Modeling Project)
2. Inclure le fichier itenéraire.ecore
3. Générer le genmodele + generate all 
4. Créer un projet Xtext Project From existing Ecore Models
5. Sélection le genmodele généré à partir du ecore
5. Copier Taqmac.xtext ET le GenerateTaqmac.mwe2 dans les sources de ce projet
6. Générer(run) le GenerateTaqmac
7. Copier le TaqmacGenerator afin d'avoir le doGenerate

En résumé, on refait le tp de combemale en incluant nos sources