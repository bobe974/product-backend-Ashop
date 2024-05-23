# Product-backend-Api

Product-backend-Api is a backend application for managing products with Spring Boot.

## Prerequisites

Make sure you have the following installed on your system:
- Docker

## Setup

1. Open a console in the `src/main/resources` directory where the `docker-compose.yml` file is located.
2. Start Docker and run the following command to start the API with Docker:

```sh
docker-compose up -d
```
## API Usage
[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://god.gw.postman.com/run-collection/23479711-d5a7f110-f975-4d98-84a0-579ecb61191b?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D23479711-d5a7f110-f975-4d98-84a0-579ecb61191b%26entityType%3Dcollection%26workspaceId%3Daac4f865-a9a6-407e-b37e-4b0e4cacfd35)
```sh
GET /api/products          # Retrieve the list of products
GET /api/products/{id}     # Retrieve a product by its ID
POST /api/products         # Add a new product
PATCH /api/products/{id}   # Update an existing product
DELETE /api/products/{id}  # Delete a product

