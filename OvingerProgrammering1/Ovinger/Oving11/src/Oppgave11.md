# Oppgave 1
**Kort om klassene**

**RealEstateRegister:**
Klassen `RealEstateRegister` er et dataregister (tabell) for alle eiendommer. Den inneholder en liste av `RealEstate`-objekter (`realEstates`) og gir mulighet for å legge til, fjerne og søke etter eiendommer.  
Listen er dynamisk fordi det totale antallet eiendommer kan endres over tid, noe som gjør det enkelt å legge til eller fjerne eiendommer uten å måtte endre størrelsen på listen manuelt.  
Klassen gir også metoder for å manipulere og hente informasjon om eiendommer. Disse metodene bruker getters fra `RealEstate`.

**RealEstate:**
Representerer en individuell eiendom med attributter som representerer en eiendom: `municipalityName`, `municipalityNumber`, `lotNumber`, `sectionNumber`, `area` og `ownerName`.  
Gir metoder for å sette verdier og getters.  
Instanser av `RealEstate` lagres i `RealEstateRegister`, som fungerer som tabellen for alle eiendommene.

**UI:**
Håndterer brukergrensesnittet og brukerinteraksjoner.  
Bruker metoder som `showMenu()` for å vise valg til brukeren og `start()` for å starte applikasjonen. 
Oppretter et `RealEstateRegister` instans her
`inputRealEstateData()` lar brukeren legge inn data for å opprette nye `RealEstate`-objekter, som deretter legges til i `RealEstateRegister` via `addRealEstate`.

**Main:**
Hovedinngangen til applikasjonen, som inneholder `main`-metoden.  
Oppretter instanser av `UI` og starter applikasjonens flyt ved å kalle `UI.start()` for å aktivere UI som da viser en meny. 

**Konklusjon**
- `Main` initialiserer programmet ved å opprette instans av `UI` .
- `UI` gir brukeren mulighet til å se og manipulere eiendomsdata. Den kaller metoder fra `RealEstateRegister` for å legge til, fjerne, søke og vise `RealEstate`-data.
- `RealEstateRegister` fungerer som hovedregister/samling/tabell og lagrer `RealEstate`-instanser. Den gir metoder for datamanipulasjon og innhenting (getters).
- `RealEstate` kapsler inn (privat) eiendomsdata, og `RealEstateRegister` lagrer flere instanser av den.

**Roller:**
- `RealEstate` håndterer individuelle data.
- `RealEstateRegister` administrerer datainnsamlingen.
- `UI` gir brukerinteraksjon.
- `Main` fungerer som applikasjonens startpunkt.

# Oppgave 5

- `UI`-klassen har ansvar for brukerinteraksjon: den viser menyer, tar imot input og håndterer brukergrensesnittet.
- `RealEstateRegister` tar seg av administrasjonen av eiendomsregisteret.  
  Denne oppdelingen reduserer koblingen mellom UI og datahåndteringslogikken.  
  Hvis `RealEstateRegister` endres, påvirkes ikke UI direkte, og omvendt. Dette øker systemets fleksibilitet.

`UI` forholder seg kun til `RealEstateRegister` og bruker det som et grensesnitt for å utføre handlinger.  
`UI` manipulerer ikke objektene i `RealEstate` direkte, men overlater dette til `RealEstateRegister`, altså UI bruker RealEstateRegister instansen til å kalle på metodene til RealEstate.  
Denne oppdelingen holder avhengighetene mellom klassene lave og opprettholder lav kobling.

- `RealEstateRegister` kontrollerer listen med eiendommer gjennom metoder som `add` og `remove`.  
  Ved å kapsle inn denne dataen, og ikke eksponere den direkte, sikrer klassen at den selv bestemmer hvordan eiendommene håndteres.  
  Koblingen reduseres, og `UI` trenger ikke vite om de interne detaljene i `RealEstateRegister` (innkapsling).

- `RealEstate` representerer dataene til en eiendom. Attributtene og metodene er alle relevante for en eiendom. I tillegg er de kapslet  
  `RealEstate` er høyt samstemt da den har en tydelig og klar oppgave: å representere en eiendom.

- `RealEstateRegister` har ulike administrative funksjoner: legge til, fjerne, søke etter og beregne eiendomsdata.  
  Metoder som `addRealEstate`, `removeRealEstate` og `averageArea` er tydelig rettet mot administrasjon av `RealEstate`-instanser.  
  `RealEstateRegister` har derfor en tydelig oppgave – administrasjon – og er dermed samstemt.  
  Bruken av streams i metodene gjør at man unngår unødvendig iterasjon gjennom listen, noe som bidrar til en robust og konsistent kode og unngår unødvendige operasjoner.

- `UI`-klassen håndterer brukergrensesnittet. Metoder som `showMenu`, `inputRealEstateData` og `generateDummyRealEstates` er alle knyttet til brukerinteraksjoner.

**Klar og tydelig separasjon** mellom klassene `UI`, `RealEstateRegister` og `RealEstate` gjør koden skalerbar, enkel å endre og utvide.
