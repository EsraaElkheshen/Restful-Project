# Restful Booker

![Restfull Booker Logo](download.png)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Environment Variables](#environment variables)
- [Requirements](#requirements)
- [Running the Collection](#running the collection)


## Introduction

- This repository contains a complete **Postman collection** for testing the **Restful-Booker** API.
- It includes authentication, creating bookings, retrieving bookings, updating, and deleting bookings.  
- Each request has detailed test scripts for validating response structure, response times, status codes, and data integrity.


## Examples

### Local testing execution example

![Local testing execution example](execuation.gif)

## Features

✅ Create authentication token (Auth - CreateToken)  
✅ Create new bookings with randomized data  
✅ Retrieve, update, and delete bookings dynamically  
✅ Store and reuse data between requests (token, booking ID, etc.)  
✅ Automated test scripts for:
- Status code verification
- Response time validation
- Response body structure checks
- Header validations
- Field matching between request and response

✅ Pre-request scripts for setting up random test data


## Environment Variables

- `{{URL}}` → Base URL for the API (e.g., `https://restful-booker.herokuapp.com`)
- `{{token}}` → Token generated after login (used for updating and deleting bookings)
- `{{bookingid}}` → Booking ID created dynamically

The collection uses **collection variables** and **random data generation** for some fields like first name, last name, and dates.

## Requirements

- **Postman** latest version installed
- **Newman** (optional, for running tests from command line)


## Running the Collection

### Option 1 — Import and Run from Postman

1. Download the `Restful-Booker.postman_collection.json` file.
2. Import the collection into Postman.
3. Set up the required variables (Base URL, Token if needed).
4. Run individual requests or the full collection using **Collection Runner**.

### Option 2 — Run via Newman (Command Line)

```bash
newman run Restful-Booker.postman_collection.json