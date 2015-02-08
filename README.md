#Compendium of Heroes

#Warning! for the time being code will be refactored unsparingly. When this reaches an alpha release we will stick to naming conventions etc.

This is an app we are making for our third year project in the Bachelor of Information Technology at Southern Institute of Technology, New Zealand.
The group working on this is called "Real Standard Studios"
We aim to have a working replacement for all paper and books used by the average player in the [pathfinder RPG](http://paizo.com/pathfinderRPG/) by the end of 2014 with the ability to have RPG rule systems moved in and out as data modules

## Contents

 - [App Concept](#app-concept)
 - [What works](#what-works)
 - [Future Goals](#future-goals)

#App Concept

- Replace all parts of the Pathfinder character sheet with the app I.E. stats, skills, saves, armor, weapons
- Have all fields possible auto-calculate
- Each spellcaster has a unique spell list; Manage spells for spellcasters
- Manage spells per day from spell list
- Inventory management(personal map: mannequin with drop down lists for each applicable item)
- Combat system
- Auto calculates need actions for each weapon such as swapping weapons etc
- Roll required number of dice for each action
- When inputting a field or skill have the relevant information shown

Targeting all Java-SE enabled desktop systems

#What Works?
Read [this document](https://drive.google.com/file/d/0B7VEqR5CsThseENUZFdsQjBDdU0/view?usp=sharing) if the app is incomprehensable

- Most races are accounted for, Humans don't actually work as intended because having any stat rather than A stat is non-conformist
- Most feats are in the system but do not check for pre-requisites correctly or give their effects to the character 100% of the time
- Mish mash of classes functioning, magic classes are the least likley to work with the Fighter at about 90% working (class features do not have effects applied correctly)
- You can't actually manage your inventory properly cause of bugs
- No editing details outside of Character creator
- The combat page does nothing yet
- While you can look at spells they probably don't display correctly
- Leveling up is probably tempramental
- Prestige Classes: Nope
- Multi Classing: Nope
- Pathfinder Advanced Classes: Nope
- Items: Magic Items 50%
- Normal items: 90%
- Spells: 100% of PRD spells are currently digitised

- Pathfinder NPC Codex: Nope
- Pathfinder Ultimate Campaign: Nope
- Pathfinder Mythic Adventures: Nope
- Pathfinder Advanced Classes: Nope
- Pathfinder Beastiary 1: Nope
- Pathfinder Beastiary 2: Nope
- Pathfinder Beastiary 3: Nope
- Pathfinder Beastiary 4: Nope
- Pathfinder Bonus Beastiary Nope

- Yes it is also brown, we aren't all designers


#Future Goals
- Link players with each other using bluetooth or similar wireless technology
- Let data be pushed to GM for combat stats
  - Dice rolls are sent to the GM to remove the ability to lie about dice roll outcome
- Gms can create battlemaps for combats
- Players can join in on the battlemap with the generated mobs for combat using a token or small sprite
- Gms can generate mobs for combats and other misc npcs
  - Have a drop down menu which asks for size of creature, colour for distinction and optional picture if you want
- Small chat system to allow players to message each other, notifications to the GM that X player and Y player are whispering to each other and the ability to watch the conversation
- Let players message the GM to allow for actions to be kept secret from the party
- An android tablet version
  - Let Game masters schedule games and have these games pushed to users google calendars

-Targeting Android version 4.0.3 (API version 15) and higher, this allows us to use more modern features and reach 78.6 of all android users.
