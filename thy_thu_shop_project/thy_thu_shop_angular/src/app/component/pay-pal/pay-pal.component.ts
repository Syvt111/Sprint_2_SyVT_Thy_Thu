import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-pay-pal',
  templateUrl: './pay-pal.component.html',
  styleUrls: ['./pay-pal.component.css']
})
export class PayPalComponent implements OnInit {
  private paypal: any;

  constructor() {
  }

  ngOnInit(): void {
    this.addPaypalScript().then(() => {
      this.paypal.Buttons({
        createOrder: (data, actions) => {
          // Set up the transaction
          return actions.order.create({
            purchase_units: [
              {
                amount: {
                  value: '10.00'
                }
              }
            ]
          });
        },
        onApprove: (data, actions) => {
          // Capture the funds from the transaction
          return actions.order.capture().then(details => {
            // Show a success message to the buyer
            console.log('Transaction completed by ' + details.payer.name.given_name);
          });
        }
      }).render('#paypal-button-container');
    });
  }

  addPaypalScript() {
    return new Promise(resolve => {
      const scriptElement = document.createElement('script');
      scriptElement.src = 'https://www.paypal.com/sdk/js?client-id=<YOUR_CLIENT_ID>&currency=USD';
      scriptElement.onload = resolve;
      document.body.appendChild(scriptElement);
    });
  }
}
