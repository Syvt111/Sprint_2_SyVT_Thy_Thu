import {Component, OnInit} from '@angular/core';
import {render} from 'creditcardpayments/creditCardPayments';

@Component({
  selector: 'app-pay-pal',
  templateUrl: './pay-pal.component.html',
  styleUrls: ['./pay-pal.component.css']
})
export class PayPalComponent implements OnInit {

  constructor() {
  }

  ngOnInit(): void {

    render(
      {
        id: '#myPaypalButtons',
        currency: 'VND',
        value: '100.00',
        onApprove: (details => {
          alert('Thành công');
        })
      });
    this.view();
  }

  view(): void {
    const element = document.getElementById('myPaypal');
    if (element) {
      element.scrollIntoView();
    }
  }
}
