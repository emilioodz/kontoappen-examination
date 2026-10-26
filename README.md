# kontoappen-examination

Det här är mitt projekt i kursen Java grunder. Jag har gjort en enkel bankapp där man kan skapa konton, se vilka konton som finns, sätta in pengar och ta ut pengar.

Programmet är uppdelat i tre klasser: Account, AccountRegister och Main.

## Inkapsling

I Account har jag gjort variablerna owner och balance privata. Det betyder att man inte kan ändra dem direkt från de andra klasserna.

Jag använder istället metoder för att läsa informationen och för att sätta in eller ta ut pengar. På så sätt kan jag kontrollera att man exempelvis inte tar ut mer pengar än vad som finns på kontot.

## Skapa konto

Jag använder AccountRegister för att skapa nya konton. När ett konto skapas läggs det i en lista som heter accounts.

Jag valde att ha det så för att Main inte ska behöva hålla reda på alla konton själv. Main tar istället hand om menyn och det användaren skriver in.

## Hur programmet fungerar

Om man exempelvis väljer att sätta in pengar frågar programmet först efter kontots ägare.

Sedan använder programmet findAccount för att leta efter rätt konto. Om kontot finns får användaren skriva hur mycket pengar som ska sättas in.

Då körs deposit och beloppet läggs till saldot. Efteråt visas det nya saldot.

## Reflektion

Jag tyckte det var lite svårt i början att förstå hur de olika klasserna skulle fungera tillsammans. Framför allt hur Main skulle kunna använda metoder från Account och AccountRegister.

Jag har använt kursmaterial och AI som stöd när jag kört fast och försökt förstå hur koden fungerar.

Det som hjälpte mig mest var att dela upp arbetet i mindre delar och ta en sak i taget.

Jag har också lärt mig mer om metoder, klasser, listor och hur man använder GitHub för att spara olika versioner av sitt arbete.
