package com.example.projetsuivistage;

public class Stage {

    protected String Intitule;
    protected String Debut;
    protected String Fin;
    protected String Visite;
    protected String CompteRendu;
    protected String ConditionsStage;
    protected String BilanTravauxRealises;
    protected String RessourcesOutils;
    protected String CommentairesAppreciation;
    protected String Jury;
    protected String OpportunitesStage;
    protected String Id_Eleve;
    protected String Id_Entreprise;
    protected String Id_Professeur;
    protected String Id_Tuteur;



    public Stage (String Intitule, String Debut, String Fin, String Visite, String CompteRendu, String ConditionsStage, String BilanTravauxRealises, String RessourcesOutils, String CommentairesAppreciation,
                  String Jury, String OpportunitesStage, String Id_Eleve, String Id_Entreprise, String ID_Professeur, String Id_Tuteur){

        this.Intitule = Intitule;
        this.Debut = Debut;
        this.Fin = Fin;
        this.Visite = Visite;
        this.CompteRendu = CompteRendu;
        this.ConditionsStage = ConditionsStage;
        this.BilanTravauxRealises = BilanTravauxRealises;
        this.RessourcesOutils = RessourcesOutils;
        this.CommentairesAppreciation = CommentairesAppreciation;
        this.Jury = Jury;
        this.OpportunitesStage = OpportunitesStage;
        this.Id_Eleve = Id_Eleve;
        this.Id_Entreprise = Id_Entreprise;
        this.Id_Professeur = ID_Professeur;
        this.Id_Tuteur = Id_Tuteur;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public String getDebut() {
        return Debut;
    }

    public void setDebut(String debut) {
        Debut = debut;
    }

    public String getFin() {
        return Fin;
    }

    public void setFin(String fin) {
        Fin = fin;
    }

    public String getVisite() {
        return Visite;
    }

    public void setVisite(String visite) {
        Visite = visite;
    }

    public String getCompteRendu() {
        return CompteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        CompteRendu = compteRendu;
    }

    public String getConditionsStage() {
        return ConditionsStage;
    }

    public void setConditionsStage(String conditionsStage) {
        ConditionsStage = conditionsStage;
    }

    public String getBilanTravauxRealises() {
        return BilanTravauxRealises;
    }

    public void setBilanTravauxRealises(String bilanTravauxRealises) {
        BilanTravauxRealises = bilanTravauxRealises;
    }

    public String getRessourcesOutils() {
        return RessourcesOutils;
    }

    public void setRessourcesOutils(String ressourcesOutils) {
        RessourcesOutils = ressourcesOutils;
    }

    public String getCommentairesAppreciation() {
        return CommentairesAppreciation;
    }

    public void setCommentairesAppreciation(String commentairesAppreciation) {
        CommentairesAppreciation = commentairesAppreciation;
    }

    public String getJury() {
        return Jury;
    }

    public void setJury(String jury) {
        Jury = jury;
    }

    public String getOpportunitesStage() {
        return OpportunitesStage;
    }

    public void setOpportunitesStage(String opportunitesStage) {
        OpportunitesStage = opportunitesStage;
    }

    public String getId_Eleve() {
        return Id_Eleve;
    }

    public void setId_Eleve(String id_Eleve) {
        Id_Eleve = id_Eleve;
    }

    public String getId_Entreprise() {
        return Id_Entreprise;
    }

    public void setId_Entreprise(String id_Entreprise) {
        Id_Entreprise = id_Entreprise;
    }

    public String getId_Professeur() {
        return Id_Professeur;
    }

    public void setId_Professeur(String id_Professeur) {
        Id_Professeur = id_Professeur;
    }

    public String getId_Tuteur() {
        return Id_Tuteur;
    }

    public void setId_Tuteur(String id_Tuteur) {
        Id_Tuteur = id_Tuteur;
    }
}
