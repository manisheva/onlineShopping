import { Component, OnInit } from '@angular/core';
import { Vehicle } from 'src/app/model/vehicle';
import { VehiclesService } from "src/app/vehicles.service";

@Component({
    selector: 'app-vehicle-list',
    templateUrl: './vehicle-list.component.html',
    styleUrls: ['./vehicle-list.component.css'],
    providers: [VehiclesService]
})
export class VehicleListComponent implements OnInit {
    vehicles: Vehicle[];
    // constructor() { }
    constructor(private vehiclesService: VehiclesService) {
         this.vehicles = this.vehiclesService.getVehicles(); 
        }

    ngOnInit() {
    }

}
