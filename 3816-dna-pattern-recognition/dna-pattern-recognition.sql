# Write your MySQL query statement below
Select *,count(case when dna_sequence like 'ATG%' then 1 end) as has_start,
count(case when (dna_sequence like '%TAA' or dna_sequence like '%TAG'  or dna_sequence like '%TGA' )then 1 end ) as has_stop,
count(case when dna_sequence like '%ATAT%' then 1 end) as has_atat,
count(case when dna_sequence like '%GGG%' then 1 end) as has_ggg
FROM Samples
group by sample_id;