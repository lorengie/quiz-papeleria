# quiz-papeleria
#  Documentación de APIs - Papelería
### 1. **Obtener ventas por empleado con datos de cliente**
`GET /api/ventas/empleado/{id}/clientes`
### `Ruta de enlace por postman http://localhost:8080/api/ventas/empleado/1/clientes`

#### 📋 Parámetros
| Parámetro | Tipo   | Descripción          |
|-----------|--------|----------------------|
| id        | Long   | ID del empleado      |

#### Respuesta Exitosa (200)
```json
[
  {
    "id_venta": 22,
    "fecha": "2025-01-14",
    "cliente": {
      "id_cliente": 70,
      "nombre": "Nicholas Davis",
      "cedula": "9296422184",
      "telefono": "807.194.1521",
      "correo": "debra15@smith.biz"
    },
    "empleado": {
      "id_empleado": 1,
      "nombre": "Katherine Zimmerman",
      "cargo": "Vendedor",
      "telefono": "845-231-4664x8897"
    }
  }
]
```
### 2 Obtener productos por proveedor
#### 📋 Parámetros
| Parámetro | Tipo   | Descripción      |
|-----------|--------|------------------|
| id        | Long   | ID del proveedor |

### Ruta hecha por postman 
` http://localhost:8080 /api/productos/proveedor/2`
#### Respuesta Exitosa (200)
### 
```json
[
  {
    "id_producto": 8,
    "nombre": "Light",
    "descripcion": "Really economy customer hit language.",
    "precio": 70.43,
    "stock": 86,
    "proveedor": {
      "id_proveedor": 2,
      "nombre": "Williams, Booth and Whitney",
      "telefono": "114-013-7361",
      "correo": "olsenbrandon@guerrero.com",
      "direccion": "16580 Jonathan Forest Apt. 110\nSingletonchester, MI 29470"
    }
  }
]
```
### 3. Obtener detalles de venta con clientes
### Ruta hecha por postman
` http://localhost:8080 /api/productos/proveedor/2`
## Respuesta exitosa(200)
```json
[
  {
    "id_detalle": 1,
    "venta": {
      "id_venta": 51,
      "fecha": "2025-02-16",
      "cliente": {
        "id_cliente": 100,
        "nombre": "Lori Mayo",
        "cedula": "5901514344",
        "telefono": "526-258-9115",
        "correo": "peterandrews@brandt-friedman.com"
      },
      "empleado": {
        "id_empleado": 38,
        "nombre": "Christine Browning",
        "cargo": "Cajero",
        "telefono": "(336)047-7787x24837"
      }
    }
  }
]
```
## 4 Ventas por Empleado en Rango de Fechas

`GET /api/ventas/empleado/{id}/fecha`

Obtiene todas las ventas realizadas por un empleado específico dentro de un rango de fechas.

## Parámetros

| Parámetro | Tipo       | Requerido | Formato      | Descripción                     |
|-----------|------------|-----------|--------------|---------------------------------|
| id        | `Long`     | Sí        | Número       | ID del empleado                 |
| inicio    | `LocalDate`| Sí        | `YYYY-MM-DD` | Fecha inicial del rango         |
| fin       | `LocalDate`| Sí        | `YYYY-MM-DD` | Fecha final del rango           |

## Ruta por postman 

```bash
GET http://localhost:8080/api/ventas/empleado/1/fecha?inicio=2025-01-01&fin=2025-12-31 
```
### Respuesta exitosa(200)
```json
[
  {
    "id_venta": 22,
    "fecha": "2025-01-14",
    "cliente": {
      "id_cliente": 70,
      "nombre": "Nicholas Davis",
      "cedula": "9296422184",
      "telefono": "807.194.1521",
      "correo": "debra15@smith.biz"
    },
    "empleado": {
      "id_empleado": 1,
      "nombre": "Katherine Zimmerman",
      "cargo": "Vendedor",
      "telefono": "845-231-4664x8897"
    }
  }
]
```
    
