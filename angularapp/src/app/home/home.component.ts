import { HttpClient, HttpParams } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeService } from '../service/Home/home.service';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css'],
  })
export class HomeComponent implements OnInit {
    allProducts:any;
    productDetails=[{
    productId:'',
    imageUrl:'',
    productName:'',
    price:'',
    description:'',
    quantity:''
    }]

    id='';
    constructor(private http: HttpClient, private router: Router, private userData: HomeService){ }

    ngOnInit(): void {
        this.userData.getProductDetails().subscibe((data:any)=>{
            this.allProducts = data;
            console.log(this.allProducts);
            this.productDetails = this.allProducts;
        })
    }

    productDetails = (data:any) => {
        for(let i=0;i<this.productDetails.length;i++){
            if(this.productDetails[i].productName===data){
                this.id = this.productDetails[i].productId;
            }
        }
        this.userData.getProductSingleDetails(this.id).subscribe((res) => {
            if(res != null){
                this.productData.setProduct(res);
                this.router.navigate(['home/getProduct',this.id])
            }
        })
    }
}