# Guitar_Shop_Management

# 🎸 Musical Instrument Inventory System

A simple object-oriented Java application that manages a music store's inventory of instruments (guitars, mandolins, banjos, etc.). This project demonstrates clean architecture principles such as encapsulation, inheritance, composition, and extensibility using a flexible and scalable design.

---

## 📚 Project Overview

This system allows users (e.g., music store clients) to search for musical instruments based on specific properties such as builder, wood types, number of strings, and more. The application is designed to support multiple instrument types and to allow flexible search criteria through a unified `InstrumentSpec`.

---

## 🧭 Flow of the Program

1. **Inventory Initialization**  
   The inventory is populated with several instruments using the `initializeInventory()` method.
   - Each instrument is defined by a `serialNumber`, `price`, and an `InstrumentSpec` which contains its technical properties.

2. **Client Specification**  
   A user specifies their desired instrument via an `InstrumentSpec`, implemented as a map of properties (`builder`, `type`, `wood`, etc.).

3. **Search Execution**  
   The inventory is queried with this `InstrumentSpec`. The system searches for instruments with matching properties using `InstrumentSpec.matches()`.

4. **Result Presentation**  
   If any instruments match the client's preferences, their details are printed to the console. If none are found, a message is displayed.

---

## ✨ Features
- Flexible search based on any combination of properties

- Easy to add new instrument types (e.g., violin, piano)

- Clean separation between specs and instrument data

---

## 📌 Future Improvements
- Replace raw Map in InstrumentSpec with generics for type safety

- Implement design patterns

- Persist inventory to a database or JSON file

- Add a UI or REST API interface

- Improve error handling and logging

- Add unit tests