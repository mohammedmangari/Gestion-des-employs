# Application de gestion des employés


- Cette application permet l'enregistrement et la gestion des informations des employés. Elle est construite en utilisant les pages JavaServer (JSP), les Servlets,
 les JavaBeans et la connectivité à une base de données Java (JDBC). Dans cet exemple, l'accent est mis sur la compréhension du concept de l'architecture MVC,
 plutôt que sur la partie front-end.
  
### Pour commencer
- Ces instructions vous permettront d'obtenir une copie du projet sur votre machine locale pour des fins de développement et de test.

### Prérequis
    1- Java 8 ou supérieur
    2- Apache Tomcat 8 ou supérieur
    3- MySQL ou base de données compatible

### Installation
    1- Clonez ou téléchargez le projet sur votre machine locale

    2-Importez le projet dans votre IDE préféré

    3- Créez une nouvelle base de données sur votre serveur MySQL et importez les fichies employee.sql et service.sql se trouvant dans le répertoire racine du   
       projet
    
    4- Mettez à jour les paramètres de connexion à la base de données dans src/main/java/med/dao/DataSource.java avec vos propres informations de
       connexion.
    
    5- Construisez et déployez le projet sur votre serveur Apache Tomcat
    
    6- Accédez à l'application en naviguant sur http://localhost:8080/Employee-Management/SaisieEmploye.jsp dans votre navigateur web


### Construit avec

    1- Pages JavaServer (JSP) - Utilisées pour créer les pages web

    2- Servlets - Utilisés pour gérer les requêtes HTTP et se connecter aux JavaBeans et au JDBC
    
    3- JavaBeans - Utilisés pour stocker et manipuler les informations des employés Connectivité à une base de données Java (JDBC) - Utilisée pour se connecter à la base de données et exécuter les requêtes SQL


### NOTE

  -  Cette application a été conçue pour démontrer les fonctionnalités de base de l'architecture Modèle-Vue-Contrôleur (MVC) en utilisant JSP, Servlet, JavaBean et 
 JDBC. Elle permet aux utilisateurs d'afficher les informations des employés, et est un exemple simple et rapide pour comprendre le concept de MVC, sans se
 concentrer sur la partie front-end.
  -  C'est un exemple simple et n'est pas destiné à une utilisation en production. 

