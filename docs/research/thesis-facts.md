# Thesis Facts — SPVR01 (Paulsson, MA thesis)

Digest of the thesis for Ideophone Arena design, copy, and data work. Compiled 2026-06-11 from the thesis page scans (OCR sidecars) in project knowledge. Values marked **[chart-read]** were read off bar-chart figures and are accurate to roughly ±1 count / ±0.1 rating; replace them with exact values when the raw data export lands (see Open Questions).

## 1. Experiment in one paragraph

36 participants with no knowledge of Japanese completed two tasks on the Gorilla platform (~20 min total): a 30-trial two-alternative forced-choice **Choosing Task** (pre-reflective measure: guess which of two ideophones matches a target English meaning), then a **Rating Task** (reflective measure: "How much does this word sound like what it means?", 7-point scale, 1 = no resemblance, 7 = very high). Between-subjects condition (3 levels): Audio-Only (C1, n=11), Congruent Script (C2, n=13), Incongruent Script (C3, n=12). Within-subjects: modality (auditory / visual / interoceptive, 10 pairs each). Task order was fixed (Choosing first) so the Rating Task's revealed meanings could not contaminate naive guessing. Audio: Google Cloud TTS, female Japanese WaveNet voice `ja-JP-Wavenet-B`, chosen to match McLean, Dunn & Dingemanse (2023: 719).

## 2. Stimulus construction pipeline (matters for inventory expansion)

1. NINJAL-LWP for BCCWJ (NLB) "onomatopoeia" search → top 600 most frequent ideophones.
2. Each transcribed in both kana scripts; hiragana-vs-katakana frequency measured per word on JaTenTen11 via Sketch Engine → script-preference measure.
3. Selection criteria: (a) three modalities along the implicational hierarchy (auditory, visual, interoceptive); (b) katakana-preferring words shortlisted (~20 per modality); (c) monosemous and modality-specific; (d) JMdict vetting — cross-modal polysemes excluded (e.g. *garan* "clanging" + "deserted"), ambiguous English glosses excluded.
4. Each katakana-dominant word paired with a meaning-contrastive, usually hiragana-dominant counterpart **in the same sensory domain** (e.g. kirakira/katakana/bright vs donyori/hiragana/gloomy). Pairs verified against corpus script frequencies and reviewed with a native speaker.
5. Result: 30 pairs (60 words), 10 per modality, every pair contrasting in both meaning and script dominance. Plus 4 practice pairs (8 words, p0–p3) excluded from analysis.

**Implication for the pairing pipeline (roadmap step 5):** the top-600 spreadsheet's columns (NLB frequency, script frequency, modality, perceptual strength) are exactly the inputs this manual process used. An automated pipeline replicates steps 3–4: filter by modality, monosemy-check, script-dominance contrast, same-modality semantic contrast. The semantic-contrast step was first/second-person judgment in the thesis — the one step that resists full automation and will need human (Nils) sign-off per generated pair.

## 3. Headline results (safe for copy, verified in thesis text)

