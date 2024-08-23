Spring Boot Simple API Project
Overview
This project is a basic implementation of a RESTful API using Spring Boot. It demonstrates fundamental CRUD (Create, Read, Update, Delete) operations for managing vendor data. The API includes endpoints to create, read, update, and delete vendor information.

Project Details
Framework: Spring Boot
Controller Class: VendorController
Base URL: /CloudVendor
Endpoints
Get Vendor by ID

Method: GET
URL: /CloudVendor/{vendorID}
Description: Retrieves a vendor by its ID. Currently returns a static vendor object.
Create Vendor

Method: POST
URL: /CloudVendor
Description: Creates a new vendor from the request body and stores it.
Update Vendor

Method: PUT
URL: /CloudVendor
Description: Updates an existing vendor with the data provided in the request body.
Delete Vendor

Method: DELETE
URL: /CloudVendor/{vendorID}
Description: Deletes the vendor identified by the provided ID.
