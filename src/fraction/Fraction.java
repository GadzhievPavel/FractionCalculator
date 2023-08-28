package fraction;

public class Fraction {
    //числитель
    private int numenator;
    //знаменатель
    private int denumenator;

    public Fraction() {
        this.numenator = 1;
        this.denumenator = 1;
    }

    public Fraction(int numenator, int denumenator){
        this.numenator = numenator;
        this.denumenator = denumenator;
        this.reduction();
    }

    public Fraction plus(Fraction fraction){
        this.commonDenumenator(fraction);
        Fraction result = new Fraction(this.numenator + fraction.numenator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }

    public Fraction minus(Fraction fraction){
        this.commonDenumenator(fraction);
        Fraction result = new Fraction(this.numenator- fraction.numenator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }
    private void commonDenumenator(Fraction fraction){
        int commonDenominator = this.denumenator * fraction.denumenator;
        this.numenator*= fraction.denumenator;
        fraction.numenator*=this.denumenator;
        this.denumenator = commonDenominator;
        fraction.denumenator = commonDenominator;
    }

    public void reduction(){
        int div = 0;
        if(this.numenator< this.denumenator){
            div = this.numenator;
        }else{
            div = this.denumenator;
        }
        for(int i = div; i>1; i--){
            if(this.numenator%i == 0 && this.denumenator%i==0){
                this.denumenator/=i;
                this.numenator/=i;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return numenator+"/"+denumenator;
    }
}
