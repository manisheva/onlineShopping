import { Injectable } from '@angular/core';

//Intialize with default values..
const vehicles = [
    {
        id: 1,
        name: 'Trailer - 1',
        type: 'Truck',
        mass: 40
    },
    {
        id: 2,
        name: 'An-2',
        type: 'Plane',
        mass: 5
    },
    {
        id: 3,
        name: 'LandCruiser 80',
        type: 'Jeep',
        mass: 2
    },
];
//End of Intialization

@Injectable({
    providedIn: 'root'
})
export class VehiclesService {

    private vehicles;

    constructor() {
        this.vehicles = vehicles;
    }

    getVehicles() {
        return this.vehicles;
    }

}
