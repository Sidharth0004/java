public class pairingfriends {
    public static int friendPairing(int n){
        if (n==1 || n==2) {
            return n;
        }

        //choice
        //single
        int fnm1 = friendPairing(n-1);

        //pair
        int fnm2=friendPairing(n-2);
        int pairWays=(n-1)*fnm2;
        int totWays = pairWays+fnm1;
        return totWays;
       //    return friendPairing(n-1) + (n-1)*friendPairing(n-2);

    }
    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
}
