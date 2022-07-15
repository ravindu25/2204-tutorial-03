object Q1 extends App{
    def calculate_discount(price:Double):Double={
        return price*0.4
    }
    def calculate_shipping_fee(qty:Double):Double={
        if(qty>50){
            return 50*3+((qty-50)*0.75)
        }
        else{
            return qty*3
        }
    }

    def calculate_total(qty:Int):Double={
        return 24.95*qty-calculate_discount(24.95*qty)+calculate_shipping_fee(qty)
    }

    println(calculate_total(60));
}