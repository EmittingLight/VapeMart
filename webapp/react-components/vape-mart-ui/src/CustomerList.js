

// CustomerList.js
import React, { useEffect, useState } from 'react';
import axios from 'axios';

function CustomerList() {
    const [customers, setCustomers] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8081/customers')
            .then((response) => {
                setCustomers(response.data);
            })
            .catch((error) => {
                console.error('Ошибка при загрузке данных клиентов:', error);
            });
    }, []);

    return (
        <div>
            <h2>Список клиентов</h2>
            <ul>
                {customers.map((customer) => (
                    <li key={customer.id}>{customer.name}</li>
                ))}
            </ul>
        </div>
    );
}

export default CustomerList;

