# TAQMAC-DSL

## TAQMAC Domain Specific Language

# Introduction

TAQMAC is a Domain Specific Language thought for assisting webmasters in the creation of _Visit us_ or _Contact_ page of companies websites through a natural language easily understandable by non-developers.

# TAQMAC (.tqmc file) syntax

| Keyword                   | Meaning                           | Value                                                         | Example                                               |
|---------                  |:--------                          |-------                                                        |--------                                               |
| Itineraire                | Name of the company               | Company name (String)                                         | `Itineraire "Altran"`                                 |
| adresse                   | Physical address of the company   | Company address (String)                                      | `adresse "17 Avenue Didier Daurat, 31700 Blagnac"`    |
| horaires debut ... fin ...| Opening time of the company       | Hours (String)                                                | `horaire debut "10" fin "18"`                         |
| transport                 | Allowed transportation modes      | Tisseo \| Voiture \| Pieton \| Velo \| Bus \| Metro \| Tram   | `transport Tisseo, Voiture, Velo` |
| affichage                 | Display mode of the page          | Carte \| Texte                                                | `affichage carte, texte`
|

