package lecture_notes.lecture7;

public class Collections {
    /*
    # Lecture 5.3 - Collections
It is extremely common in software development to encounter a need for working with a collection of objects. It may be a list of customers, players in a game, or cars in an automated road toll system. So far, we have talked about the `Array` class and how it can be implemented to hold collections of objects. While arrays are useful base language objects, they are inconvenient in several ways. First, they are static, meaning that once we initialize them their size cannot change. This means that it is very complicated to use arrays for any kind of collection which you can expect to grow or decrease over time. Imagine e.g. a list of customers in a store. Naturally, you would like your software to be able to add new customers to your collection as they are entered into the system. This is where the `Collection` interface enters the playfield.

## The baseline Collection class
There are different kinds of `Collection`, depending on what properties you want your collection to have. We will go through them one by one in this chapter. Some methods are baseline for all kinds of collections. Here is a quick guide for some of the most useful ones (they are all relatively self-explanatory):
<ul>
<li><code>add()</code>: adds an object to the collection.</li>
<li><code>remove()</code>: removes an objet from the collection.</li>
<li><code>contains()</code>: returns <code>true</code> if the object exists within the collection.</li>
<li><code>size()</code>: returns the number of elements in a collection as an integer.</li>
<li><code>isEmpty()</code>: returns <code>true</code> if a collection has zero elements.</li>
</ul>

Beyond the baseline `Collection` interface, there are numerous subinterfaces: e.g. `Set`, `List`, `Queue` and `Map`. Let's go through them one at a time:

## Set
A `Set` has no added methods apart from the baseline `Collection`. The only difference is that a `Set` does not allow any duplicate objects. If you use the `add()` method to add an element that already exists in the `Set`, then the `add()` method will return `false`. Further refinements of `Set` include `SortedSet`, which is simply a `Set` that maintains a certain order between its elements. Essentially and ordered list which does not allow duplicate elements.

## List
A `List` is very similar to the already-mentioned `Array`. It is an ordered list of elements, but contrary to `Array`, it provides ways to add, remove, or manipulate elements in the list. Some key methods of a `List` are:
<ul>
<li><code>add(E element)</code>: adds an element to <i>the end</i> of the list.</li>
<li><code>add(int index, E element)</code>: adds an element at the <i>specified position</i> (given by the integer <code>index</code>) in the list.</li>
<li><code>remove(int index)</code>: removes the element at the specified position.</li>
<li><code>set(int index, E element)</code>: changes the element at the specified position to the provided element.</li>
<li><code>get(int index)</code>: returns the element at the specified position.</li>
</ul>

## Queue
`Queue` is an ordered list that has methods related to buffering of objects. A `Queue` keeps a notion of a "top" element, which is next in line. It is useful for e.g. holding user input while waiting for the system to handle previous input, or perhaps a web-shop that implements a digital queue for customers waiting on a specific release. A typical example that many people have experienced is the release of greatly anticipated concert tickets. A `Queue` can be implemented either as "first in, first out" or "last in, first out", depending on the use-case. Here are some key methods in `Queue`:
<ul>
<li><code>offer(E element)</code>: attempts to enter the specified element into the queue.</li>
<li><code>poll()</code>: removes the element at the top of the queue and returns it. Returns `false` if the queue is empty (compared to <code>remove()</code> which throws an Error!)</li>
<li><code>peek()</code>: returns the element at the top of the queue (without removing it!).</li>
</ul>

## Map
`Map` is a set of key:value pairs. In other programming languages, they may be referred to as "associative arrays" or "dictionaries" (this is the term that Python uses). A key:value pair consists of two parts, a <i>key</i> and its respective <i>value</i>. Think of it as a kind of look-up table; for each key, there is a distinct value. It can be e.g. a list of cities in a country, where each city name is a key `String`, and each city's population is a value `integer`. E.g <code>\<"Gothenburg", 579281></code>. In this case, the value of "Gothenburg" can be retreived by asking for its key.

Some of the key (no pun intended!) methods in `Map` are:
<ul>
<li><code>put(K key, V value)</code>: adds a specified key:value pair to the map. Replaces any pre-existing value.</li>
<li><code>get(K key)</code>: returns the value corresponding to the specified key.</li>
<li><code>remove(K key)</code>: removes the key:value pair associated with the specified key.</li>
<li><code>keySet()</code>: returns a `Set` with all of the keys in the map.</li>
<li><code>values()</code>: returns a `Collection` with all of the values in the map.</li>
</ul>

Beyond `Map` there is also the child interface `SortedMap`, which, just as it sounds like, is a `Map` that maintains a certain order between the key:value pairs.



     */
}
