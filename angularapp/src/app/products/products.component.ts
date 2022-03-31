import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
 products:any;
  constructor() { }

  ngOnInit(): void {
    this.products=[{
"item":"Tomato",
"price":20,
"quantity":2,
"total":40
    },
    {
      "item":"Potato",
      "price":30,
      "quantity":1,
      "total":30
    },
          {
            "item":"Onion",
            "price":40,
            "quantity":5,
            "total":200
                },
                {
                  "item":"Cucumber",
                  "price":20,
                  "quantity":2,
                  "total":40
                      }]
  }

}
