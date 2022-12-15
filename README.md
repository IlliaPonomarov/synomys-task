
## Resolve of interview task "Synonyms"
In this task, your job will be to write a program that can decide whether two words are synonyms or not. You will get a
synonym dictionary describing pairs of synonymous words. Afterwards, you will answer several queries asking whether
given two words are synonyms or not.
Use the following rules to decide:
1. If the pair of words is declared synonymous in the input, then they are synonyms.
2. Being synonyms doesn’t depend on order, e.g. if big is a synonym for large then large is a synonym for big.
3. We can derive the synonymous relationship indirectly: if big is a synonym for large and large is a synonym for huge
then big is a synonym for huge.
4. If two words differ only by case, they are synonyms, e.g. same is a synonym for both SAmE, SAME and also same
(itself).
5. If none of the above rules can be used to decide whether two words are synonyms, then they are not.
Input
Input starts with a number of test cases T(0 ≤ T≤ 100). Each test case begins with a line containing a single number N (0
≤ N ≤ 100) — the length of a synonym dictionary. On each of the following N lines, there is exactly one pair of synonyms
separated by a single space. Next line contains a single number Q (0 ≤ Q ≤ 100) — number of queries. Each of the
following lines contains a pair of query words separated by a single space.
Each word consists only of English alphabet letters ([a-zA-Z]) and is at most 20 characters long.
Output
For each pair of query words output either string synonyms or differen

## Resolve

### Algorithm
The algorithm is based on the following rules:
1. In start consumer enter first value - number of cases and number of queries. ( Number of Cases is the values who will be parsed. ). Number of queries is the number of pairs of words that will be compared.
2. After that consumer enter the pairs of words. ( The pairs of words are synonyms ).
3. After that consumer enter the pairs of words, we parsed page [thesaurus.com](https://www.thesaurus.com/) and got of synonyms of first word. If the second word is in the list of synonyms, then the words are synonyms. If not, then the words are not synonyms.
4. If first and second word are the same, then the words are synonyms.

### How idenified synonyms
First, I parsed the site [thesaurus.com](https://www.thesaurus.com/) and got the synonyms of the first word. If the second word is in the list of synonyms, then the words are synonyms. If not, then the words are not synonyms.

### Parsed Website 
To search for synonyms for the word , I used the site [thesaurus.com](https://www.thesaurus.com/) to parse synonyms.

### Libraries
I used the following libraries:
- [Jsoup](https://jsoup.org/) - for parsing html
- [JUnit](https://junit.org/junit5/) - for testing
- [Maven](https://maven.apache.org/) - for building project