- **H1 supported — above-chance guessing.** Mean Choosing accuracy ≈ 64% (19.25/30) vs 50% chance. Every participant's mean exceeded the benchmark except the single lowest (14/30 ≈ 47%, essentially at chance); best performers reached ~27/30 (≈90%).
- **H2 supported — modality ordering.** Accuracy: Auditory 6.86 > Visual 6.42 > Interoceptive 5.97 (out of 10). Consistent with the implicational hierarchy (Dingemanse 2012; McLean 2021): unimodal sound-to-sound mappings are most transparent, internal states least.
- **H3 not supported — orthography had negligible group-level effect on accuracy.** C1/C2/C3 performed at similar levels; predicted ranking C2 > C1 > C3 did not appear. High and low performers appeared in all three groups.
- **Rating Task reversal (the thesis's most game-worthy finding).** Mean ratings by modality: Interoceptive 4.45 > Visual 4.24 > Auditory 4.08 — the *opposite* ordering from accuracy. Interoceptive words *feel* most iconic but are guessed worst. Grand mean rating 4.26/7.
- **Script dampened felt iconicity.** Audio-Only participants rated words higher (M ≈ 4.50) than both script conditions (M ≈ 4.15) — seeing kana (congruent *or* incongruent) slightly reduced perceived iconicity for non-readers. Direction was unexpected: script acted as noise/distraction, not reinforcement.
- **Guess–rating dissociation mirrors McLean, Dunn & Dingemanse (2023):** ratings and guessing accuracy capture different, complementary dimensions of iconicity. Showcase items: **sakutto (a9)** high on both; **dokidoki (i9)** highest-rated of all (~5.8) but only modest accuracy (~67%); **shobon (i2)** hardest to guess (36%) despite moderate (~4.0) rating.
- Per-item accuracy spread: ~94% (easiest, a9) down to 36% (hardest, i2). Auditory items like **gishigishi (a7)** exceeded 80%.
- Qualitative color: participants described matching "the shape of the letters" to sounds ("rounded for softer words", "sharp/angular for harsher words"); others ignored script entirely ("I only concentrated on the audio recordings").

## 4. Per-pairing Choosing accuracy (Figure 10) — correct answers out of 36

**[chart-read]** except a9 (≈94%) and i2 (36%), which the text confirms. Pairing codes match the seed stimulus prefixes (e.g. `a0h-gosogoso`).

| Rank | Pair | Words (hira / kata) | Correct/36 | ≈% |
|---|---|---|---|---|
| 1 | a9 | mogomogo / sakutto | 34 | 94% |
| 2 | a7 | doshidoshi / gishigishi | 30 | 83% |
| 3 | v2 | donyori / kirakira | 30 | 83% |
| 4 | i3 | sukkiri / iraira | 29 | 81% |
| 5 | v8 | marumaru / garigari | 27 | 75% |
| 6 | a2 | zyaazyaa / potapota | 26 | 72% |
| 7 | v0 | kukkiri / tiratira | 26 | 72% |
| 8 | a0 | gosogoso / katakata | 25 | 69% |
| 9 | v7 | bonyari / kiritto | 25 | 69% |
| 10 | i5 | nobinobi / harahara | 25 | 69% |
| 11 | a3 | ziriziri / syakisyaki | 24 | 67% |
| 12 | a6 | dosari / katitto | 24 | 67% |
| 13 | v5 | busuri / nikoniko | 24 | 67% |
| 14 | i9 | yuttari / dokidoki | 24 | 67% |
| 15 | a4 | zuruzuru / poripori | 23 | 64% |
| 16 | i0 | unzari / wakuwaku | 23 | 64% |
| 17 | a8 | bosori / kyaakyaa | 22 | 61% |
| 18 | a1 | sitosito / batyabatya | 21 | 58% |
| 19 | v1 | kurikuri / gizagiza | 21 | 58% |
| 20 | v3 | pitari / hirahira | 21 | 58% |
| 21 | i4 | tyanto / dogimagi | 21 | 58% |
| 22 | v6 | hunwari / gotugotu | 20 | 56% |
| 23 | v9 | mukumuku / bosabosa | 20 | 56% |
| 24 | i1 | gennari / gatugatu | 20 | 56% |
| 25 | i6 | nonbiri / girigiri | 20 | 56% |
| 26 | i7 | hokkori / zokuzoku | 20 | 56% |
| 27 | i8 | hotto / dokiri | 20 | 56% |
| 28 | a5 | sororisorori / dotabata | 18 | 50% |
| 29 | v4 | bissiri / barabara | 17 | 47% |
| 30 | i2 | syobon / runrun | 13 | 36% |

Note the shape: auditory pairs cluster at the top, interoceptive at the bottom, but with crossovers (i3 is 4th-easiest; a5 is at chance) — useful for "exceptions make it interesting" copy and for within-modality difficulty ordering.

## 5. Per-pairing mean iconicity ratings (Figure 14) — 7-point scale

**[chart-read]** throughout. The Rating Task rated **one word of each pair** (30 rating trials). **Confirmed from raw Gorilla data (2026-06-11): the rated word is exactly the Choosing Task's target word for that pairing** — so per-pairing accuracy and rating refer to the *same word*, making the divergence stats below clean same-word comparisons.

i9 5.8 · i5 5.0 · a4 4.95 · i3 4.9 · a3 4.85 · i8 4.8 · i7 4.75 · i4 4.7 · v0 4.65 · v7 4.6 · a1 4.5 · v5 4.45 · v3 4.4 · v8 4.35 · a5 4.3 · v2 4.15 · a2 4.1 · v6 4.1 · v9 4.05 · i2 4.0 · v1 3.95 · a7 3.9 · a9 3.85 · a0 3.8 · v4 3.8 · i6 3.7 · i1 3.6 · a6 3.3 · i0 3.25 · a8 3.2

Divergence highlights (rating rank vs accuracy rank): i9 (1st rated, 14th guessed), a9 (23rd rated, 1st guessed), a7 (22nd rated, 2nd guessed), i5 (2nd rated, 10th guessed). These are ready-made "your gut vs your reflection" stats for Rating Lab.

## 6. Practice items (Appendix B / Table 3) — for the practice-rounds feature

| Pair | Modality | Hiragana word | Meaning | Katakana word | Meaning |
|---|---|---|---|---|---|
| p0 | auditory | そっと sotto | softly, gently | ガタン gatan | with a bang |
| p1 | visual | じっと zitto | motionless, fixedly | パッ patto | suddenly, in a flash |
| p2 | auditory | そろそろ sorosoro | slowly, quietly | ガンガン gangan | clanging, banging |
| p3 | visual | そっくり sokkuri | exactly alike, spitting image | ガラリ garari | completely, totally changed |

No interoceptive practice pairs existed. Practice responses were never recorded for analysis; in the thesis, practice correct answers were *not* revealed — the app may deliberately diverge here (revealing feedback on practice rounds is better game UX) but that divergence should be a conscious decision.

## 7. Fidelity notes — where the app already diverges from the thesis

1. **Prompt structure:** thesis trials showed *one* target English gloss; the app shows both glosses ("One of them means X / The other means Y") plus the canonical question. Known, accepted divergence.
2. **Feedback:** thesis gave none during the Choosing Task; the app gives immediate feedback. Accepted (it's a game).
3. **Condition assignment:** thesis randomized/counterbalanced between subjects; the app lets players choose (Script Lab). Accepted, documented in project instructions.
4. **Rating coverage:** thesis rated one word per pair; Rating Lab can and probably should rate both words — note this as an extension, not a replication.
5. The seed gloss typo "feeling fo relief" originates in the thesis Appendix B itself (i3, sukkiri). Seed already fixed; thesis is the historical source.
6. **Target selection:** the thesis fixed the target word per pairing (alternating canonical script by pairing parity — see §10). The app's deterministic-shuffle roadmap item randomizes target *position*; whether to also randomize *which word is the target* is an open design decision. Randomizing it doubles the effective item pool, but thesis difficulty stats cover only the fixed targets and would no longer map one-to-one onto trials.

## 8. Difficulty-tier proposal for Modality Ladder

Two stacked signals: modality (between floors) and per-pair accuracy (within floors).

- **Floor 1 — Sound** (auditory, mean 6.86/10): order trials easy→hard within floor: a9, a7, a2, a0, a3, a6, a4, a8, a1, a5.
- **Floor 2 — Sight** (visual, 6.42/10): v2, v8, v0, v7, v5, v1, v3, v6, v9, v4.
- **Floor 3 — Inner states** (interoceptive, 5.97/10): i3, i5, i9, i0, i4, i1, i6, i7, i8, i2.
- Boss-pair flavor: end each floor with its hardest pair (a5, v4, i2) — all three sit at or below chance, which the copy can say honestly ("most players do no better than a coin flip here").
- Frame floors with the implicational hierarchy (Dingemanse 2012; McLean 2021 revised: SOUND < MOVEMENT < FORM < TEXTURE < OTHER). Future floors from inventory expansion slot in as Movement / Form / Texture between Sound and Inner states.

## 9. Landing/marketing copy facts (all verifiable against thesis)

- "People who've never studied Japanese guess these words correctly ~64% of the time. Pure chance would be 50%. Can you beat 64%?"
- "Sound words are easiest, feelings are hardest — accuracy slides from ~69% on sound words to ~60% on inner-state words." (6.86/6.42/5.97 out of 10)
- "The word people *felt* was most iconic — dokidoki, a racing heartbeat — wasn't one they could reliably guess. Your gut and your reflection disagree."
- "Seeing the Japanese script didn't help people guess — but it changed how iconic the words felt." (accuracy: no condition effect; ratings: audio-only 4.50 vs script 4.15)
- "The hardest word in the study: shobon (downhearted). Only 36% got it right — worse than flipping a coin."
- Script Lab framing rule (already in project instructions): "presentation changes the experience," never "matched script helps."

## 10. Raw-data verification (Gorilla exports v18–v20, analyzed 2026-06-11)

Three export versions were recovered and combined (`data_exp_220893-v18/19/20`, task `ixsq` = Choosing, `r3iq` = Rating). They contain **25 complete participants** (C1=2, C2=11, C3=12; 750 trials per task) of the thesis's 36 (C1=11, C2=13, C3=12). The missing 9 audio-only and 2 congruent participants are presumably in later exports (v21+), consistent with C1 collection resuming after the v18 audio-only display-file bug. Tidy per-trial CSVs and a per-pair stats file are archived alongside this doc.

**Mechanisms confirmed from raw data:**
1. **Target word is fixed per pairing and alternates by pairing parity**: even pairings (a0, a2, … i8) target the hiragana-canonical word; odd pairings (a1, a3, … i9) target the katakana-canonical word. So Figure 10's per-"ideophone" accuracy is per *target word* (e.g. v2's 83% is for guessing *donyori*, not *kirakira*).
2. **Left/right position randomized per participant** (target Left 383 / Right 367 across the subset).
3. **Rated word = target word** for all 30 pairings (see §5).
4. Stimulus file scheme: `<pairing><canonical script><displayed script>-<romaji>.mp4`, displayed ∈ {h, k, u, d} where u/d are the audio-only placeholder symbols (▽/△). Matches the seed's prefix ground truth.

**Subset replication of headline stats** (validates the chart-read tables): overall accuracy 64.9% (thesis 64%); rating grand mean 4.25 (thesis 4.26); rating modality means 4.49/4.19/4.08 interoceptive/visual/auditory (thesis 4.45/4.24/4.08); modality accuracy auditory 6.84 / visual 6.72 / interoceptive 5.92 out of 10 (thesis 6.86/6.42/5.97 — visual differs most, expected with 11 participants missing). Per-pair Spearman rank correlation between subset accuracy and chart-read Figure 10: ρ = 0.84. Condition-level C1 numbers from the subset are unusable (n=2). **The §4/§5 chart-read values remain the best estimates of the published figures until v21+ exports surface.**

**New reference stats the thesis never reported** (from the subset): Choosing Task response times — median 13.2 s, mean 18.9 s, p10 8.5 s, p90 31.3 s; correct and incorrect answers took essentially the same time (medians 13.3 vs 12.9 s). Useful as a calibration baseline once the app collects its own `responseTimeMs` (expect app players to be much faster — no mandatory dual audio playback wait).

## 11. Remaining open items

1. Locate v21+ Gorilla exports to recover the missing 11 participants and replace chart-read values with exact ones (nice-to-have; nothing on the roadmap blocks on it).
2. Identify which audio-only display file was buggy in v18 and whether that version's single C1 participant was excluded from the thesis analysis.
3. **Dataset provenance (corrected per author, 2026-06-11):** the "top-600" list is the NLB/BCCWJ ideophone list (includes moraic structure per word). The **perceptual-strength norms are a separate dataset** (Iida & Akita 2023, ~500+ words) and were the main source of the modality classifications — with the author's caveat that many entries are arguably not ideophones or not the claimed modality, with much cross-modal overlap; classifications were used selectively to find defensible unimodal items. The pairing pipeline (roadmap step 5) therefore needs **both** datasets joined, and its modality assignments inherit the norms' noisiness — human review per generated pair is not optional.

## 12. References the app's research notes can cite

Dingemanse (2012) implicational hierarchy; McLean (2021, *Linguistic Typology*) revised hierarchy SOUND < MOVEMENT < FORM < TEXTURE < OTHER SENSORY PERCEPTIONS, Japonic elicitation; McLean, Dunn & Dingemanse (2023) guess-vs-rating dissociation, TTS voice provenance; Ćwiek et al. (2021) cross-linguistic unimodal iconicity; Iida & Akita (2023) perceptual-strength norms; Ahlner & Zlatev (2010) fictive-word iconicity; Hamano (1998) Japanese sound-symbolic system.
