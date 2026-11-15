public class main{
    public static void main(String[] args){
        // Practice exercise - 1
        // int l = 5;
        // int b = 7;
        // int area = l*b;
        // int perimeter = 2*(l + b);
        // System.out.printf("area of rectangle is %d and permimeter is %d", area, perimeter);

        // Practice exercise - 2

        double cp1 = 1000;
        double cp2 = 1000;

        double loss1 = 10;
        double profit2 = 20;

        double sp1 = cp1 - (cp1 * loss1 / 100);
        double sp2 = cp2 + (cp2 * profit2 / 100);

        double totalCP = cp1 + cp2;
        double totalSP = sp1 + sp2;

        double netProfit = totalSP - totalCP;
        double profitPercentage = (netProfit / totalCP) * 100;

        System.out.println("Total Cost Price = " + totalCP);
        System.out.println("Total Selling Price = " + totalSP);
        System.out.println("Net Profit = " + netProfit);
        System.out.println("Profit Percentage = " + profitPercentage + "%");
    }
}