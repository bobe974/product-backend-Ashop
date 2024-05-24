# Product-backend-Api

Product-backend-Api is a backend application for managing products with Spring Boot.

## Prerequisites

Make sure you have the following installed on your system:
- Docker

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/bobe974/product-backend-Ashop.git
    ```

2. Navigate to the `src/main/resources` directory where the `docker-compose.yml` file is located:
    ```bash
    cd product-backend-Ashop/src/main/resources
    ```

3. Start Docker.

4. Run the following command to start the API with Docker:
    ```bash
    docker-compose up
    ```
## API Usage
[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://god.gw.postman.com/run-collection/23479711-d5a7f110-f975-4d98-84a0-579ecb61191b?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D23479711-d5a7f110-f975-4d98-84a0-579ecb61191b%26entityType%3Dcollection%26workspaceId%3Daac4f865-a9a6-407e-b37e-4b0e4cacfd35)
```sh
GET /api/products          # Retrieve the list of products
GET /api/products/{id}     # Retrieve a product by its ID
POST /api/products         # Add a new product
PATCH /api/products/{id}   # Update an existing product
DELETE /api/products/{id}  # Delete a product
```
## Ports Used
API: ```3000```
PostgreSQL: ```5432```

## Kanban Board
You can view the project Kanban board [Kanban Board](https://github.com/users/bobe974/projects/3)
.